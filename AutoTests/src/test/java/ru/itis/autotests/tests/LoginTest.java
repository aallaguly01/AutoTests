package ru.itis.autotests.tests;

import org.junit.*;

import ru.itis.autotests.data.AccountData;

public class LoginTest extends TestBase{


    @Test
    public void testLogin() throws Exception {
        app.getNavigation().openLoginPage();
        AccountData user = new AccountData("aallaguly01@gmail.com", "*");
        app.getAuth().login(user);
    }
}

