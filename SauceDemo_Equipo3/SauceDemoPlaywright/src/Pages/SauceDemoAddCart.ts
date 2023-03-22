import {expect, Page} from "@playwright/test";
export class SauceDemoAddCart{
    readonly page:Page;
    constructor(page:Page){
        this.page = page;
    }
    async AddCart(){
        const product1 = this.page.locator('[data-test="add-to-cart-sauce-labs-backpack"]');
        const product2 = this.page.locator('[data-test="add-to-cart-sauce-labs-fleece-jacket"]');
        const product3 = this.page.locator('[data-test="add-to-cart-sauce-labs-onesie"]');
        const buttonCart = this.page.locator('[class="shopping_cart_link"]');
    
        await product1.click();
        await product2.click();
        await product3.click();
        await buttonCart.click();

        const itemCart = await this.page.$('.cart_item');
        expect(itemCart).toBeTruthy();
        await this.page.waitForTimeout(2000);
            
    }
}