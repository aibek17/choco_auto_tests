package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TaskUserNotification extends BasePage{
  public TaskUserNotification(WebDriver driver) {
    super(driver);
  }

  public void btnNotification() {
    click(By.xpath("//a[@href='/user/notify/']"));
  }

  public void isNotifyPageElementsDisp() {
    isElementDisplayed(By.xpath("//span[contains(text(), 'На Ваш вопрос поступил ответ.')]"));
  }

  public void isNotifyPageDisp() {
    isElementDisplayed(By.xpath("//h2[contains(text(), 'Мои уведомления')]"));
  }

}
