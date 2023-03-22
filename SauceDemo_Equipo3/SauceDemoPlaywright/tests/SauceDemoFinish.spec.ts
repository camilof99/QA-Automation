import test, { Page } from "@playwright/test";
import { SauceDemoAddCart } from "../src/Pages/SauceDemoAddCart";
import { SauceDemoCheckout } from "../src/Pages/SauceDemoCheckout";
import { SauceDemoFinish } from "../src/Pages/SauceDemoFinish";
import { SauceDemoLogin } from "../src/Pages/SauceDemoLogin";
import { SauceDemoFiltros } from "../src/Pages/SauceDemoFiltros";

test.beforeEach(async ({ page }) => {
    await page.goto('https://www.saucedemo.com');
    const sauceDemoLogin = new SauceDemoLogin(page);
    await sauceDemoLogin.login(dataUser);

    const sauceDemoFiltro = new SauceDemoFiltros(page);
    await sauceDemoFiltro.FiltroNombreZA();

    const sauceDemoCart = new SauceDemoAddCart(page);
    await sauceDemoCart.AddCart();

    const sauceCheckout = new SauceDemoCheckout(page);
    await sauceCheckout.checkoutForm(dataCheckout);
    await sauceCheckout.printInformation();
});
test(`
Given Debemos estar en la pagina de la informacion de la compra
When selecciono articulos de la tienda
Then Comfirmamos y finalizamos la compra`,
    async ({ page }) => {
        const pagina = new SauceDemoFinish(page);
        await pagina.finish();
    }
);
const dataUser = {
    user: 'standard_user',
    password: 'secret_sauce',
};

const dataCheckout = {
    firstName: 'Camilo',
    lastName: 'Carlos',
    zipCode: 'Thomas'
};