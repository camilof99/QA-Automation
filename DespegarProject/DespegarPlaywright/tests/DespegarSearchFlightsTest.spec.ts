import test, { Page } from "@playwright/test";
import { DespegarSearchFlights } from "../src/pages/DespegarSearchFlights";

test.beforeEach(async ({ page }) => {
    await page.goto('https://www.despegar.com.co/vuelos/');
});

test(`
Given Debo estar en la pagina de Despegar
When Ingreso información para buscar vuelo
Then Visualizo lista de vuelos disponibles`, async ({ page }) => {
    const pagina = new DespegarSearchFlights(page);
    await pagina.setData(data);
});

const data = {
    origen: 'Cartagena de Indias',
    destino: 'Medellin'
};