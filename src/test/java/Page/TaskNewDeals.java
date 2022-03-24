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

//  public void btnPrevDeal(){
//    click(By.xpath("//div/button[@class='news__arrow news__arrow--prev']"));
//  }

  public void dealActive(){
    isElementDisplayed(By.xpath("//div/a[@class='news__item swiper-slide swiper-slide-active']"));
  }

  public void dealBtnNext(){
   isElementDisplayed(By.xpath("//div/a[@class='news__item swiper-slide swiper-slide-prev']"));
  }

  public void btnShowAll(){
    click(By.xpath("//div/button[@class='news__link']"));
  }

  public void checkPageShowAll(){
    isElementDisplayed(By.xpath("//cl-deals-list/h1[contains(text(), 'Новые в Алматы')]"));
  }

//  public void checkBtnPrevNotShow(){
//    isElementDisplayed(By.xpath("//div/button[@class='news__arrow news__arrow--prev swiper-button-disabled']"));
//  }

}
