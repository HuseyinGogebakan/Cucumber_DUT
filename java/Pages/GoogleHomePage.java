package Pages;

import org.openqa.selenium.By;
import utils.Driver;

public class GoogleHomePage {


    By search = By.name("q");


    public void searchfor(String searchkey ){
        Driver.getDriver().findElement(search).sendKeys(searchkey);

    }

    public void  click(){
        Driver.getDriver().findElement(search).submit();
    }
}
