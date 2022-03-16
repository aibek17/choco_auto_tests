package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TaskChangeCity extends BasePage{

  public TaskChangeCity(WebDriver driver) {
    super(driver);
  }

  public void buttonChCi(){
    click(By.xpath("//div/button[@class='cl-btn cl-btn--secondary']"));
  }

  public void changeCityArea(){
    click(By.xpath("//div/span[text() = 'Алматы']"));
  }

  public void changeToZhes(){
    click(By.xpath("(//li/span[text() = 'Жезказган'])[2]"));
  }

  public void cityIsZhes(){
    isElementDisplayed(By.xpath("//head/title[contains(text(), 'Жезказган')]"));
  }
}
