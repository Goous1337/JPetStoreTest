package ru.jpetstoretest.model;

public enum CardType {

    VISA("Visa"),
    MASTER_CARD("Master Card"),
    AMERICAN_EXPRESS("American Express");


    private final String value;

    CardType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
