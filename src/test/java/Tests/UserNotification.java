package Tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class UserNotification extends TestBase{

  public void goToNotificationPage() {
    main.goTo();
    taskAuth.butVhod();
    driver.findElement(By.xpath(login)).sendKeys("kabi.a@chocolife.kz", Keys.ENTER);
    driver.findElement(By.xpath(pass)).sendKeys("87783423808zZ");
    taskAuth.btnAuthVoiti();
    taskAuth.btnSkeepBlackScreen();
    taskMyData.btnMyProfile();
    taskUserNotification.btnNotification();
  }

  // Надо разобраться как можно генерить уведы и сделать проверки на кнопку удалить и очистить все

  @Test
  public void notifyNumb(){
    goToNotificationPage();
    taskUserNotification.isNotifyPageDisp();
    taskUserNotification.isNotifyPageElementsDisp();
  }
}
