package ru.jpetstoretest.pages;

import static com.codeborne.selenide.Selenide.page;

public class BaseRouter {

    public MainPage mainPage() {
        return page(MainPage.class);
    }

    public CardRegistrationPage cardRegistrationPage() {
        return page(CardRegistrationPage.class);
    }

    public LoginPage loginPage() {
        return page(LoginPage.class);
    }

    public RegistrationAccountPage registrationAccountPage() {
        return page(RegistrationAccountPage.class);
    }

    public DogsCategoryPage dogsCategoryPage() {
        return page(DogsCategoryPage.class);
    }

    public ShoppingCartPage shoppingCartPage() {
        return page(ShoppingCartPage.class);
    }

    public ProductListPage productListPage() {
        return page(ProductListPage.class);
    }

    public FishCategoryPage fishCategoryPage() {
        return page(FishCategoryPage.class);
    }

    public SearchPage searchPage() {
        return page(SearchPage.class);
    }

    public ProductPage productPage() {
        return page(ProductPage.class);
    }
}
