package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TaskBasket extends BasePage{
  public TaskBasket(WebDriver driver) {
    super(driver);
  }

  public void btnAddToBasket() {
    click(By.xpath("//button[@class='cl-btn--secondary cl-btn ddi-choose__btn ng-star-inserted']"));
  }

  public void btnGoToBasketPage() {
    click(By.xpath("//a[@href='/cart/view/']"));
  }

  public void isDealDispInBasketPage (){
    isElementDisplayed(By.xpath("//div[@class='offer ng-star-inserted']"));
  }

  public void btnDelDealFromBasketPage() {
    click(By.xpath("//span[contains(text(), 'Удалить')]"));
  }

  public void isDealDelFromBasketPage (){
    isElementDisplayed(By.xpath("//div[contains(text(), 'Корзина пуста')]"));
  }

  public void btnDelDealFromBasketPageMinus() {
    click(By.xpath("//button[@class='offer__minus']"));
  }

  public void isBasketNumbDisp (){
    isElementDisplayed(By.xpath("//strong[@class='ng-star-inserted']"));
  }

  public void btnGoBasketPage() {
    click(By.xpath("//button[@class='callToGo__btn']"));
  }

  public void btnBuyGoBasketPage() {
    click(By.xpath("//button[@class='cl-btn ddi-choose__btn ng-star-inserted']"));
  }

  public void isBackToDealPage (){
    isElementDisplayed(By.xpath("//h4[@class='cl-info__heading ng-star-inserted']"));
  }

  public void btnChSert() {
    click(By.xpath("//button[@class='cl-btn d-detail__choose']"));
  }

  public void btnChSertBuy() {
    click(By.xpath("//*[@id=\"cl-main\"]/cl-deals/cl-deals-detail/div/cl-modal[1]/div/div[2]/cl-offers/article/section/div/div/div[2]/button[1]"));
  }

  public void btnChSertAddToBasket() {
    click(By.xpath("//*[@id=\"cl-main\"]/cl-deals/cl-deals-detail/div/cl-modal[1]/div/div[2]/cl-offers/article/section/div/div/div[2]/button[2]"));
  }
}