package App.pages;

import com.codeborne.selenide.SelenideElement;
import helpers.Driver;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage extends BasePage {

    public SelenideElement loginField = $(By.xpath("//*[@id=\"admin_login__input--login\"]"));
    public SelenideElement passwordField = $(By.xpath("//*[@id=\"admin_login__input--password\"]"));
    public SelenideElement roleField = $(By.xpath("//*[@id=\"admin_login__nz-select--authorizationRole\"]"));
    public SelenideElement signInButton = $(By.id("admin_login__button--submit"));

    public LoginPage(String pageUrl) {
        super(pageUrl);
    }

    public void login(String login, String password, String role) {
        loginField.setValue(login);
        passwordField.setValue(password);
        roleField.click();
        if (role.equals("Центральный администратор")) {
            $(By.xpath("//*[@id=\"cdk-overlay-0\"]/nz-option-container/div/cdk-virtual-scroll-viewport/div[1]/nz-option-item[1]/div")).click();
        } else if (role.equals("Центральный бизнес-администратор")) {

        }
        signInButton.click();
        Driver.waitForUrlContains("/admin/main");
    }

}
