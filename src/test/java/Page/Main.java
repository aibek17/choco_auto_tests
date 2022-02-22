package Page;

import org.openqa.selenium.WebDriver;

public class Main extends BasePage{
  String mainDevUrl = "https://chocodev.kz/";
  public Main(WebDriver driver) {
    super(driver);
  }

  public void goTo(){
    driver.get(mainDevUrl);
  }


}
