package Tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AuthByEmail extends TestBase {

  @Test
  public void correctFlow(){
    main.goTo();
    taskAuth.butVhod();
    driver.findElement(By.xpath(login)).sendKeys("kabi.a@chocolife.kz", Keys.ENTER);
    driver.findElement(By.xpath(pass)).sendKeys("87783423808zZ");
    taskAuth.btnAuthVoiti();
    taskAuth.checkPageIsCorrect();
  }

  @Test
  public void WrongPass(){
    main.goTo();
    taskAuth.butVhod();
    driver.findElement(By.xpath(login)).sendKeys("kabi.a@chocolife.kz", Keys.ENTER);
    driver.findElement(By.xpath(pass)).sendKeys("qwerty123");
    taskAuth.btnAuthVoiti();
    taskAuth.checkTextWrongPass();
  }

  @Test
  public void ChangeEmail(){
    main.goTo();
    taskAuth.butVhod();
    driver.findElement(By.xpath(login)).sendKeys("kabi.a@chocolife.kz", Keys.ENTER);
    taskAuth.btnChangeEmail();
    taskAuth.checkChangeEmailPage();
  }

  @Test
  public void NewEmail(){
    main.goTo();
    taskAuth.butVhod();
    driver.findElement(By.xpath(login)).sendKeys("example@test.ru", Keys.ENTER);
    taskAuth.checkRegPage();
  }

//  @Test
//  public void BtnShowPass(){
//    main.goTo();
//    taskAuth.butVhod();
//    driver.findElement(By.xpath(login)).sendKeys("kabi.a@chocolife.kz", Keys.ENTER);
//    driver.findElement(By.xpath(pass)).sendKeys("qwerty123");
//    taskAuth.btnShowPass();
//    taskAuth.checkTextWrongPass();
//  }
}
