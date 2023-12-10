package page;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

By inputusername = By.xpath("//*[@id='loginusername']");

    By inputpassword = By.xpath("//*[@id='loginpassword']");
//    driver.get("https://jayjay.co/");
    //driver.findElement(By.xpath("//h1[text() = 'Gebrakan Kursus Online yang Siap Meroketkan Kariermu']")).isDisplayed();
    //driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div/div[2]/div[2]/a")).click();
By kliklogin = By.xpath("//*[@id='login2']");
    By klikloginn = By.xpath("//*[@id='logInModal']/div/div/div[3]/button[2]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }



    @Test
    public void userinputusername(String username){


        driver.findElement(kliklogin).click();
        driver.findElement(inputusername).sendKeys(username);

    }
    public void userinputpassword(String password) {

        driver.findElement(inputpassword).sendKeys(password);
    }
    public void klikloginn() {
        driver.findElement(klikloginn).click();
    }
}

