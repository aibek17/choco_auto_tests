package Tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class UserQuestions extends TestBase{

  public void goToQuestionPage() {
    main.goTo();
    taskAuth.butVhod();
    driver.findElement(By.xpath(login)).sendKeys("kabi.a@chocolife.kz", Keys.ENTER);
    driver.findElement(By.xpath(pass)).sendKeys("87783423808zZ");
    taskAuth.btnAuthVoiti();
    taskAuth.btnSkeepBlackScreen();
    taskMyData.btnMyProfile();
    taskUserQuestions.btnQuestions();
  }

  @Test
  public void questionPageAllTests(){
    goToQuestionPage();
    taskUserQuestions.btnWithAns();
    taskUserQuestions.isQuestionDealDisp();
    taskUserQuestions.isQuestionDisp();
    taskUserQuestions.isAnswerDisp();
    taskUserQuestions.btnWithOutAns();
    taskUserQuestions.isQuestionDealDisp();
    taskUserQuestions.isQuestionDisp();
  }

//  @Test
//  public void questionWithAns(){
//    goToQuestionPage();
//    taskUserQuestions.btnWithAns();
//    taskUserQuestions.isQuestionDealDisp();
//    taskUserQuestions.isQuestionDisp();
//    taskUserQuestions.isAnswerDisp();
//  }
//
//  @Test
//  public void questionWithOutAns(){
//    goToQuestionPage();
//    taskUserQuestions.btnWithOutAns();
//    taskUserQuestions.isQuestionDealDisp();
//    taskUserQuestions.isQuestionDisp();
//  }
}
