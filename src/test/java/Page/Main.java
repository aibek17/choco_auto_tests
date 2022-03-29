package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

  public void goToDeal() {
    click(By.xpath("//a[@href='/51393-carcat-5/']"));
  }
}
