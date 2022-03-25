package Tests;

import org.junit.jupiter.api.Test;

public class Banners extends TestBase{

  @Test
  public void isBannerDisp() throws InterruptedException{
    main.goTo();
//    Thread.sleep(2000);
    taskBanners.bannerIsDisplayed();
  }
}
