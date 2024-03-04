package ru.jpetstoretest.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class SearchPage {

    private final SelenideElement successfullyFoundOrder =$x("//div[@id='Catalog']//td[contains(text(),'Bulldog')]");
    private final SelenideElement searchProductButton =$x("//input[@name='searchProducts']");
    private final SelenideElement keyWordInputField =$x("//input[@name='keyword']");

    @Step("Продукт должен существовать")
    public SearchPage successfullyFoundProductExist(){
        successfullyFoundOrder
                .shouldBe(Condition.exist);
        return this;
    }

    @Step("Кликаем на поле поиска -> вводим 'Bulldog'")
    public SearchPage sendKeysKeyWordInputField(String nameProduct){
        keyWordInputField
                .shouldBe(Condition.exist)
                .sendKeys(nameProduct);

        return this;
    }

    @Step("Кликаем на кнопку 'Search'")
    public SearchPage clickSearchButton(){
        searchProductButton
                .shouldBe(Condition.exist)
                .click();
        return this;
    }
}
