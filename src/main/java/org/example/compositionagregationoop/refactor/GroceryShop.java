package org.example.compositionagregationoop.refactor;

/**
 * Продуктовый магазин
 */
public class GroceryShop extends Shop {

    public GroceryShop(String nameOfShop, Leader leader, StateIdentifier stateIdentifier) {
        super(nameOfShop, leader, stateIdentifier);
    }

    @Override
    public double getMarginOfProduct() {
        return 1.83;
    }
}
