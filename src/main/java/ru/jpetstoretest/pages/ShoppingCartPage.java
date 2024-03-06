package ru.jpetstoretest.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

public class ShoppingCartPage {


    private final SelenideElement proceedCheckoutButton = $x(" //a[contains(@href,'newOrderForm')]");
    private final SelenideElement changingNumberProductsField = $x("//input[contains(@name,'EST-6')]");
    private final SelenideElement updateCartButton = $x("//input[@name='updateCartQuantities']");

    @Step("Кликаем на кнопку 'Update Cart'")
    public ShoppingCartPage clickUpdateCartButton(){
        updateCartButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Кликаем на поле 'Quantity' -> изменяем количесвто")
    public ShoppingCartPage sendKeysChangingNumberProductsField(String number){
        changingNumberProductsField
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .press(Keys.CONTROL, Keys.SHIFT, Keys.ARROW_UP)
                .press(Keys.DELETE)
                .sendKeys(number);
        return this;
    }

    @Step("Кликнуть на кнопку 'Proceed to Checkout' ")
    public ShoppingCartPage clickCheckoutButton(){
        proceedCheckoutButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }
}
