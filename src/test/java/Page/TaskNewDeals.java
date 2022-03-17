package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TaskNewDeals extends BasePage{

  public TaskNewDeals(WebDriver driver) {
    super(driver);
  }

  public void btnNextDeal(){
    click(By.xpath("//div/button[@class='news__arrow news__arrow--next']"));
  }

  public void dealActive(){
    isElementDisplayed(By.xpath("//div/a[@class='news__item swiper-slide swiper-slide-active']"));
  }

  public void dealBtnNext(){
   isElementDisplayed(By.xpath("//div/a[@class='news__item swiper-slide swiper-slide-prev']"));
  }
}
