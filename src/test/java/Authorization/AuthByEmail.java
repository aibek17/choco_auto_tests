package Authorization;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AuthByEmail extends TestBase {

  @Test
  public void firstTest(){
    driver.get(mainDevUrl);
    driver.findElement(By.xpath(btnVoiti)).click();
    driver.findElement(By.xpath(authInput)).sendKeys("kabi.a@chocolife.kz", Keys.ENTER);
    driver.findElement(By.xpath(pass)).sendKeys("87783423808zZ");
    driver.findElement(By.xpath(btnAuthVoiti)).click();
    assertTrue(driver.findElement(By.xpath(profileText)).isDisplayed());
  }
}
