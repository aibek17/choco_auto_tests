package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BasePage {
  public WebDriver driver;
  public WebDriverWait wait;

  //Конструктор
  public BasePage(WebDriver driver) {
    this.driver = driver;
    wait = new WebDriverWait(driver, 15);
  }

  //Метод для ожидание элемента
  public void waitVisibility(By elementBy) {
    wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
  }

  //Метод нажатия на элемент
  public void click (By elementBy){
    waitVisibility(elementBy);
    driver.findElement(elementBy).click();
  }

  //Метод для ввода текста
  public void inputField (By elementBy){
    waitVisibility(elementBy);
    driver.findElement(elementBy).sendKeys();
  }

  //Отображается ли элемент
  public void isElementDisplayed (By elementBy){
    waitVisibility(elementBy);
    assertTrue(driver.findElement(elementBy).isDisplayed());
  }

  public void isElementNotDisplayed (By elementBy){
    waitVisibility(elementBy);
    assertFalse(driver.findElement(elementBy).isDisplayed());
  }
}
