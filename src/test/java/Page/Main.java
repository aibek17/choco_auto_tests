package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main extends BasePage{
  String mainDevUrl = "https://chocodev.kz/";
  String mainProdUrl = "https://chocolife.me/";
  public Main(WebDriver driver) {
    super(driver);
  }

  public Main goTo(){
    driver.get(mainProdUrl);
    return this;
  }

  public Main butVhod (){
    click(By.xpath("//button[@class='profile__login cl-btn']"));
    return this;
  }

}
