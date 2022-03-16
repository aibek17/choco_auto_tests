package Tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchPage extends TestBase{

  @Test
  public void searchCorrect(){   //Поиск по корректному кейсу
    main.goTo();
    driver.findElement(By.xpath(searchArea)).sendKeys("Макияж", Keys.ENTER);
    taskSearch.searchIsCorrect();
  }

  @Test
  public void searchNotF(){   //Поиск по слову, по которому вернется пустой ответ
    main.goTo();
    driver.findElement(By.xpath(searchArea)).sendKeys("Синхофазатрон", Keys.ENTER);
    taskSearch.searchNotFound();
  }

  @Test
  public void searchWordReg(){   //Поиск по чувствительностью к регистру
    main.goTo();
    driver.findElement(By.xpath(searchArea)).sendKeys("мАкИяЖ", Keys.ENTER);
    taskSearch.searchIsCorrect();
  }

  @Test
  public void searchOrphMistake(){   //Поиск с орфографической ошибкой
    main.goTo();
    driver.findElement(By.xpath(searchArea)).sendKeys("Макеяж", Keys.ENTER);
    taskSearch.searchIsCorrect();
  }

  @Test
  public void searchTwoOrphMistake(){   //Поиск с двумя орфографическими ошибками
    main.goTo();
    driver.findElement(By.xpath(searchArea)).sendKeys("Макеяш", Keys.ENTER);
    taskSearch.searchIsCorrect();
  }

  @Test
  public void searchCharacterReplace(){   //Поиск с перестановкой букв
    main.goTo();
    driver.findElement(By.xpath(searchArea)).sendKeys("Макяиж", Keys.ENTER);
    taskSearch.searchIsCorrect();
  }

  @Test
  public void searchEngWord(){   //Поиск с английскими словами
    main.goTo();
    driver.findElement(By.xpath(searchArea)).sendKeys("shymbulak", Keys.ENTER);
    taskSearch.searchEngIsCorrect();
  }

  @Test
  public void searchMoreSpaces(){   //Поиск с несколькими пробелами
    main.goTo();
    driver.findElement(By.xpath(searchArea)).sendKeys("медицинский   центр", Keys.ENTER);
    taskSearch.searchMoreSpaces();
  }

  @Test
  public void searchEngCharacters(){   //Поиск с ошибочно английской раскладкой
    main.goTo();
    driver.findElement(By.xpath(searchArea)).sendKeys("Vfrbz;", Keys.ENTER);
    taskSearch.searchIsCorrect();
  }

  @Test
  public void searchList(){   //Подсказка в выпадающем списке в поиске
    main.goTo();
    driver.findElement(By.xpath(searchArea)).sendKeys("Макияж");
    taskSearch.searchIsCorrectList();
  }

  @Test
  public void searchListButton(){   //Кнопка "Показать все результаты" в выпадающем списке
    main.goTo();
    driver.findElement(By.xpath(searchArea)).sendKeys("Макияж");
    taskSearch.btnSearchList();
    taskSearch.searchIsCorrectList();
  }
}
