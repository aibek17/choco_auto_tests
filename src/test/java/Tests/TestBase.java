package Tests;

import Page.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class TestBase {
  WebDriver driver;
  public Main main;
  public TaskSearch taskSearch;
  public TaskAuth taskAuth;
  public TaskChangeCity taskChangeCity;
  public TaskNewDeals taskNewDeals;
  public TaskBanners taskBanners;
  public TaskMyData taskMyData;
  public TaskPurchases taskPurchases;
  public TaskUserNotification taskUserNotification;
  String login = "//div/input[@class='form-control']";    //Поле для ввода логина в форме авторизации
  String pass = "//div/input[@type=\'password\']";    //Поле для ввода пароля в форме авторизации
  String searchArea = "//div/input[@class='ng-untouched ng-pristine ng-valid']"; //Поле для поиска на главной странице
  String changeNumbArea = "//div/input[@class='ng-untouched ng-pristine ng-invalid']";
  String areaForChangePassOne = "//input[@class='ng-untouched ng-pristine ng-invalid'][1]";

  public void goToPersonalData(){
    main.goTo();
    taskAuth.butVhod();
    driver.findElement(By.xpath(login)).sendKeys("kabi.a@chocolife.kz", Keys.ENTER);
    driver.findElement(By.xpath(pass)).sendKeys("87783423808zZ");
    taskAuth.btnAuthVoiti();
    taskAuth.btnSkeepBlackScreen();
    taskMyData.btnMyProfile();
    taskMyData.btnMyData();
  }

  @BeforeEach
  public void start() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    main = PageFactory.initElements(driver, Main.class);
    taskSearch = PageFactory.initElements(driver, TaskSearch.class);
    taskAuth = PageFactory.initElements(driver, TaskAuth.class);
    taskChangeCity = PageFactory.initElements(driver, TaskChangeCity.class);
    taskNewDeals = PageFactory.initElements(driver, TaskNewDeals.class);
    taskBanners = PageFactory.initElements(driver, TaskBanners.class);
    taskMyData = PageFactory.initElements(driver, TaskMyData.class);
    taskPurchases = PageFactory.initElements(driver, TaskPurchases.class);
    taskUserNotification = PageFactory.initElements(driver, TaskUserNotification.class);
  }

  @AfterEach
  public void finish() {
    driver.quit();
  }
}
