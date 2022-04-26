package Tests;

import org.junit.jupiter.api.Test;

public class Banners extends TestBase{

  @Test
  public void isBannerDisp() throws InterruptedException{
    main.goTo();
    taskBanners.bannerIsDisplayed();
    //taskBanners.btnBannerOne();
    taskBanners.btnBannerTwo();
    taskBanners.btnBannerThree();
    taskBanners.btnBannerFour();
  }

//  @Test
//  public void allBannerTests(){
//    main.goTo();
//    taskBanners.btnBannerFour();
//    taskBanners.btnBannerLinkOne();
//    taskBanners.isBannerLinkPageDisp();
//    main.goTo();
//    taskBanners.btnBannerTwo();
//    taskBanners.btnBannerLinkTwo();
//    taskBanners.isBannerLinkPageDisp();
//    main.goTo();
//    taskBanners.btnBannerThree();
//    taskBanners.btnBannerLinkThree();
//    taskBanners.isBannerLinkPageDisp();
//    main.goTo();
//    taskBanners.btnBannerFour();
//    taskBanners.btnBannerLinkFour();
//    taskBanners.isBannerLinkPageDisp();
//  }

  @Test
  public void bannerLinkOne(){
    main.goTo();
    taskBanners.btnBannerFour();
    taskBanners.btnBannerLinkOne();
    taskBanners.isBannerLinkPageDisp();
  }

  @Test
  public void bannerLinkTwo(){
    main.goTo();
    taskBanners.btnBannerTwo();
    taskBanners.btnBannerLinkTwo();
    taskBanners.isBannerLinkPageDisp();
  }

  @Test
  public void bannerLinkThree(){
    main.goTo();
    taskBanners.btnBannerThree();
    taskBanners.btnBannerLinkThree();
    taskBanners.isBannerLinkPageDisp();
  }

  @Test
  public void bannerLinkFour(){
    main.goTo();
    taskBanners.btnBannerFour();
    taskBanners.btnBannerLinkFour();
    taskBanners.isBannerLinkPageDisp();
  }
}
