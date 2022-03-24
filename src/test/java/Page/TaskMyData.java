package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TaskMyData extends BasePage{

  public TaskMyData(WebDriver driver) {
    super(driver);
  }

  public void btnMyProfile(){
    click(By.xpath("//div/button[@class='profile__btn']"));
  }

  public void btnMyData(){
    click(By.xpath("//a[@href='/user/personal/']"));
  }

  public void changeNumbErrorText(){
    isElementDisplayed(By.xpath("//div[@class='cl-snackbars']"));
  }

  public void btnChangeNumb(){
    click(By.xpath("//span[@class='user-personal__action user-personal__action--ml']"));
  }

  public void btnApproveNumbChange(){
    click(By.xpath("//button[contains(text(), 'Продолжить')]"));
  }

  public void isTableNameDisp(){
    isElementDisplayed(By.xpath("//div[@class='user-personal__labels']"));
  }

  public void isTableValueDisp(){
    isElementDisplayed(By.xpath("//div[@class='user-personal__values']"));
  }

  public void isAvatarPhotoDisp(){
    isElementDisplayed(By.xpath("//div[@class='user-personal__avatar']"));
  }

  public void btnChangePass(){
    click(By.xpath("//button[@class='user-personal__button user-personal__button--secondary']"));
  }

  public void btnChangePassTwo(){
    click(By.xpath("//button[contains(text(), 'Изменить пароль')]"));
  }

  public void isErrorTextDisp(){
    isElementDisplayed(By.xpath("//div[@class='cl-snackbars__item cl-snackbars__item--error']"));
  }

  public void btnChangePersData(){
    click(By.xpath("//button[@class='user-personal__button']"));
  }

  public void btnChangeGender(){
    click(By.xpath("//button[@class='user-personal__button user-personal__button--option user-personal__button--option--not-selected']"));
  }

  public void btnSavePersData(){
    click(By.xpath("//button[@class='user-personal__button']"));
  }

  public void isSaveWork(){
    isElementDisplayed(By.xpath("//div[@class='cl-snackbars__item cl-snackbars__item--']"));
  }

}
