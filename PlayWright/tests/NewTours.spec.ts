import { test } from '@playwright/test';
import { NewToursReservationPage } from '../src/pages/NewToursReservationPage';
import { NewToursLoginPage } from '../src/pages/NewToursLoginPage';

test.beforeEach(async ({ page }) => {
    await page.goto('https://demo.guru99.com/test/newtours/');
    const pagina = new NewToursLoginPage(page);
    await pagina.login(infoUser);
});

test(`
Given Necesito reservar un vuelo
when lleno los campos necesarios para reservar
then reservo correctamente`, 
async ({ page }) => {
    const pagina = new NewToursReservationPage(page);
    await pagina.newReservation();
});

const infoUser = {
    user: 'camilo99',
    password: '12345678'
};