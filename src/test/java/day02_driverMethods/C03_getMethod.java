package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_getMethod {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //1. Yeni bir package olusturalim : day01
        //2. Yeni bir class olusturalim : C01_GetMethods
        //3. Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        //4. Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());
        //5. Sayfa basliginin “Amazon” icerdigini test edin
        String actualTitle = driver.getTitle();
        String arananKelime = "Amazon";
        if (actualTitle.contains(arananKelime))
            System.out.println("Amazon içeriyor");
        //6. Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());
        //7. Sayfa url’inin “amazon” icerdigini test edin.
        String actualUrl = driver.getCurrentUrl();
        String arananUrl = "amazon";
        if (actualUrl.contains("amazon"))
            System.out.println("url amazon içeriyor ");
        //8. Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandles());
        //9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
        String actualHtml = driver.getPageSource();
        String arananKelimeHtml = "alisveris";
        if (actualHtml.contains(arananKelimeHtml))
            System.out.println("alisveris içeriyor");
        else System.out.println("alisveris içermiyor");
        //10. Sayfayi kapatin.
        driver.close();


    }
}
