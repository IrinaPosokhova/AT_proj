package App;

import App.pages.LoginPage;

public class PageBuilder {

    public static LoginPage buildLoginPage() {
        return new LoginPage("/admin/login");
    }
}
