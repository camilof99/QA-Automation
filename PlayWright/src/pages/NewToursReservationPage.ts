import { Page } from "@playwright/test";

export class NewToursReservationPage {

    readonly page: Page;

    constructor(page: Page) {
        this.page = page;
    }

    async login(){ 
        await this.page.goto('https://demo.guru99.com/test/newtours/');
        await this.page.locator('input[name="userName"]').fill('camilo99');
        await this.page.locator('input[name="password"]').fill('12345678');
        await this.page.waitForTimeout(3000);
        await this.page.getByRole('button', { name: 'Submit' }).click();
    }

    async newReservation() {
        await this.page.getByRole('link', { name: 'Flights' }).click();
        await this.page.getByRole('radio').nth(1).check();
        await this.page.locator('select[name="passCount"]').selectOption('3');
        await this.page.locator('select[name="fromPort"]').selectOption('San Francisco');
        await this.page.locator('select[name="fromMonth"]').selectOption('3');
        await this.page.locator('select[name="fromDay"]').selectOption('1');
        await this.page.locator('select[name="toPort"]').selectOption('Sydney');
        await this.page.locator('select[name="toMonth"]').selectOption('8');
        await this.page.locator('select[name="toDay"]').selectOption('15');
        await this.page.waitForTimeout(2000);
        await this.page.getByRole('radio').nth(3).check();
        await this.page.locator('select[name="airline"]').selectOption('Unified Airlines');
        await this.page.waitForTimeout(2000);
        await this.page.getByRole('button', { name: 'Submit' }).click()  
    }

};