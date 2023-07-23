package org.example.compositionagregationoop.refactor;


/**
 * Сервис для работы с магазинами
 */
public class ShopService {

    public InfoOfShop[] getInfoByShops(Shop[] shops) {
        InfoOfShop[] infoOfShops = new InfoOfShop[shops.length];
        for (int i = 0; i < shops.length; i++) {
            infoOfShops[i] = new InfoOfShop(shops[i].getDirectorFio(), shops[i].getMarginOfProduct());
        }
        return infoOfShops;
    }
}
