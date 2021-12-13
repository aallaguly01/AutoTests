package ru.itis.autotests.tests;

import org.junit.Test;
import ru.itis.autotests.ApplicationManager;
import ru.itis.autotests.data.AccountData;
import ru.itis.autotests.helper.HelperBase;

public class LogoutTest extends TestBase {

    @Test
    public void logout(){
//        app.getNavigation().openLoginPage();
//        AccountData user = new AccountData("aallaguly01@gmail.com", "*");
//        app.getAuth().login(user);
        app.getNavigation().openHomePage();
        app.getLogout().logout();
    }
}
