package ru.itis.autotests;

import org.junit.*;

import ru.itis.autotests.data.AccountData;

public class HabiticaLoginTest extends TestBase{

    AccountData user = new AccountData("aallaguly01@gmail.com", "B1gather");

    @Test
    public void testHabiticaLogin() throws Exception {
        openHomePage();
        login(user);
    }
}

