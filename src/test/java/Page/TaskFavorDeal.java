package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TaskFavorDeal extends BasePage{
  public TaskFavorDeal(WebDriver driver) {
    super(driver);
  }

  public void btnAddToFavDeal() {
    click(By.xpath("//*[@id=\"cl-main\"]/cl-deals/cl-deals-detail/div/section[2]/div[1]/div[5]/button"));
  }

  public void btnFavPage() {
    click(By.xpath("//a[@href='/user/favourite/']"));
  }

  public void isDealDispInFavPage (){
    isElementDisplayed(By.xpath("//div[@class='deal']"));
  }

  public void btnOffFavDeal() {
    click(By.xpath("//button[@class='deal__fav']"));
  }

  public void isFavDealNotF (){
    isElementDisplayed(By.xpath("//p[contains(text(), 'В вашем списке избранного нет акций')]"));
  }

  public void isFavNumbDisp (){
    isElementDisplayed(By.xpath("//strong[@class='ng-star-inserted']"));
  }

  public void btnFavOffDealPage() {   //Кнопка "В избранном" на странице акции после добавления в избранное
    click(By.xpath("//button[@class='active']"));
  }

  public void btnFavMainPage() {   //Кнопка "В избранное" на главной
    click(By.xpath("//button[@class='deal__fav']"));
  }


}
