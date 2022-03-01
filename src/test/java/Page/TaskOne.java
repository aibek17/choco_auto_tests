package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TaskOne extends BasePage{
  public TaskOne(WebDriver driver) {
    super(driver);
  }

  public void checkPageIsCorrect (){
    isElementDisplayed(By.xpath("//span[@class=\'profile__text\']"));
  }
}
