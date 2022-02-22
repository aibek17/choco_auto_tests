package Authorization;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class AuthByEmail extends TestBase {

  @Test
  public void firstTest(){
    driver.get(mainDevUrl);
    driver.findElement(By.xpath(btnVoiti)).click();
  }
}
