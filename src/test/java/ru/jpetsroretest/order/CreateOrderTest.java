package ru.jpetsroretest.order;

import org.junit.jupiter.api.Disabled;
import ru.jpetsroretest.BaseUiTest;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.jpetstoretest.model.CardType;
import ru.jpetstoretest.model.Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Feature("Проверка функциональности заказов")
public class CreateOrderTest extends BaseUiTest {

    public static final Logger logger = LoggerFactory.getLogger(CreateOrderTest.class);

    @Disabled
    @Story("Пользователь может создать заказ")
    @DisplayName("Создание заказа")
    public void createOrderTest() {

        logger.info("Начало теста");

        CardType cardType = CardType.AMERICAN_EXPRESS;

        logger.info("Переход на страницу логина");
        baseRouter.loginPage()
                .clickSignInButton()
                .clickRegisterNowButton();

        logger.info("Регистрация нового клиента");
        Client client = registerNewClient();

        logger.info("Авторизация клиента");
        baseRouter.mainPage()
                .clickSingInButton();
        baseRouter.loginPage()
                .sendKeysUserIDInputField(client.getUserID())
                .sendKeysPasswordInputField(client.getPassword())
                .clickLoginButton();

        logger.info("Выбор категории Fish");
        baseRouter.mainPage()
                .clickCategoryFishButton();
        baseRouter.fishCategoryPage()
                .clickAngelFishButton();

        logger.info("Добавление товара в корзину");
        baseRouter.productPage()
                .clickAddCartButton();

        logger.info("Переход к оформлению заказа");
        baseRouter.shoppingCartPage()
                .clickCheckoutButton();

        logger.info("Заполнение данных карты");
        baseRouter.cardRegistrationPage()
                .clickTypeDropdownButton()
                // .clickCardTypeValueButton(cardType)
                .sendKeysCardNumberField("1234123412341234")
                .clickContinueButton()
                .clickAccountInformationButton();

        logger.info("Проверка успешного создания заказа");
        baseRouter.cardRegistrationPage()
                .orderSuccessfullyCreatedTextShouldExist();

        logger.info("Тест завершен");

    }

    @Disabled
    @Story("Пользователь может менять количесвто товаров в заказе")
    @DisplayName("Изменение количесвто товаров в заказе")
    public void updatingQuantityProductShoppingCartTest() {
        String expectedQuantity = "2";
        baseRouter.loginPage()
                .clickSignInButton()
                .clickRegisterNowButton();
        logger.debug("");
        Client client = registerNewClient();

        baseRouter.loginPage()
                .clickSignInButton()
                .sendKeysUserIDInputField(client.getUserID())
                .sendKeysPasswordInputField(client.getPassword())
                .clickLoginButton();

        baseRouter.mainPage()
                .clickCategoryDogsButton();
        baseRouter.dogsCategoryPage()
                .clickBulldogIdButton();
        baseRouter.productListPage()
                .clickProductEst6Page();
        baseRouter.productPage()
                .clickAddCartButton();
        baseRouter.mainPage()
                .clickCategoryDogsButton();
        baseRouter.dogsCategoryPage()
                .clickPoodleButton();
        baseRouter.productListPage()
                .clickProductEst8Page();
        baseRouter.productPage()
                .clickAddCartButton();
        baseRouter.shoppingCartPage()
                .sendKeysChangingNumberProductsField(expectedQuantity)
                .clickUpdateCartButton()
                .clickCheckoutButton();
//        baseRouter.cardRegistrationPage()
//                .clickContinueButton()
//                .clickAccountInformationButton();

        String receivedQuantity = baseRouter.cardRegistrationPage().getQuantityValueText();
        Assertions.assertThat(expectedQuantity).isEqualTo(receivedQuantity);
    }
}

