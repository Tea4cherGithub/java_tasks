package org.example.compositionagregationoop.refactor;

/**
 * Строительный магазин
 */
public class BuildingShop extends Shop {

    public BuildingShop(String nameOfShop, Leader leader, StateIdentifier stateIdentifier) {
        super(nameOfShop, leader, stateIdentifier);
    }

    @Override
    public double getMarginOfProduct() {
        return 1.45;
    }
}
