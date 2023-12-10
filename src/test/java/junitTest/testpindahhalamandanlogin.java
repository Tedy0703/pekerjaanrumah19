package junitTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import page.LoginPage;
import page.gantislide;
import page.pilihlaptop;

import java.time.Duration;


public class testpindahhalamandanlogin {



@Test
    public void hometest() {

    WebDriver driver = WebDriverManager.chromedriver().create();

//    HomePage homePage = new HomePage(driver);
//    LoginPage loginPage = new LoginPage(driver);
    gantislide Gantislide = new gantislide(driver);
    pilihlaptop Pilihlaptop = new pilihlaptop(driver);
    LoginPage loginPage = new LoginPage(driver);


    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    Gantislide.rubahslide();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
    Pilihlaptop.menampilkanlaptop();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
    Pilihlaptop.pilihlaptopp();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
    loginPage.userinputusername("coba13");
    loginPage.userinputpassword("coba23");
    loginPage.klikloginn();

//    loginPage.userinputemail("tedyheryana75@gmail.com");
//    loginPage.userinputpassword("");
//
//
//    loginPage.kliklogin();
    }
}
