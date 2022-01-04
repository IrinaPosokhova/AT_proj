package App;

import App.pages.LoginPage;

public class app {
    public LoginPage loginPage;

    public app() {
        loginPage = PageBuilder.buildLoginPage();
    }
}
