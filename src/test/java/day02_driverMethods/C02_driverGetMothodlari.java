package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_driverGetMothodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");
        System.out.println(driver.getTitle());//sayfanın title ını getirir
        System.out.println(driver.getCurrentUrl());//sayfa adersini getirir
        System.out.println(driver.getPageSource());//kaynak dosyayı getirir
        System.out.println(driver.getWindowHandle());
    }
}
