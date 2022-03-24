package Tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class MyData extends TestBase{

  public void goToPersonalData(){
    main.goTo();
    taskAuth.butVhod();
    driver.findElement(By.xpath(login)).sendKeys("kabi.a@chocolife.kz", Keys.ENTER);
    driver.findElement(By.xpath(pass)).sendKeys("87783423808zZ");
    taskAuth.btnAuthVoiti();
    taskAuth.btnSkeepBlackScreen();
    taskMyData.btnMyProfile();
    taskMyData.btnMyData();
  }

  @Test    //Проверка текста об ошибке, когда вводишь тот же самый номер
  public void numbChangeError(){
    goToPersonalData();
    taskMyData.btnChangeNumb();
    driver.findElement(By.xpath(changeNumbArea)).sendKeys("87088559273");
    taskMyData.btnApproveNumbChange();
    taskMyData.changeNumbErrorText();
  }

  @Test
  public void personalDataIsDisp(){
    goToPersonalData();
    taskMyData.isTableNameDisp();
    taskMyData.isTableValueDisp();
    taskMyData.isAvatarPhotoDisp();
  }

  @Test
  public void changePassError() throws InterruptedException{
    goToPersonalData();
    taskMyData.btnChangePass();
    driver.findElement(By.xpath(areaForChangePassOne)).sendKeys("87783423808zZ");
    driver.findElement(By.xpath(areaForChangePassOne)).sendKeys("87783423808zZ");
    driver.findElement(By.xpath(areaForChangePassOne)).sendKeys("87783423808zZ");
    taskMyData.btnChangePassTwo();
    taskMyData.isErrorTextDisp();
  }

  @Test
  public void changePersData(){
    goToPersonalData();
    taskMyData.btnChangePersData();
    taskMyData.btnChangeGender();
    taskMyData.btnSavePersData();
    taskMyData.isSaveWork();
  }
}
