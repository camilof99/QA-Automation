const express = require("express");
const bodyParser = require('body-parser');
const { Pool } = require("pg");
const jwt = require('jsonwebtoken');

const app = express();

app.use(bodyParser.json());

const pool = new Pool({
    user: 'postgres',
    host: 'localhost',
    database: 'heroesdbapi',
    password: 'camilo99',
    port: 5432
});

app.post('/api/heroes', (req, res) => {

    const token = req.headers.authorization.split(' ')[1];
    console.log(token);
    const key = 'ok';

    jwt.verify(token, key, (err, decoded) => {
        if (err) {
            res.status(401).json({ mensaje: 'Token inválido...' })
        } else {
            const { name, alias, superpowers } = req.body;

            const query_sql = {
                text: `INSERT INTO heroes (name, alias, superpowers) VALUES ($1, $2, $3)`,
                values: [name, alias, superpowers]
            }

            pool.query(query_sql, (error, results) => {
                if (error) {
                    throw error;
                }
                res.send(req.body);
            });
        }
    })

});

app.get('/api/heroes', async (req, res) => {
    try {
        const client = await pool.connect();
        const results = await client.query('SELECT * FROM heroes');
        const heroes = results.rows;
        const heroesJson = { heroes: heroes };
        res.send(heroesJson);
    } catch (error) {
        console.log(error);
        res.send("Error: " + error);
    }
});

app.get('/api/heroes/:id', async (req, res) => {
    const { id } = req.params;
    try {
        const client = await pool.connect();
        const result = await client.query('SELECT * FROM heroes WHERE id = $1', [id]);

        if (result.rows.length === 0) {
            return res.status(404).json({ msg: "Hero no existe..." })
        }
        const { name, alias, superpowers } = result.rows[0];
        const heroeJson = { id, name, alias, superpowers };

        res.json(heroeJson);
    } catch (error) {
        console.log(error);
        res.status(500).send("Server Error: " + error);
    }
});

app.patch('/api/heroes/:id', async (req, res) => {
    const token = req.headers.authorization.split(' ')[1];
    console.log(token);
    const key = 'ok';

    const { id } = req.params;

    jwt.verify(token, key, (err, decoded) => {
        if (err) {
            res.status(401).json({ mensaje: 'Token inválido...' })
        } else {
            const { name, alias, superpowers } = req.body;

            const query_sql = {
                text: `UPDATE heroes SET name = $1, alias = $2, superpowers = $3 WHERE id = $4`,
                values: [name, alias, superpowers, id]
            }

            pool.query(query_sql, (error, results) => {
                if (error) {
                    throw error;
                }
                res.send(req.body);
            });
        }
    })
});

app.delete('/api/heroes/:id', async (req, res) => {
    const token = req.headers.authorization.split(' ')[1];
    console.log(token);
    const key = 'ok';

    const { id } = req.params;

    jwt.verify(token, key, (err, decoded) => {
        if (err) {
            res.status(401).json({ mensaje: 'Token inválido...' })
        } else {

            const query_sql = {
                text: `DELETE FROM heroes WHERE id = $1`,
                values: [id]
            }

            pool.query(query_sql, (error, results) => {
                if (error) {
                    throw error;
                }
                res.send(req.body);
            });
        }
    })
});

function generateToken() {
    const payload = {
        user: "camilo99"
    }

    const key = 'ok';

    return jwt.sign(payload, key);
}

const token = generateToken();

console.log(token);

const PORT = process.env.PORT || 3000;

app.listen(PORT, () => {
    console.log(`Servidor iniciado en el puerto ${PORT}`);
})
