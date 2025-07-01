package ru.jpetstoretest.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {

    private final SelenideElement usernameInputField = $x("//input[@name='username']");
    private final SelenideElement passwordInputField = $x("//input[@name='password']");
    private final SelenideElement loginButton = $x("//input[@name='signon']");
    private final SelenideElement singInButton = $x("//a[contains(@href,'signonForm')]");
    private final SelenideElement registerNowButton = $x("//a[contains(@href,'newAccountForm')]");

    @Step("Кликнуть на кнопку 'Sing in' ")
    public LoginPage clickSignInButton() {
        singInButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;

    }

    @Step("Кликнуть на поле 'username' -> вводим имя пользователя")
    public LoginPage sendKeysUserIDInputField(String username) {
        usernameInputField
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .press(Keys.COMMAND, "A")
                .press(Keys.DELETE)
                .sendKeys(username);
        return this;
    }

    @Step("Кликнуть на поле 'password' -> вводим пароль")
    public LoginPage sendKeysPasswordInputField(String password) {
        passwordInputField
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .press(Keys.COMMAND, "A")
                .press(Keys.DELETE)
                .sendKeys(password);
        return this;

    }

    @Step("Кликуть на кнопку 'login' ")
    public LoginPage clickLoginButton() {
        loginButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Кликнуть на кнопку 'Register now'")
    public LoginPage clickRegisterNowButton() {
        registerNowButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }
}