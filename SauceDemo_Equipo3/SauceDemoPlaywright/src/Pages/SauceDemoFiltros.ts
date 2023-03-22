import { Page } from "@playwright/test";
export class SauceDemoFiltros {
    readonly page: Page;
    constructor(page: Page) {
        this.page = page;
    }
    async FiltroNombreAZ() {

        const filter = this.page.locator('[data-test="product_sort_container"]');

        await filter.selectOption('az');
        await this.page.waitForTimeout(2000);

        const products = await this.page.$$eval('.inventory_item_name', products => products.map(product => product.textContent));

        console.log("\nProductos filtrados por nombre Asc A - Z: \n");

        products.forEach(product => {
            console.log(product);
        });

    }

    async FiltroNombreZA() {

        const filter = this.page.locator('[data-test="product_sort_container"]');

        await filter.selectOption('za');
        await this.page.waitForTimeout(2000);

        const products = await this.page.$$eval('.inventory_item_name', products => products.map(product => product.textContent));

        console.log("\nProductos filtrados por nombre Desc Z - A: \n");

        products.forEach(product => {
            console.log(product);
        });
    }

    async FiltroPrecioLowHigh() {

        const filter = this.page.locator('[data-test="product_sort_container"]');

        await filter.selectOption('lohi');
        await this.page.waitForTimeout(2000);

        const products = await this.page.$$eval('.inventory_item_price', products => products.map(product => product.textContent));

        console.log("\nProductos filtrados por precio Low - High \n");

        products.forEach(product => {
            console.log(product);
        });

    }

    async FiltroPriceHighLow() {

        const filter = this.page.locator('[data-test="product_sort_container"]');

        await filter.selectOption('hilo');
        await this.page.waitForTimeout(2000);

        const products = await this.page.$$eval('.inventory_item_price', products => products.map(product => product.textContent));

        console.log("\nProductos filtrados por precio High - Low \n");

        products.forEach(product => {
            console.log(product);
        });

    }
}