package Authorization;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestBase {
  String mainDevUrl = "https://chocodev.kz/";
  WebDriver driver;
  String btnVoiti = "//button[@class='profile__login cl-btn']";
  String authInput = "//div/input[@class='form-control']";
  String pass = "//div/input[@type=\'password\']";
  String btnAuthVoiti = "//button[@class=' choco-button orange']";
  String profileText = "//span[@class=\'profile__text\']";

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
