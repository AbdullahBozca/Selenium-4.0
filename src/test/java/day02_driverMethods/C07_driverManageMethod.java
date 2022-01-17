package day02_driverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_driverManageMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //1. Yeni bir Class olusturalim.C07_ManageWindowSet
        //2. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.navigate().to("https://amazon.com");
        //3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("ilk açıldığı konum : "+driver.manage().window().getPosition());
        System.out.println("ilk açıldığı boyut : "+driver.manage().window().getSize());
        //4. Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setPosition(new Point(15,15));
        driver.manage().window().setSize(new Dimension(500,600));
        //5. Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        System.out.println("değiştirilmiş konum : "+driver.manage().window().getPosition());
        System.out.println("değiştirilmiş boyut : "+driver.manage().window().getSize());
        int xkoordinat=driver.manage().window().getPosition().getX();
        int ykoordinat=driver.manage().window().getPosition().getY();
        int genislik=driver.manage().window().getSize().getWidth();
        int yukseklik=driver.manage().window().getSize().getHeight();
        if (xkoordinat==15 && ykoordinat==15 && genislik==500 && yukseklik==600)
            System.out.println("ölçeklendirme doğru");
        else
            System.out.println("ölçeklendirme yanlış");
        Thread.sleep(3000);
        //8. Sayfayi kapatin
        driver.close();
    }
}
