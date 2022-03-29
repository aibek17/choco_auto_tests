package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TaskPurchases extends BasePage {
  public TaskPurchases(WebDriver driver) {
    super(driver);
  }

  public void btnMyPurchases() {
    click(By.xpath("//a[@href='/user/purchases/']"));
  }

  public void sectionActive() {
    click(By.xpath("//li[contains(text(), 'Действующие')]"));
  }

  public void isActPurchDisp() {
    isElementDisplayed(By.xpath("//li[@class='voucher__tag voucher__tag--rahmet']"));
  }

  public void sectionExpired() {
    click(By.xpath("//li[contains(text(), 'Истек срок действия')]"));
  }

  public void isExpPurchDisp() {
    isElementDisplayed(By.xpath("//h4[contains(text(), 'CarCat')]"));
  }

  public void sectionUsed() {
    click(By.xpath("//li[contains(text(), 'Использованные')]"));
  }

  public void isUsedPurchDisp() {
    isElementDisplayed(By.xpath("//h4[contains(text(), 'Bambino со скидкой до 50%!')]"));
  }

  public void btnFeedback() {
    click(By.xpath("//a[@href='https://chocolife.me/feedback/']"));
  }

  public void isFeedbackPageDisp() {
    isElementDisplayed(By.xpath("//h5[contains(text(), 'Форма обратной связи')]"));
  }

  public void sectionCheck() {
    click(By.xpath("//li[contains(text(), 'Чеки')]"));
  }

  public void isCheckPageDisp() {
    isElementDisplayed(By.xpath("//li[@class='check']"));
  }
}
