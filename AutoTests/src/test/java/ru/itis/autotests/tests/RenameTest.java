package ru.itis.autotests.tests;

import org.junit.Test;
import ru.itis.autotests.data.AccountData;

public class RenameTest extends TestBase{

    @Test
    public void testRename(){
//        app.getNavigation().openLoginPage();
//        AccountData user = new AccountData("aallaguly01@gmail.com", "*");
//        app.getAuth().login(user);
        app.getNavigation().openHomePage();
        app.getRename().rename("123");
    }
}
