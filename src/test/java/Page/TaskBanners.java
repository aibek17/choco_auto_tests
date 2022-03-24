package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TaskBanners extends BasePage{
  public TaskBanners(WebDriver driver) {
    super(driver);
  }

  public void bannerIsDisplayed (){
    isElementDisplayed(By.xpath("//a/img[@class='banner_img'][5]"));
  }
}
