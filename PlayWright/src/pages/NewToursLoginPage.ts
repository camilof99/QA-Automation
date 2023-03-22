import { expect, Page } from "@playwright/test";

export class NewToursLoginPage {

    readonly page: Page;

    constructor(page: Page) {
        this.page = page;
    }

    async login(infoUser) {
        const username = this.page.locator('input[name="userName"]');
        const password = this.page.locator('input[name="password"]')
        const button = this.page.getByRole('button', { name: 'Submit' });

        // Se valida que nos encontramos en la página
        await expect(this.page).toHaveURL('https://demo.guru99.com/test/newtours/');
        await expect(this.page.locator('input[name="userName"]')).toBeVisible();

        await username.fill(infoUser.user);
        await password.fill(infoUser.password);
        await this.page.waitForTimeout(2000);
        await button.click();
    }

};