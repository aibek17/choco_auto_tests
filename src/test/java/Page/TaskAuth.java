package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TaskAuth extends BasePage{
  public TaskAuth(WebDriver driver) {
    super(driver);
  }

  public void butVhod (){
    click(By.xpath("//button[@class='profile__login cl-btn']"));
  }

  public void btnAuthVoiti (){
    click(By.xpath("//button[@class=' choco-button orange']"));
  }

  public void checkPageIsCorrect (){
    isElementDisplayed(By.xpath("//span[@class=\'profile__text\']"));
  }
}
