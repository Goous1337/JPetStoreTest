package ru.jpetstoretest.model;

public enum FavouriteType {

    FISH("FISH"),
    DOGS("DOGS"),
    REPTILES("REPTILES"),
    CATS("CATS"),
    BIRDS("BIRDS");

    private final String value;

    FavouriteType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
