package ru.jpetsroretest.account;

import ru.jpetsroretest.BaseUiTest;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.jpetstoretest.model.Client;

@Feature("Проверка функциональности регистрации аккаунта")
public class AccountRegistrationTest extends BaseUiTest {

    @Test
    @Story("Пользователь может зарегистрировать новый аккаунт")
    @DisplayName("Регистрации нового аккаунта")
    public void accountRegistrationTest() {
        // Arrange
        baseRouter.loginPage()
                .clickSignInButton()
                .clickRegisterNowButton();
        // Act
        Client client = registerNewClient();

        // Assert
        baseRouter.loginPage()
                .clickSignInButton()
                .sendKeysUserIDInputField(client.getUserID())
                .sendKeysPasswordInputField(client.getPassword())
                .clickLoginButton();
        baseRouter.mainPage()
                .myAccountButtonShouldExist();

    }
}
