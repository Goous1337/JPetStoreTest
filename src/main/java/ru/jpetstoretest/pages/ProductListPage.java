package ru.jpetstoretest.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class ProductListPage {

    private final SelenideElement EST6BulldogButton = $x("//a[contains(@href,'itemId=EST-6')]");
    private final SelenideElement EST8PoodleButton = $x("//a[contains(@href,'itemId=EST-8')]");

    @Step("Кликнуть на кнопку 'EST-6' ")
    public ProductListPage clickProductEst6Page() {
        EST6BulldogButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Кликнуть на кнопку 'EST-8' ")
    public ProductListPage clickProductEst8Page(){
        EST8PoodleButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }
}
