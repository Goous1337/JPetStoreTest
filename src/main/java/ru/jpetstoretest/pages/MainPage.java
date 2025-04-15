package ru.jpetstoretest.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

    private final SelenideElement categoryDogsButton = $x("//a[contains(@href,'DOGS')]");
    private final SelenideElement categoryFishButton = $x("//a[contains(@href,'FISH')]");
    private final SelenideElement myAccountButton = $x("//a[text()='Account']");
    private final SelenideElement singInButton = $x("//a[contains(@href,'signonForm')]");

    @Step("Кликнуть на кнопку входа")
    public MainPage clickSingInButton(){
        singInButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Кликнуть на кнопку 'Dogs' ")
    public MainPage clickCategoryDogsButton(){
        categoryDogsButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Кликнуть на кнопку 'Fish' ")
    public MainPage clickCategoryFishButton() {
        categoryFishButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Кнопка 'My account' должна существовать")
    public MainPage myAccountButtonShouldExist(){
        myAccountButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear);
        return this;
    }
}