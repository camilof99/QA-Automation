import { expect, Page } from "@playwright/test";

export class SauceDemoCheckout {
    readonly page: Page;
    constructor(page: Page) {
        this.page = page;
    }

    async checkoutForm(dataCheckout) {
        
        await this.page.locator('[data-test="checkout"]').click();
        await this.page.locator('[data-test="firstName"]').fill(dataCheckout.firstName);
        await this.page.locator('[data-test="lastName"]').fill(dataCheckout.lastName);
        await this.page.locator('[data-test="postalCode"]').fill(dataCheckout.zipCode);
        await this.page.waitForTimeout(2000);
        await this.page.locator('[data-test="continue"]').click();

        await this.page.waitForTimeout(2000);

    }

    async printInformation(){
        const info = await this.page.locator('[class="summary_value_label"]').first().textContent();
        const subTotal = await this.page.locator('[class="summary_subtotal_label"]').first().textContent();
        const tax = await this.page.locator('[class="summary_tax_label"]').first().textContent();
        const total = await this.page.locator('[class="summary_info_label summary_total_label"]').first().textContent();

        console.log("\nInformación de la compra: ");
        console.log("Payment Information: " + info);
        console.log(subTotal);
        console.log(tax);
        console.log(total);
        
        
    }
}