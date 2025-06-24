package ru.jpetstoretest.model;

public enum LanguageType {

    ENGLISH("english"),
    JAPANESE("japanese");

    private final String value;

    LanguageType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
