package Tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.openqa.selenium.By.xpath;

public class NewDeals extends TestBase{

  @Test
  public void testSlideIsDisp() throws InterruptedException{
    main.goTo();
    taskNewDeals.dealActive();
  }

  @Test
  public void testBtnShowAll() throws InterruptedException{
    main.goTo();
    taskNewDeals.btnShowAll();
    taskNewDeals.checkPageShowAll();
  }

  @Test
  public void testBtnNext() throws InterruptedException{
    main.goTo();
    taskNewDeals.btnNextDeal();
    taskNewDeals.dealBtnNext();
  }

//  @Test
//  public void testBtnPrev() throws InterruptedException{
//    String deal;
//    main.goTo();
//    deal = driver.findElement(By.xpath("//div/a[@class='news__item swiper-slide ng-star-inserted swiper-slide-active']")).getAttribute($deal->xpath("//div/a/@href"));
//    taskNewDeals.btnNextDeal();
//    taskNewDeals.btnPrevDeal();
//    Thread.sleep(2000);
//    assertTrue(driver.findElement(By.xpath("//div/a[@href=deal]")).isDisplayed());
//    //taskNewDeals.checkBtnPrevNotShow();
//  }
}
