package Tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class FavorDeal extends TestBase{

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
  public void addToFavFromDealPageDelOne(){    //Добавление в избранное со страницы акции и удаление с избранного со страницы Избранное
    goToDealPage();
    driver.findElement(By.xpath(searchArea)).sendKeys("CarCat", Keys.ENTER);
    main.goToDeal();
    taskFavorDeal.btnAddToFavDeal();
    taskFavorDeal.isFavNumbDisp();   //Отображение количество акций в хэдере возле "Избранное"
    taskFavorDeal.btnFavPage();
    taskFavorDeal.isDealDispInFavPage();   //Отображение акции на странице избранное
    taskFavorDeal.btnOffFavDeal();
    taskFavorDeal.isFavDealNotF();   //Проверка на то, что акция успешно удалилась с избранного
  }

  @Test
  public void addToFavFromDealPageDelTwo(){   //Добавление в избранное со страницы акции и удаление с избранного со страницы акции
    goToDealPage();
    driver.findElement(By.xpath(searchArea)).sendKeys("CarCat", Keys.ENTER);
    main.goToDeal();
    taskFavorDeal.btnAddToFavDeal();
    taskFavorDeal.isFavNumbDisp();   //Отображение количество акций в хэдере возле "Избранное"
    taskFavorDeal.btnFavOffDealPage();
    taskFavorDeal.btnFavPage();
    taskFavorDeal.isFavDealNotF();   //Проверка на то, что акция успешно удалилась с избранного
  }

  @Test
  public void addToFavFromMainDelFavPage() throws InterruptedException {  //Добавление в избранное с главной и удаление на странице Избранное
    goToDealPage();
    driver.findElement(By.xpath(searchArea)).sendKeys("CarCat", Keys.ENTER);
    Thread.sleep(3000);
    taskFavorDeal.btnFavMainPage();
    taskFavorDeal.btnFavPage();
    taskFavorDeal.isDealDispInFavPage();   //Отображение акции на странице избранное
    taskFavorDeal.btnOffFavDeal();
    taskFavorDeal.isFavDealNotF();   //Проверка на то, что акция успешно удалилась с избранного
  }

  @Test
  public void addToFavFromMainDelMain() throws InterruptedException {  //Добавление в избранное с главной и удаление на Главной
    goToDealPage();
    driver.findElement(By.xpath(searchArea)).sendKeys("CarCat", Keys.ENTER);
    Thread.sleep(3000);
    taskFavorDeal.btnFavMainPage();
    taskFavorDeal.btnFavMainPage();
    taskFavorDeal.btnFavPage();
    taskFavorDeal.isFavDealNotF();   //Проверка на то, что акция успешно удалилась с избранного
  }
}
