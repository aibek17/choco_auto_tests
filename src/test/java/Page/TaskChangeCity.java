package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TaskChangeCity extends BasePage{
//  String zhes = "Жезказган";

  public TaskChangeCity(WebDriver driver) {
    super(driver);
  }

  public void buttonChCi(){
    click(By.xpath("//div/button[@class='cl-btn cl-btn--secondary']"));
  }

  public void changeToZhes(){
    click(By.xpath("//li/span[text() = 'Жезказган'][2]"));
  }

  public void cityIsZhes(){
    isElementDisplayed(By.xpath("//div/span[contains(text(), 'Жезказган')]"));
  }

  public void changeToAst(){
    click(By.xpath("//li/span[text() = 'Нур-Султан'][2]"));
  }

  public void cityIsAst(){
    isElementDisplayed(By.xpath("//div/span[contains(text(), 'Нур')]"));
  }

  public void changeToKrg(){
    click(By.xpath("//li/span[text() = 'Караганда'][2]"));
  }

  public void cityIsKrg(){
    isElementDisplayed(By.xpath("//div/span[contains(text(), 'Караганда')]"));
  }

  public void changeToShym(){
    click(By.xpath("//li/span[text() = 'Шымкент'][2]"));
  }

  public void cityIsShym(){
    isElementDisplayed(By.xpath("//div/span[contains(text(), 'Шымкент')]"));
  }

  public void changeToAktobe(){
    click(By.xpath("//li/span[text() = 'Актобе'][2]"));
  }

  public void cityIsAktobe(){
    isElementDisplayed(By.xpath("//div/span[contains(text(), 'Актобе')]"));
  }

  public void changeToTrz(){
    click(By.xpath("//li/span[text() = 'Тараз'][2]"));
  }

  public void cityIsTrz(){
    isElementDisplayed(By.xpath("//div/span[contains(text(), 'Тараз')]"));
  }

  public void changeToPvl(){
    click(By.xpath("//li/span[text() = 'Павлодар'][2]"));
  }

  public void cityIsPvl(){
    isElementDisplayed(By.xpath("//div/span[contains(text(), 'Павлодар')]"));
  }

  public void changeToUstK(){
    click(By.xpath("//li/span[text() = 'Усть-Каменогорск'][2]"));
  }

  public void cityIsUstK(){
    isElementDisplayed(By.xpath("//div/span[contains(text(), 'Усть')]"));
  }

  public void changeToSemey(){
    click(By.xpath("//li/span[text() = 'Семей'][2]"));
  }

  public void cityIsSemey(){
    isElementDisplayed(By.xpath("//div/span[contains(text(), 'Семей')]"));
  }

  public void changeToAtyrau(){
    click(By.xpath("//li/span[text() = 'Атырау'][2]"));
  }

  public void cityIsAtyrau(){
    isElementDisplayed(By.xpath("//div/span[contains(text(), 'Атырау')]"));
  }

  public void changeToKost(){
    click(By.xpath("//li/span[text() = 'Костанай'][2]"));
  }

  public void cityIsKost(){
    isElementDisplayed(By.xpath("//div/span[contains(text(), 'Костанай')]"));
  }

  public void changeToUra(){
    click(By.xpath("//li/span[text() = 'Уральск'][2]"));
  }

  public void cityIsUra(){
    isElementDisplayed(By.xpath("//div/span[contains(text(), 'Уральск')]"));
  }

  public void changeToPtr(){
    click(By.xpath("//li/span[text() = 'Петропавловск'][2]"));
  }

  public void cityIsPtr(){
    isElementDisplayed(By.xpath("//div/span[contains(text(), 'Петро')]"));
  }

  public void changeToAktau(){
    click(By.xpath("//li/span[text() = 'Актау'][2]"));
  }

  public void cityIsAktau(){
    isElementDisplayed(By.xpath("//div/span[contains(text(), 'Актау')]"));
  }

  public void changeToKzl(){
    click(By.xpath("//li/span[text() = 'Кызылорда'][2]"));
  }

  public void cityIsKzl(){
    isElementDisplayed(By.xpath("//div/span[contains(text(), 'Кызыл')]"));
  }

  public void changeToTemir(){
    click(By.xpath("//li/span[text() = 'Темиртау'][2]"));
  }

  public void cityIsTemir(){
    isElementDisplayed(By.xpath("//div/span[contains(text(), 'Темир')]"));
  }

  public void changeToTurk(){
    click(By.xpath("//li/span[text() = 'Туркестан'][2]"));
  }

  public void cityIsTurk(){
    isElementDisplayed(By.xpath("//div/span[contains(text(), 'Турк')]"));
  }

  public void changeToKoksh(){
    click(By.xpath("//li/span[text() = 'Кокшетау'][2]"));
  }

  public void cityIsKoksh(){
    isElementDisplayed(By.xpath("//div/span[contains(text(), 'Кокше')]"));
  }

  public void changeToTaldyk(){
    click(By.xpath("//li/span[text() = 'Талдыкорган'][2]"));
  }

  public void cityIsTaldyk(){
    isElementDisplayed(By.xpath("//div/span[contains(text(), 'Талдык')]"));
  }

  public void changeToEkibas(){
    click(By.xpath("//li/span[text() = 'Экибастуз'][2]"));
  }

  public void cityIsEkibas(){
    isElementDisplayed(By.xpath("//div/span[contains(text(), 'Экибас')]"));
  }

  public void changeToRudn(){
    click(By.xpath("//li/span[text() = 'Рудный'][2]"));
  }

  public void cityIsRudn(){
    isElementDisplayed(By.xpath("//div/span[contains(text(), 'Рудный')]"));
  }

  public void changeToBalkh(){
    click(By.xpath("//li/span[text() = 'Балхаш'][2]"));
  }

  public void cityIsBalkh(){
    isElementDisplayed(By.xpath("//div/span[contains(text(), 'Балхаш')]"));
  }

  public void changeToAla(){
    click(By.xpath("//li/span[text() = 'Алматы'][2]"));
  }

  public void cityIsAla(){
    isElementDisplayed(By.xpath("//div/span[contains(text(), 'Алматы')]"));
  }
}

