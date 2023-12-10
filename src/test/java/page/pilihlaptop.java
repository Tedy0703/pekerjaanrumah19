package page;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class pilihlaptop {


    WebDriver driver;


    public pilihlaptop(WebDriver driver) {
        this.driver = driver;
    }

    @Test
    public void menampilkanlaptop(){
//        WebDriver driver;
//    ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
//        options.addArguments("--no-sandbox");
//        options.addArguments("--disable-dev-shm-usage");
//        options.addArguments("--remote-allow-origins=*");
//        WebDriverManager.chromedriver().setup();
////        driver = new ChromeDriver();
////        driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/a[3]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
    }
//*[@id="itemc"]
public void pilihlaptopp(){

    driver.findElement(By.xpath("//*[@id='tbodyid']/div[1]/div/div/h4/a")).click();
    driver.findElement(By.xpath("//*[@id='tbodyid']/div[2]/div/a")).click();
    //*[@id="tbodyid"]/div[2]/div/a
}
}
//*[@id="carouselExampleIndicators"]/a[2]/span[1]

//*[@id="tbodyid"]/div[1]/div/div/h4/a
