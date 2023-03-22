import test from "@playwright/test";

import { SauceDemoAddCart } from "../src/Pages/SauceDemoAddCart";
import { SauceDemoCheckout } from "../src/Pages/SauceDemoCheckout";
import { SauceDemoLogin } from "../src/Pages/SauceDemoLogin";

test.beforeEach(async ({ page }) => {
    await page.goto('https://www.saucedemo.com');
    const sauceDemoLogin = new SauceDemoLogin(page);
    await sauceDemoLogin.login(dataUser);

    const pagina = new SauceDemoAddCart(page);
    await pagina.AddCart();
});
test(`
Given Debemos estar en la pagina del carrito
When Damos checkout y llenamos datos para la compra
Then Mostramos por consola los datos de la compra`,
    async ({ page }) => {
        const pagina = new SauceDemoCheckout(page);
        await pagina.checkoutForm(dataCheckout);
        await pagina.printInformation();
        
    }
);
const dataUser = {
    user: 'standard_user',
    password: 'secret_sauce'
};

const dataCheckout = {
    firstName: 'Camilo',
    lastName: 'Carlos',
    zipCode: 'Thomas'
};