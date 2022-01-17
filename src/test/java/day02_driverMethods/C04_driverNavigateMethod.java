package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_driverNavigateMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://amazon.com");//driver.get ile aynı işlem yapar ancak driver.get e göre daha hızlıdır
        // yeni bir driver objesi oluşturulmadığı için amazon çalışır ardından techproeducation aynı pencerede çalışır.
        driver.navigate().to("http://www.techproeducation.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }
}
