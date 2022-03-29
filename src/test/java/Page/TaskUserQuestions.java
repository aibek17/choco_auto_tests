package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TaskUserQuestions extends BasePage{
  public TaskUserQuestions(WebDriver driver) {
    super(driver);
  }

  public void btnQuestions() {
    click(By.xpath("//a[@href='/user/questions/']"));
  }

  public void btnWithAns() {
    click(By.xpath("//li[contains(text(), 'С ответом')]"));
  }

  public void isQuestionDisp() {
    isElementDisplayed(By.xpath("//div[@class='question__info']"));
  }

  public void isAnswerDisp() {
    isElementDisplayed(By.xpath("//div[@class='question__info question__info--answer']"));
  }

  public void btnWithOutAns() {
    click(By.xpath("//li[contains(text(), 'Ожидают ответа')]"));
  }

  public void isQuestionDealDisp() {
    isElementDisplayed(By.xpath("//div[@class='q-deal']"));
  }
}
