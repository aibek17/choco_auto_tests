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

  public void inpArea(String inpVar, Keys enter){
    inputField(By.xpath("//div/input[@class='ng-untouched ng-pristine ng-valid']"));
  }

  public void searchIsCorrect (){
    isElementDisplayed(By.xpath("//*[text() = 'По Вашему запросу были найдены']"));
  }

  public void searchNotFound (){
    isElementDisplayed(By.xpath("//*[text() = 'К сожалению, не удалось найти акции по вашему запросу']"));
  }
}
