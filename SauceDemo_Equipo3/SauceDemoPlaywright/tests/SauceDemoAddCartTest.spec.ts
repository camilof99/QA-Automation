import test from "@playwright/test";


import { SauceDemoAddCart } from "../src/Pages/SauceDemoAddCart";
import { SauceDemoLogin } from "../src/Pages/SauceDemoLogin";

test.beforeEach(async({page})=>{
    await page.goto('https://www.saucedemo.com');
    const sauceDemoLogin = new SauceDemoLogin(page);
    await sauceDemoLogin.login(dataUser);
});
test(`
Given Debemos estar la pagina del inventario
When Agregamos productos al carrito de compras y abrimos carrito
Then Validamos que los productos se agregaron correctamente`,
async({page})=>{
    const pagina = new SauceDemoAddCart(page);
    await pagina.AddCart();
}
);
const dataUser = {
    user: 'standard_user',
    password: 'secret_sauce'
};