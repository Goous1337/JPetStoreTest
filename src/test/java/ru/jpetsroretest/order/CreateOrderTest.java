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

//@Feature("Проверка функциональности заказов")
public class CreateOrderTest extends BaseUiTest {

    @Disabled
    @Story("Пользователь может создать заказ")
    @DisplayName("Создание заказа")
    public void createOrderTest () {
        CardType cardType = CardType.AMERICAN_EXPRESS;
        baseRouter.loginPage()
                .clickSignInButton()
                .clickRegisterNowButton();
        Client client = registerNewClient();
        baseRouter.mainPage()
                .clickSingInButton();
        baseRouter.loginPage()
                .sendKeysUserIDInputField(client.getUserID())
                .sendKeysPasswordInputField(client.getPassword())
                .clickLoginButton();

        baseRouter.mainPage()
                .clickCategoryFishButton();
        baseRouter.fishCategoryPage()
                .clickAngelFishButton();
        baseRouter.productPage()
                .clickAddCartButton();
        baseRouter.shoppingCartPage()
                .clickCheckoutButton();
        baseRouter.cardRegistrationPage()
                .clickTypeDropdownButton()
                .clickCardTypeValueButton(cardType)
                .sendKeysCardNumberField("1234123412341234")
                .clickContinueButton()
                .clickAccountInformationButton();

        baseRouter.cardRegistrationPage()
                .orderSuccessfullyCreatedTextShouldExist();
    }

    @Disabled
    @Story("Пользователь может менять количесвто товаров в заказе")
    @DisplayName("Изменение количесвто товаров в заказе")
    public void updatingQuantityProductShoppingCartTest(){
        String expectedQuantity = "2";
        baseRouter.loginPage()
                .clickSignInButton()
                .clickRegisterNowButton();
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
        baseRouter.cardRegistrationPage()
                .clickContinueButton()
                .clickAccountInformationButton();

        String receivedQuantity = baseRouter.cardRegistrationPage().getQuantityValueText();
        Assertions.assertThat(expectedQuantity).isEqualTo(receivedQuantity);
    }
}

