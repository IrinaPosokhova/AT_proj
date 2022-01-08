package UITests;

import App.pages.LoginPage;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class LoginPageTests extends A_BaseTest{

    @Test
    public void loginCentralAdminTest(){

        app.loginPage.open();
        app.loginPage.login("admin", "admin", "Центральный администратор");

        try {
            WebDriverRunner.url().contains("main");
        } catch (Throwable t) {
            logger.warn("Ошибка входа на страницу!");
            collector.addError(t);
        }

    }
}
