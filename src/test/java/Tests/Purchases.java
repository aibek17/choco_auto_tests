package Tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Purchases extends TestBase {

  public void goToPurchasesPage() {
    main.goTo();
    taskAuth.butVhod();
    driver.findElement(By.xpath(login)).sendKeys("kabi.a@chocolife.kz", Keys.ENTER);
    driver.findElement(By.xpath(pass)).sendKeys("87783423808zZ");
    taskAuth.btnAuthVoiti();
    taskAuth.btnSkeepBlackScreen();
    taskMyData.btnMyProfile();
    taskPurchases.btnMyPurchases();
  }

  @Test
  public void purchAllTests() {
    goToPurchasesPage();
    taskPurchases.sectionActive();
    taskPurchases.isActPurchDisp();
    taskPurchases.sectionExpired();
    taskPurchases.isExpPurchDisp();
    taskPurchases.sectionUsed();
    taskPurchases.isUsedPurchDisp();
    taskPurchases.sectionCheck();
    taskPurchases.isCheckPageDisp();
    taskPurchases.sectionUsed();
    taskPurchases.btnFeedback();
    taskPurchases.isFeedbackPageDisp();
  }

//  @Test
//  public void purchActive(){  //Отображение элементов в разделе "Действующие"
//    goToPurchasesPage();
//    taskPurchases.sectionActive();
//    taskPurchases.isActPurchDisp();
//  }
//
//  @Test
//  public void purchExpired(){ //Отображение элементов в разделе "Истек срок действия"
//    goToPurchasesPage();
//    taskPurchases.sectionExpired();
//    taskPurchases.isExpPurchDisp();
//  }
//
//  @Test
//  public void purchUsed() throws InterruptedException{  //Отображение элементов в разделе "Использованные"
//    goToPurchasesPage();
//    Thread.sleep(2000);
//    taskPurchases.sectionExpired();
//    taskPurchases.sectionUsed();
//    taskPurchases.isUsedPurchDisp();
//  }
//
//  @Test
//  public void purchFOS() throws InterruptedException{ //Переход по кнопке "Сообщите нам" на страницу ФОС
//    goToPurchasesPage();
//    Thread.sleep(2000);
//    taskPurchases.sectionExpired();
//    taskPurchases.sectionUsed();
//    taskPurchases.btnFeedback();
//    taskPurchases.isFeedbackPageDisp();
//  }
//
//  @Test
//  public void purchCheck() throws InterruptedException{ //Отображение элементов в разделе "Чеки"
//    goToPurchasesPage();
//    Thread.sleep(2000);
//    taskPurchases.sectionExpired();
//    taskPurchases.sectionCheck();
//    taskPurchases.isCheckPageDisp();
//  }
}
