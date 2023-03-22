import {expect, Page} from "@playwright/test";

export class SauceDemoLogin{
    readonly page: Page;
    constructor(page:Page){
        this.page = page;
    }
    async login(dataUser){

        const username = this.page.locator('[data-test="username"]');
        const password = this.page.locator('[data-test="password"]');
        const button = this.page.locator('[data-test="login-button"]');

        await expect(this.page).toHaveURL('https://www.saucedemo.com');
        await expect(this.page.locator('[data-test="username"]')).toBeVisible;

        await username.fill(dataUser.user);
        await password.fill(dataUser.password);
        await button.click();

    };

    async validText(){

        await expect(this.page.getByText("Products")).toBeVisible();
    }

} 