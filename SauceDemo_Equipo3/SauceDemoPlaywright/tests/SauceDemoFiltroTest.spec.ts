import { test } from "@playwright/test";
import { SauceDemoFiltros } from "../src/Pages/SauceDemoFiltros"; 
import { SauceDemoLogin } from "../src/Pages/SauceDemoLogin"; 

test.beforeEach(async({page})=>{
    await page.goto('https://www.saucedemo.com/');
    const sauceDemoLogin = new SauceDemoLogin(page);
    await sauceDemoLogin.login(dataUser);
});
test(`
Given Debo estar en la página de inventario
When Seleccionamos filtros por nombre y precio
Then Mostramos por consola los nombres y precios de los articulos ordenados`,
async({page})=>{
    const pagina = new SauceDemoFiltros(page);
    await pagina.FiltroNombreZA();
    await pagina.FiltroNombreAZ();
    await pagina.FiltroPrecioLowHigh();
    await pagina.FiltroPriceHighLow();
}
);

const dataUser = {
    user: 'standard_user',
    password: 'secret_sauce'
};