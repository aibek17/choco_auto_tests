package Tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class SearchPage extends TestBase{

  @Test
  public void searchFirst(){
    main.goTo();
    driver.findElement(By.xpath(searchArea)).sendKeys("Сарыагаш", Keys.ENTER);
    taskSearch.searchIsCorrect();
    //taskSearch.inpArea("Сарыагаш", Keys.ENTER);
  }

  @Test
  public void searchSecond(){
    main.goTo();
    driver.findElement(By.xpath(searchArea)).sendKeys("Синхофазатрон", Keys.ENTER);
    taskSearch.searchNotFound();
    //taskSearch.inpArea("Сарыагаш", Keys.ENTER);
  }

}
