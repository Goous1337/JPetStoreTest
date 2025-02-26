package ru.jpetsroretest.search;

import org.junit.jupiter.api.Disabled;
import ru.jpetsroretest.BaseUiTest;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Feature("Проверка функциональности поиска")
public class SearchProductTest extends BaseUiTest {

    @Test
    @Story("Пользователь может найти продукт")
    @DisplayName("Поиска продукта")
    public void searchProductsTest(){
        baseRouter.searchPage()
                .sendKeysKeyWordInputField("Bulldog");
        baseRouter.searchPage()
                .clickSearchButton();

        baseRouter.searchPage()
                .successfullyFoundProductExist();
    }
}
