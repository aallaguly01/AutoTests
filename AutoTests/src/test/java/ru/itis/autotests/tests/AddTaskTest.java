package ru.itis.autotests.tests;

import org.junit.Test;
import ru.itis.autotests.data.AccountData;

public class AddTaskTest extends TestBase{

    @Test
    public void testAddTask() throws Exception {
        app.getNavigation().openLoginPage();
        AccountData user = new AccountData("aallaguly01@gmail.com", "B1gather");
        app.getAuth().login(user);
        app.getNavigation().openHomePage();
        app.getAddTask().addTask("TEST!");
    }
}
