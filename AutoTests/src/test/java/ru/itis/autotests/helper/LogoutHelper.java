package ru.itis.autotests.helper;

import org.openqa.selenium.By;
import ru.itis.autotests.ApplicationManager;

public class LogoutHelper extends HelperBase{

    public LogoutHelper(ApplicationManager manager) {
        super(manager);
    }

    public void logout(){
        driver.findElement(By.cssSelector("div.form-inline.desktop-only > div.habitica-menu-dropdown.dropdown.item-user.item-with-icon > div.habitica-menu-dropdown-toggle > div > div > div.top-menu-icon.svg-icon.user > svg > path")).click();
        driver.findElement(By.xpath("//div[@id='menu_collapse']/div[2]/div[2]/div[2]/div/a[9]")).click();
    }
}
