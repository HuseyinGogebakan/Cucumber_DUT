package Pages;

import org.openqa.selenium.By;
import utils.Driver;

public class OrangePage {


    By username = By.xpath("//input[@placeholder='Username']");
    By password = By.xpath("//input[@placeholder='Password']");



    public void enter_usernameand(String username_ent){
        Driver.getDriver().findElement(username).sendKeys(username_ent);

    }
    public void  enterpasswordclick(String password_ent){
        Driver.getDriver().findElement(password).sendKeys(password_ent);
        Driver.getDriver().findElement(password).submit();
    }
}
