package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class TaskAuth extends BasePage{
  public TaskAuth(WebDriver driver) {
    super(driver);
  }

  public void butVhod (){
    click(By.xpath("//button[@class='profile__login cl-btn']"));
  }

  public void btnAuthVoiti (){
    click(By.xpath("//button[@class=' choco-button orange']"));
  }

  public void checkPageIsCorrect (){
    isElementDisplayed(By.xpath("//span[@class=\'profile__text\']"));
  }

  public void checkTextWrongPass (){
    isElementDisplayed(By.xpath("//div[contains(text(), 'Неверный текущий пароль')]"));
  }

  public void btnShowPass(){
    click(By.xpath("//div/img[@class='eye-icon']"));
  }

  public void checkShowPass (){
    isElementDisplayed(By.xpath("//div[contains(text(), 'Неверный текущий пароль')]"));
  }

  public void btnChangeEmail(){
    click(By.xpath("//div/a[contains(text(), 'Изменить')]"));
  }

  public void checkChangeEmailPage (){
    isElementDisplayed(By.xpath("//div/label[contains(text(), 'Введите e-mail или номер')]"));
  }

  public void checkRegPage (){
    isElementDisplayed(By.xpath("//div/a[contains(text(), 'Регистрация Choco-аккаунта')]"));
  }
}
