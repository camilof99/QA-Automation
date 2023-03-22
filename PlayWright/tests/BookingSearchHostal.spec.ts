import { test } from '@playwright/test';
import { SearchAcomodationPage } from '../src/Pages/SearchAcomodationPage'
//Definir test
test.beforeEach(async ({ page }) => {
    await page.goto('https://www.booking.com/index.es.html');
});

test(`
Given Necesito buscar un alojamiento 
when lleno los campos
then visualizo los alojamientos disponibles`, async ({ page }) => {
    const pagina = new SearchAcomodationPage(page);
    await pagina.searchReservation();

});

