import { Page } from "@playwright/test";

export class SearchAcomodationPage {

    readonly page:Page;

    constructor(page:Page){
        this.page = page;
    }

    async searchReservation(){
        await this.page.getByPlaceholder('¿Adónde vas?').click();
        await this.page.locator('.e284d5707f').click();
        await this.page.getByRole('button', { name: 'Ignorar información sobre el inicio de sesión.' }).click();
        await this.page.getByRole('option', { name: 'Cartagena de Indias Colombia' }).click();
        await this.page.locator('span').filter({ hasText: '+' }).first().click();
        await this.page.locator('span').filter({ hasText: '+' }).first().click();
        await this.page.getByRole('checkbox', { name: '28 Febrero 2023' }).click();
        await this.page.getByRole('checkbox', { name: '10 Marzo 2023' }).click();
        await this.page.getByRole('button', { name: 'Número de personas y habitaciones 2 adultos · 0 niños · 1 habitación' }).click();
        await this.page.getByRole('button', { name: 'Aumenta el número de Adultos' }).click();
        await this.page.getByRole('button', { name: 'Aumenta el número de Niños' }).click();
        await this.page.getByRole('combobox', { name: 'Edad del niño 1' }).selectOption('17');
        await this.page.getByRole('button', { name: 'Aumenta el número de Habitaciones' }).click();
        await this.page.getByRole('button', { name: 'Buscar' }).click();

    }

};