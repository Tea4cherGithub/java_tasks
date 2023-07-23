package org.example.compositionagregationoop.refactor;

public class InfoOfShop {

    /**
     * ФИО директора магазина
     */
    private final String directoryFio;

    /**
     * Наценка на товар в его магазине
     */
    private final double markup;

    public InfoOfShop(String directoryFio, double markup) {
        this.directoryFio = directoryFio;
        this.markup = markup;
    }

    public String getDirectoryFio() {
        return directoryFio;
    }

    public double getMarkup() {
        return markup;
    }

    @Override
    public String toString() {
        return "InfoOfShop{" +
                "directoryFio='" + directoryFio + '\'' +
                ", markup=" + markup +
                '}';
    }
}
