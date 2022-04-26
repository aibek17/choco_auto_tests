package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class taskPayBCard extends BasePage{
  public taskPayBCard(WebDriver driver) {
    super(driver);
  }

  public void btnBankCard() {
    click(By.xpath("//span[contains(text(), 'Банковской картой')]"));
  }

  public void btnWithOutSave() {
    click(By.xpath("//span[contains(text(), 'Без сохранения')]"));
  }

  public void btnPayOrder() {
    click(By.xpath("//button[contains(text(), 'Оплатить')]"));
  }

  public void inputCardReference() throws InterruptedException {
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@class='epay_input1']")).sendKeys("5169 4931 2410 8567");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@class='epay_input2']")).sendKeys("1224");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@class='epay_input3']")).sendKeys("AIBEK KABI");
    driver.findElement(By.xpath("//input[@class='epay_input4']")).sendKeys("899");
  }
}
