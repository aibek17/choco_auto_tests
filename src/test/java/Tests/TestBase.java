package Tests;

import Page.Main;
import Page.TaskAuth;
import Page.TaskSearch;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class TestBase {
  WebDriver driver;
  public Main main;
  public TaskSearch taskSearch;
  public TaskAuth taskAuth;
  String login = "//div/input[@class='form-control']";    //Поле для ввода логина в форме авторизации
  String pass = "//div/input[@type=\'password\']";    //Поле для ввода пароля в форме авторизации
  String searchArea = "//div/input[@class='ng-untouched ng-pristine ng-valid']"; //Поле для поиска на главной странице
//  String mainDevUrl = "https://chocodev.kz/";
//  String mainProdUrl = "https://chocolife.me/";
//  String bunVhod = "//button[@class='profile__login cl-btn']";   //кнопка "Войти"

  @BeforeEach
  public void start() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    main = PageFactory.initElements(driver, Main.class);
    taskSearch = PageFactory.initElements(driver, TaskSearch.class);
    taskAuth = PageFactory.initElements(driver, TaskAuth.class);
  }

  @AfterEach
  public void finish() {
    driver.quit();
  }
}
