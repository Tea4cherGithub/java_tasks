package org.example.compositionagregationoop.refactor;

import java.util.Arrays;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        ShopService shopService = new ShopService();
        Leader leaderBuildingShop = new Leader("Нестеренко", "Никита", "Александрович");
        Leader leaderGroceryShop = new Leader("Борченко", "Андрей", "Алексеевич");
        Shop shopBuilding = new BuildingShop(
                "Build24/7",
                leaderBuildingShop,
                new StateIdentifier(UUID.randomUUID(), "OOO Razdrom"));
        Shop shopGrocery = new GroceryShop(
                "FkuskonIOkay",
                leaderGroceryShop,
                new StateIdentifier(UUID.randomUUID(), "OOO Razkor"));
        shopGrocery.setEmployees(new Employee[]{new Employee(), new Employee()});
        Shop[] shops = new Shop[]{shopBuilding, shopGrocery};
        System.out.println(Arrays.toString(shopService.getInfoByShops(shops)));
    }
}
