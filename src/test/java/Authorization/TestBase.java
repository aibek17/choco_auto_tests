package Authorization;

import Page.Main;
import Page.TaskOne;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class TestBase {
  String mainDevUrl = "https://chocodev.kz/";
  String mainProdUrl = "https://chocolife.me/";
  WebDriver driver;
  public Main main;
  public TaskOne taskOne;
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
    main = PageFactory.initElements(driver, Main.class);
    taskOne = PageFactory.initElements(driver, TaskOne.class);
  }

  @AfterEach
  public void finish() {
    driver.quit();
  }
}
