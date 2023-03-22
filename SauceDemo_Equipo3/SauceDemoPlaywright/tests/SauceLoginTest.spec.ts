import test, {Page} from "@playwright/test";
import { SauceDemoLogin} from "../src/Pages/SauceDemoLogin";

test.beforeEach(async({page})=>{
    await page.goto('https://www.saucedemo.com')
});

test(`
Given Debo estar en la pagina de sauceDemo
When Ingreso credenciales y me logueo
Then Visualizo los productos de la pagina`,async({page})=>{
    const pagina = new SauceDemoLogin(page);
    await pagina.login(dataUser);
    await pagina.validText();
});

const dataUser = {
    user: 'standard_user',
    password: 'secret_sauce'
};