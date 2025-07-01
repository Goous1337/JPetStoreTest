package ru.jpetstoretest.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class DogsCategoryPage {

    private final SelenideElement bulldogIdButton = $x("//a[contains(@href,'K9-BD-01')]");
    private final SelenideElement poodleButton = $x("//a[contains(@href,'K9-PO-02')]");

    @Step("Кликнуть на кнопку 'K9-PD-02' ")
    public DogsCategoryPage clickPoodleButton() {
        poodleButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Кликнуть на кнопку 'K9-BF-01' ")
    public DogsCategoryPage clickBulldogIdButton() {
        bulldogIdButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

}
