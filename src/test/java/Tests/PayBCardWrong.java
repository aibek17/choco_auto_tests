package Tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class PayBCardWrong extends TestBase{

  public void goToDealPage() {
    main.goTo();
    taskAuth.butVhod();
    driver.findElement(By.xpath(login)).sendKeys("kabi.a@chocolife.kz", Keys.ENTER);
    driver.findElement(By.xpath(pass)).sendKeys("87783423808zZ");
    taskAuth.btnAuthVoiti();
    taskAuth.btnSkeepBlackScreen();
    taskChangeCity.buttonChCiChi();
    taskChangeCity.changeToUra();
    driver.findElement(By.xpath(searchArea)).sendKeys("CarCat", Keys.ENTER);
    main.goToDeal();
  }

  @Test
  public void buyByChSert() throws InterruptedException {
    goToDealPage();
    taskBasket.btnChSert();
    taskBasket.btnChSertBuy();
    taskPayBCard.btnBankCard();
    taskPayBCard.btnWithOutSave();
    taskPayBCard.btnPayOrder();
    taskPayBCard.inputCardReference();
  }
}
