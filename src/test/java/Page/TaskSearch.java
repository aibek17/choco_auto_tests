package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class TaskSearch extends BasePage{
  public TaskSearch(WebDriver driver) {
    super(driver);
  }

  public void searchArea(){
    click(By.xpath("//div/input[@class='ng-untouched ng-pristine ng-valid'']"));
  }

  public void btnSearch () {
    click(By.xpath("//div/button[@class='cl-btn']"));
  }

  public void inpArea(String inpVar, Keys enter){
    inputField(By.xpath("//div/input[@class='ng-untouched ng-pristine ng-valid']"));
  }

  public void searchIsCorrect (){
    isElementDisplayed(By.xpath("//div/h3[contains(text(), 'акияж')]"));
  }

  public void searchEngIsCorrect (){
    isElementDisplayed(By.xpath("//div/h3[contains(text(), 'ымбулак')]"));
  }

  public void searchMoreSpaces (){
    isElementDisplayed(By.xpath("//div/h3[contains(text(), 'обследование')]"));
  }

  public void searchNotFound (){
    isElementDisplayed(By.xpath("//*[text() = 'К сожалению, не удалось найти акции по вашему запросу']"));
  }

  public void searchIsCorrectList (){
    isElementDisplayed(By.xpath("//div/p[contains(text(), 'акияж')]"));
  }

  public void btnSearchList () {
    click(By.xpath("//ul/li[@class='search__all']"));
  }
}
