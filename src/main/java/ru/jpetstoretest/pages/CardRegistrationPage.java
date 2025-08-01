package ru.jpetstoretest.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import ru.jpetstoretest.model.CardType;

import static com.codeborne.selenide.Selenide.$x;

public class CardRegistrationPage {

    private final SelenideElement cardTypeDropdownButton = $x("//select[@name='order.cardType']");
    private final SelenideElement cardNumberInputField = $x("//input[@name='order.creditCard']");
    private final SelenideElement continueButton = $x("//input[@value='Continue']");
    private final SelenideElement saveAccountInformationSubmitButton = $x("//a[@class='Button']");
    private final SelenideElement successfullyCreatedOrderContainer = $x("//div[@id='Content']"
            + "//li[contains(text(),'Thank you, your order has been submitted.')]");
    private final SelenideElement quantityValueText = $x("//th[contains(text(),'Quantity')]/../..//td[3]");

    private SelenideElement cardTypeValueButton(String value) {
        return $x("//select[@name='order.cardType']");
    }

    @Step("Меняем значение -> 2")
    public String getQuantityValueText() {
        return quantityValueText
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .getText();
    }

    @Step("Кликнуть на кнопку 'Card Type'")
    public CardRegistrationPage clickTypeDropdownButton() {
        cardTypeDropdownButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Кликнуть на кнопку 'American Express'")
    public CardRegistrationPage clickCardTypeValueButton(CardType cardType) {
        cardTypeValueButton(cardType.getValue())
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Кликнуть на поле 'Card Number' -> вводим номер карты")
    public CardRegistrationPage sendKeysCardNumberField(String number) {
        cardNumberInputField
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .press(Keys.CONTROL, Keys.SHIFT, Keys.ARROW_UP)
                .press(Keys.DELETE)
                .sendKeys(number);
        return this;
    }

    @Step("Кликнуть на кнопку 'Continue'")
    public CardRegistrationPage clickContinueButton() {
        continueButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Кликнуть на кнопку 'Confirm'")
    public CardRegistrationPage clickAccountInformationButton() {
        saveAccountInformationSubmitButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Заказ создан")
    public CardRegistrationPage orderSuccessfullyCreatedTextShouldExist() {
        successfullyCreatedOrderContainer
                .shouldBe(Condition.exist).
                shouldBe(Condition.appear);
        return this;
    }
}
