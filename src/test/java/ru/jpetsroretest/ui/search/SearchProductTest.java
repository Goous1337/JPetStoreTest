package ru.jpetsroretest.ui.search;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.jpetsroretest.BaseUiTest;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Feature("Проверка функциональности поиска")
public class SearchProductTest extends BaseUiTest {

    public static final Logger logger = LoggerFactory.getLogger(SearchProductTest.class);

    @Test
    @Story("Пользователь может найти продукт")
    @DisplayName("Поиска продукта")
    public void searchProductsTest() {

        logger.info("Ввод в поисковую строку");
        baseRouter.searchPage()
                .sendKeysKeyWordInputField("Bulldog");

        logger.info("Нажатие на кнопку поиска");
        baseRouter.searchPage()
                .clickSearchButton();

        logger.info("Подтверждение нахождения продукта");
        baseRouter.searchPage()
                .successfullyFoundProductExist();
    }
}
