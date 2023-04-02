import { Page } from "@playwright/test";

export class TheNumberGamePage {

    readonly page: Page;

    constructor(page: Page) {
        this.page = page;
    }

    async numberGame() {
        let strText;
        
        await this.page.getByRole('combobox', { name: 'Select build:' }).selectOption('0');
        await this.page.getByRole('button', { name: 'Roll the dice' }).click();

        do{

            let numRandom = Math.floor(Math.random() * 12) + 1;      
            
            await this.page.locator('#numberGuess').click();
            await this.page.locator('#numberGuess').fill(numRandom + "");
            await this.page.getByRole('button', { name: 'Submit' }).click();

            strText = await this.page.locator("//label[@id='feedbackLabel']//parent::i").textContent();
            
        } while (!strText.includes("Correct"));

        const numIntent = strText = await this.page.locator("//label[@id='turnNumber']").textContent();

        console.log(strText);
        console.log("Num " + numIntent);
        
    }

};