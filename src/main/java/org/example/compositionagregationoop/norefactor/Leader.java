package org.example.compositionagregationoop.norefactor;

import java.util.StringJoiner;

/**
 * Управляющий магазином
 */
public class Leader {

    private final String lastName;

    private final String firstName;

    private final String patronymic;

    public Leader(String lastName, String firstName, String patronymic) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    public String getFio() {
        return new StringJoiner(" ")
                .add(lastName)
                .add(firstName)
                .add(patronymic)
                .toString();
    }
}
