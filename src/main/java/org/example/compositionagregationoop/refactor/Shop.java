package org.example.compositionagregationoop.refactor;

import java.util.Arrays;

public class Shop {

    private final String nameOfShop;

    private final String directorFio;

    private final StateIdentifier stateIdentifier;

    private Employee[] employees;

    public Shop(String nameOfShop, Leader leader, StateIdentifier stateIdentifier) {
        this.nameOfShop = nameOfShop;
        this.directorFio = leader.getFio();
        this.stateIdentifier = stateIdentifier;
    }

    public double getMarginOfProduct() {
        return 1.5;
    }

    public String getNameOfShop() {
        return nameOfShop;
    }

    public String getDirectorFio() {
        return directorFio;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "nameOfShop='" + nameOfShop + '\'' +
                ", directorFio='" + directorFio + '\'' +
                ", employees=" + Arrays.toString(employees) + getMarginOfProduct() +
                '}';
    }
}
