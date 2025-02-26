package ru.jpetstoretest.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class FishCategoryPage {

    private final SelenideElement productIDAngelFish = $x("//a[contains(@href,'FI-SW-01')]");

    @Step("Кликнуть на кнопку 'FI-SW-01=' ")
    public FishCategoryPage clickAngelFishButton(){
        productIDAngelFish
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }
}
