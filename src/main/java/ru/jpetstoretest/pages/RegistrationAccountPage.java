package ru.jpetstoretest.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import ru.jpetstoretest.model.FavouriteType;
import ru.jpetstoretest.model.LanguageType;

import static com.codeborne.selenide.Selenide.$x;

public class RegistrationAccountPage {

    private final SelenideElement userIDInputField = $x("//input[contains(@name,'username')]");
    private final SelenideElement newPasswordInputField = $x("//input[contains(@name,'password')]");
    private final SelenideElement repeatPasswordInputField = $x("//input[contains(@name,'repeatedPassword')]");
    private final SelenideElement firstNameInputField = $x("//input[contains(@name,'account.firstName')]");
    private final SelenideElement lastNameInputField = $x("//input[contains(@name,'account.lastName')]");
    private final SelenideElement emailInputField = $x("//input[contains(@name,'account.email')]");
    private final SelenideElement phoneNumberInputField = $x("//input[contains(@name,'account.phone')]");
    private final SelenideElement firstAddressInputField = $x("//input[contains(@name,'account.address1')]");
    private final SelenideElement addressSecondInputField = $x("//input[contains(@name,'account.address2')]");
    private final SelenideElement cityInputField = $x("//input[contains(@name,'account.city')]");
    private final SelenideElement stateInputField = $x("//input[contains(@name,'account.state')]");
    private final SelenideElement zipCodeInputFiled  =  $x("//input[@name='account.zip']");
    private final SelenideElement countryInputField = $x("//input[contains(@name ,'account.country')]");
    private final SelenideElement languagePreferenceButton = $x("//select[@name='account.languagePreference']");
    private final SelenideElement favouriteCategoryButton = $x("//select[@name='account.favouriteCategoryId']");
    private final SelenideElement enableMyListCheckBox = $x("//input[@name='account.listOption']");
    private final SelenideElement enableMyBannerCheckBox = $x("//input[@name='account.bannerOption']");
    private final SelenideElement saveAccountInformationButton = $x("//input[@name='newAccount']");

    private SelenideElement languageTypeValueButton(String value){
        return $x("//select[@name='account.languagePreference']//option[@value='%s']".formatted(value));
    }

    private SelenideElement favouriteTypeValueButton(String value){
        return $x("//select[@name='account.favouriteCategoryId']//option[@value='%s']".formatted(value));
    }

    public RegistrationAccountPage  clickLanguageTypeValueButton(LanguageType languageType){
        languageTypeValueButton(languageType.getValue())
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    public RegistrationAccountPage clickFavouriteTypeValueButton(FavouriteType favouriteType){
        favouriteTypeValueButton(favouriteType.getValue())
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }
    @Step("Кликнуть на поле 'ID' ->  вводим ID")
    public RegistrationAccountPage sendKeysUserIDInputField(String ID){
        userIDInputField
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .sendKeys(ID);
        return this;
    }

    @Step("Кликнуть на поле 'NewPassword' -> вводим новый пароль")
    public RegistrationAccountPage sendKeysNewPasswordInputField(String password){
        newPasswordInputField
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .sendKeys(password);
        return this;
    }

    @Step("Кликнуть на поле 'RepeatPassword' -> вводим пароль")
    public RegistrationAccountPage senKeysRepeatPasswordInputField(String password){
        repeatPasswordInputField
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .sendKeys(password);
        return this;
    }

    @Step("Кликнуть на поле 'First Name' -> вводим имя")
    public RegistrationAccountPage sendKeysFirstNameInputField(String firsName){
        firstNameInputField
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .sendKeys(firsName);
        return this;
    }

    @Step("Кликнуть на поле 'Last Name' -> вводим фамилию")
    public RegistrationAccountPage senKeysLastNameInputField(String lastName){
        lastNameInputField
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .sendKeys(lastName);
        return this;
    }

    @Step("Кликнуть на поле 'Email' -> вводим название электронной почты")
    public RegistrationAccountPage senKeysEmailInputField(String email){
        emailInputField
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .sendKeys(email);
        return this;
    }

    @Step("Кликнуть на поле 'Phone' -> вводим номер телефона")
    public RegistrationAccountPage senKeysPhoneNumberInputField(String phone) {
        phoneNumberInputField
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .sendKeys(phone);
        return this;
    }

    @Step("Кликнуть на поле 'Address 1' -> вводим адресс ")
    public RegistrationAccountPage senKeysAddressFirstInputField(String address) {
        firstAddressInputField
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .sendKeys(address);
        return this;
    }

    @Step("Кликнуть на поле 'Address 2' -> вводим адресс ")
    public RegistrationAccountPage senKeysAddressSecondInputField(String address) {
        addressSecondInputField
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .sendKeys(address);
        return this;
    }

    @Step("Кликнуть на поле 'City' -> вводим название города")
    public RegistrationAccountPage senKeysCityInputField(String city) {
        cityInputField
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .sendKeys(city);
        return this;
    }

    @Step("Кликнуть на поле 'State' -> вводим название государтсва ")
    public RegistrationAccountPage senKeysStateInputField(String state) {
        stateInputField
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .sendKeys(state);
        return this;
    }

    @Step("Кликнуть на поле 'Zip' -> вводим номер 'Zip'")
    public RegistrationAccountPage senKeysZipInputFiled(String zip) {
        zipCodeInputFiled
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .sendKeys(zip);
        return this;
    }

    @Step("Кликнуть на поле 'Country' -> вводим название страны")
    public RegistrationAccountPage senKeysCountryInputField(String country) {
        countryInputField
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .sendKeys(country);
        return this;
    }

    @Step("Кликнуть на кнопку 'Language Preference' -> выбираем язык")
    public RegistrationAccountPage clickLanguagePreferenceButton(){
        languagePreferenceButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Кликнуть на кнопку 'FavouriteCategory' -> выбираем категорию")
    public RegistrationAccountPage clickFavouriteCategoryButton(){
        favouriteCategoryButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Кликнуть на кнопку 'EnableMyBanner'")
    public RegistrationAccountPage  clickEnableMyBannerCheckBox(){
        enableMyBannerCheckBox
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Кликнуть на кнопку 'EnableMyList'")
    public RegistrationAccountPage clickEnableMyListButton(){
        enableMyListCheckBox
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Кликнуть на кнопку 'SaveAccountInformation'")
    public RegistrationAccountPage clickSaveAccountInformationButton(){
        saveAccountInformationButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }
}
