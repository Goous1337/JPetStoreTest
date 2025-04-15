package ru.jpetsroretest.account;

import org.junit.jupiter.api.Disabled;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.jpetsroretest.BaseUiTest;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.jpetstoretest.model.Client;

@Feature("Проверка функциональности регистрации аккаунта")
public class AccountRegistrationTest extends BaseUiTest {

    public static final Logger logger = LoggerFactory.getLogger(AccountRegistrationTest.class);

   @Test
   @Story("Пользователь может зарегистрировать новый аккаунт")
   @DisplayName("Регистрации нового аккаунта")
    public void accountRegistrationTest() {
        // Arrange
       logger.info("Переход на страницу логина");
        baseRouter.loginPage()
                .clickSignInButton()
                .clickRegisterNowButton();
        // Act
       logger.info("Регистрация пользователя");
        Client client = registerNewClient();

        // Assert
       logger.info("Вход в аккаунт");
        baseRouter.loginPage()
                .clickSignInButton()
                .sendKeysUserIDInputField(client.getUserID())
                .sendKeysPasswordInputField(client.getPassword())
                .clickLoginButton();
        logger.info("Аккаунт существует (кнопка My account)");
        baseRouter.mainPage()
                 .myAccountButtonShouldExist();
    }
}
