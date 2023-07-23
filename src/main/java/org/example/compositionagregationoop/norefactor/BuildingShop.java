package org.example.compositionagregationoop.norefactor;

/**
 * Строительный магазин
 */
public class BuildingShop {

    /**
     * Название магазина
     */
    private final String nameOfShop;

    public BuildingShop(String nameOfShop) {
        this.nameOfShop = nameOfShop;
    }

    public double getMarginOfProduct() {
        return 1.45;
    }
}
