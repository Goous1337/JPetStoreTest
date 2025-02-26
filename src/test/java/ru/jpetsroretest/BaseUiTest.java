package ru.jpetsroretest;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import ru.jpetstoretest.helper.RandomHelper;
import ru.jpetstoretest.model.Client;
import ru.jpetstoretest.model.FavouriteType;
import ru.jpetstoretest.model.LanguageType;
import ru.jpetstoretest.pages.*;


@Feature("Фронт")
public class BaseUiTest {

    protected RandomHelper randomHelper = new RandomHelper();
    public BaseRouter baseRouter  = new BaseRouter();

    @Step("Открытие главной страницы")
   @BeforeEach
    public void setupSelenideConfiguration(){
        Configuration.browserSize = "1920x1080";
        Configuration.browser = "chrome";
        Configuration.timeout = 10000;
        String authorizationPageUrl = "https://petstore.octoperf.com/actions/Catalog.action";
        Selenide.open(authorizationPageUrl);
    }

    @Step("Закрытие браузера")
   @AfterEach
    public void closeBrowser(){
       Selenide.closeWebDriver();
    }

    protected Client registerNewClient() {
        Client client = Client.newBuilder()
                .withUserID(randomHelper.getRandomString(6))
                .withPassword(randomHelper.getRandomString(8))
                .withFirstname(randomHelper.getRandomString(6))
                .withLastName(randomHelper.getRandomString(7))
                .withEmail(randomHelper.getRandomEmail(8))
                .withPhoneNumber("+7999999999")
                .withAddressFirst(randomHelper.getRandomString(6))
                .withAddressSecond(randomHelper.getRandomString(6))
                .withCity(randomHelper.getRandomString(5))
                .withState(randomHelper.getRandomString(7))
                .witZip(randomHelper.getRandomString(6))
                .withCountry("Russian")
                .withLanguageType(LanguageType.JAPANESE)
                .withFavouriteType(FavouriteType.DOGS)
                .build();
        baseRouter.registrationAccountPage()
                .sendKeysUserIDInputField(client.getUserID())
                .sendKeysNewPasswordInputField(client.getPassword())
                .senKeysRepeatPasswordInputField(client.getPassword())
                .sendKeysFirstNameInputField(client.getFirstName())
                .senKeysLastNameInputField((client.getLastName()))
                .senKeysEmailInputField(client.getEmail())
                .senKeysPhoneNumberInputField(client.getPhoneNumber())
                .senKeysAddressFirstInputField(client.getAddressFirst())
                .senKeysAddressSecondInputField(client.getAddressSecond())
                .senKeysCityInputField(client.getCity())
                .senKeysStateInputField(client.getState())
                .senKeysZipInputFiled(client.getZip())
                .senKeysCountryInputField(client.getCountry())
                .clickLanguagePreferenceButton()
                .clickLanguageTypeValueButton(client.getLanguageType())
                .clickFavouriteCategoryButton()
                .clickFavouriteTypeValueButton(client.getFavouriteType())
                .clickEnableMyListButton()
                .clickEnableMyBannerCheckBox()
                .clickSaveAccountInformationButton();
        return client;
    }
}
