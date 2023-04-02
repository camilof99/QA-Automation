import { test } from '@playwright/test';
import { TheNumberGamePage } from '../src/pages/TheNumberGamePage';
//Definir test
test.beforeEach(async ({ page }) => {
    await page.goto('https://testsheepnz.github.io/random-number.html');
});

test(`
Given Dado que me encuentro en la pagina "The Number Game Page"
when Cuando hago roll con cantidad "Demo"
then Entonces veo el mensaje Correct
and Y debería imprimir el numero de intentos por consola`, async ({ page }) => {
    const pagina = new TheNumberGamePage(page);
    await pagina.numberGame();

});
