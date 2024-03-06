package ru.jpetstoretest.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class ProductPage {

    private final SelenideElement addItemToCartIdButton = $x("//a[contains(@href,'addItemToCart')]");

    @Step("Кликнуть на кнопку 'Add to Cart' ")
    public ProductPage clickAddCartButton(){
        addItemToCartIdButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }
}
