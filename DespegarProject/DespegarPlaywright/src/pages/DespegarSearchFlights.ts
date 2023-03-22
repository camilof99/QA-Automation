import { expect, Page } from "@playwright/test";

export class DespegarSearchFlights {
    readonly page: Page;
    constructor(page: Page) {
        this.page = page;
    }
    async setData(data) {

        const listOrigen = await this.page.locator("//div[@class='ac-wrapper -desktop -show']//ul[@class='ac-group-items']/child::li[@class='item -active']")

        const listDestino = await this.page.locator("//div[@class='ac-wrapper -desktop -show sbox-ab-ls']//ul[@class='ac-group-items']/child::li[@class='item -active']")

        await this.page.waitForTimeout(1000);
        await this.page.locator('.login-incentive--close').click();

        await this.page.getByRole('textbox', { name: 'Ingresa desde dónde viajas' }).click();
        await this.page.getByRole('textbox', { name: 'Ingresa desde dónde viajas' }).clear();
        await this.page.waitForTimeout(1000);

        await this.page.keyboard.type(data.origen);
        await this.page.waitForTimeout(1000);
        await listOrigen.click()

        await this.page.waitForTimeout(1000);
        await this.page.getByRole('textbox', { name: 'Ingresa hacia dónde viajas' }).click();
        await this.page.waitForTimeout(2000);

        await this.page.keyboard.type(data.destino);
        await this.page.waitForTimeout(1000);
        await listDestino.click()

        await this.page.waitForTimeout(1000);
        await this.page.getByRole('textbox', { name: 'Ida' }).click();
        await this.page.waitForTimeout(1000);
        await this.page.getByText('10').first().click();
        await this.page.getByRole('textbox', { name: 'Vuelta' }).click();
        await this.page.getByText('29').first().click();
        await this.page.locator('#searchbox-sbox-box-flights').getByRole('textbox').nth(4).click();
        await this.page.getByRole('button', { name: 'Buscar' }).click();
        

    };

} 