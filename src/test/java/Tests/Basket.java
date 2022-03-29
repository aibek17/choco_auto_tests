package Tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Basket extends TestBase{

  public void goToDealPage() {
    main.goTo();
    taskAuth.butVhod();
    driver.findElement(By.xpath(login)).sendKeys("kabi.a@chocolife.kz", Keys.ENTER);
    driver.findElement(By.xpath(pass)).sendKeys("87783423808zZ");
    taskAuth.btnAuthVoiti();
    taskAuth.btnSkeepBlackScreen();
    taskChangeCity.buttonChCi();
    taskChangeCity.changeToUra();
  }

  @Test
  public void addToBasketDel(){   //Добавление в корзину через кнопку "В корзину" и удаление через кнопку "Удалить"
    goToDealPage();
    driver.findElement(By.xpath(searchArea)).sendKeys("CarCat", Keys.ENTER);
    main.goToDeal();
    taskBasket.btnAddToBasket();
    taskBasket.isBasketNumbDisp();
    taskBasket.btnGoToBasketPage();
    taskBasket.isDealDispInBasketPage();
    taskBasket.btnDelDealFromBasketPage();
    taskBasket.isDealDelFromBasketPage();
  }

  @Test
  public void addToBasketGoFromNewWindDelMinus() throws InterruptedException {   //Добавление в корзину через кнопку "В корзину" и удаление через кнопку Минус
    goToDealPage();
    driver.findElement(By.xpath(searchArea)).sendKeys("CarCat", Keys.ENTER);
    main.goToDeal();
    taskBasket.btnAddToBasket();
    taskBasket.isBasketNumbDisp();
    Thread.sleep(3000);
    taskBasket.btnGoBasketPage();
    taskBasket.isDealDispInBasketPage();
    Thread.sleep(3000);
    taskBasket.btnDelDealFromBasketPageMinus();
    taskBasket.isDealDelFromBasketPage();
  }

  @Test
  public void addToBasketGoFromButBuy() {   //Проверка через кнопку "Купить"
    goToDealPage();
    driver.findElement(By.xpath(searchArea)).sendKeys("CarCat", Keys.ENTER);
    main.goToDeal();
    taskBasket.btnBuyGoBasketPage();
    taskBasket.isDealDispInBasketPage();
    taskBasket.btnDelDealFromBasketPageMinus();
    taskBasket.isBackToDealPage();   //Проверка на то, что после нажатия на "Минус" прошел редирект обратно на страницу акции
  }

  @Test
  public void addToBasketSertBuy() {   //Проверка через подраздел "Выбрать Сертификат" через кнопку "Купить"
    goToDealPage();
    driver.findElement(By.xpath(searchArea)).sendKeys("CarCat", Keys.ENTER);
    main.goToDeal();
    taskBasket.btnChSert();
    taskBasket.btnChSertBuy();
    taskBasket.isDealDispInBasketPage();
    taskBasket.btnDelDealFromBasketPage();
    taskBasket.isBackToDealPage();
  }

  @Test
  public void addToBasketSertAddToBasket() throws InterruptedException {   //Проверка через подраздел "Выбрать Сертификат" через кнопку "В корзину"
    goToDealPage();
    driver.findElement(By.xpath(searchArea)).sendKeys("CarCat", Keys.ENTER);
    main.goToDeal();
    taskBasket.btnChSert();
    taskBasket.btnChSertAddToBasket();
    Thread.sleep(3000);
    taskBasket.btnGoBasketPage();
    taskBasket.isDealDispInBasketPage();
    Thread.sleep(3000);
    taskBasket.btnDelDealFromBasketPageMinus();
    taskBasket.isDealDelFromBasketPage();
  }
}
