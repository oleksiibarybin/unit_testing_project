import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class testSite {
    public static WebDriver driver;

    @BeforeEach
    public  void openChrome(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void CheckNoSearchResultsMessage() throws InterruptedException{
        Thread.sleep(3000);
        driver.get("https://zironka.ua");
        Thread.sleep(3000);
        WebElement searchBox = driver.findElement(By.name("q"));
        WebElement searchButton = driver.findElement(By.xpath("//*[@class='button button_size-l header__search-btn']"));
        searchBox.sendKeys("qwertyuiop");
        searchButton.click();
        String actualMessage = driver.findElement(By.xpath("//*[@class= 'empty-catalog-message']")).getText();
        Assertions.assertEquals("Товари не знайдені", actualMessage);
    }

    @Test
    public void checkTitle() throws InterruptedException {
        Thread.sleep(3000);
        driver.get("https://zironka.ua");
        String input = "Сукня";
        WebElement searchBox = driver.findElement(By.name("q"));
        WebElement searchButton = driver.findElement(By.xpath("//*[@class='button button_size-l header__search-btn']"));
        searchBox.sendKeys(input);
        searchButton.click();
        Thread.sleep(3000);
        List<WebElement> output = driver.findElements(By.xpath("//*[@class='product-preview__title']"));
        List<String> title = new ArrayList<>();
        for(WebElement element: output){
            title.add(element.getText());
        }
        for(String element: title){
            Assertions.assertTrue(element.contains(input));
        }
    }

    @Test
    public void checkEmail() throws InterruptedException {
        Thread.sleep(3000);
        driver.get("https://zironka.ua");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class='header__control-btn header__cabinet']")).click();
        driver.findElement(By.id("email")).sendKeys("g2gg2g");
        driver.findElement(By.id("password")).sendKeys("g2gg2g");
        driver.findElement(By.xpath("//*[@class='co-button co-form-button js-co-login-submit']")).click();
        Thread.sleep(3000);
        String actual = driver.findElement(By.xpath("//*[@class='co-notice--danger co-notice--flash']")).getText();
        Assertions.assertEquals("Таке поєднання логіну та паролю невірне", actual);
    }

    @AfterEach
    public void browserClose(){
        driver.close();
    }

}
