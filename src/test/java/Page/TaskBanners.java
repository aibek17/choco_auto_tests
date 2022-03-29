package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TaskBanners extends BasePage{
  public TaskBanners(WebDriver driver) {
    super(driver);
  }

  public void bannerIsDisplayed (){
    isElementDisplayed(By.xpath("//div[@class='banners__wrp']"));
  }

  public void btnBannerOne() {
    click(By.xpath("//div/span[@index='0']"));
  }

  public void btnBannerTwo() {
    click(By.xpath("//div/span[@index='1']"));
  }

  public void btnBannerThree() {
    click(By.xpath("//div/span[@index='2']"));
  }

  public void btnBannerFour() {
    click(By.xpath("//div/span[@index='3']"));
  }

  public void btnBannerLinkOne() {
    click(By.xpath("//a[@aria-label='1 / 4']"));
  }

  public void btnBannerLinkTwo() {
    click(By.xpath("//a[@aria-label='2 / 4']"));
  }

  public void btnBannerLinkThree() {
    click(By.xpath("//a[@aria-label='3 / 4']"));
  }

  public void btnBannerLinkFour() {
    click(By.xpath("//a[@aria-label='4 / 4']"));
  }

  public void isBannerLinkPageDisp (){
    isElementDisplayed(By.xpath("//span[@itemprop='name']"));
  }
}
