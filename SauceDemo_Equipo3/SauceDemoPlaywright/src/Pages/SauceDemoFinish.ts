import {expect, Page} from "@playwright/test";
export class SauceDemoFinish{
    readonly page:Page;
    constructor(page:Page){
        this.page = page;
    }
    async finish(){
        
        await this.page.locator('[data-test="finish"]').click();
        await expect(this.page.getByText("THANK YOU FOR YOUR ORDER")).toBeVisible();

        console.log("\nGracias por su compra!");
    }
}
