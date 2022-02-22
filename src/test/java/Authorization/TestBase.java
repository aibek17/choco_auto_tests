package Authorization;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestBase {
  String mainDevUrl = "https://chocodev.kz/";
  WebDriver driver;
  //WebElement btnVoiti = driver.findElement(By.xpath("//button[@class='profile__login cl-btn']"));
  //WebElement authInput = driver.findElement(By.xpath("//div/input[@class='form-control']"));
  String btnVoiti = "//button[@class='profile__login cl-btn']";
  String authInput = "//div/input[@class='form-control']";

  @BeforeEach
  public void start() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterEach
  public void finish() {
    driver.quit();
  }
}
