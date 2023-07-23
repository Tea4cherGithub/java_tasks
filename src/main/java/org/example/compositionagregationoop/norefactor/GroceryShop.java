package org.example.compositionagregationoop.norefactor;

/**
 * Продуктовый магазин
 */
public class GroceryShop {

    /**
     * Название магазина
     */
    private final String nameOfShop;

    public GroceryShop(String nameOfShop) {
        this.nameOfShop = nameOfShop;
    }

    public double getMarginOfProduct() {
        return 1.83;
    }
}
