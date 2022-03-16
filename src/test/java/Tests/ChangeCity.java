package Tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.concurrent.TimeUnit;

public class ChangeCity extends TestBase{

  @Test
  public void changeCityAst() throws InterruptedException {
    main.goTo();
    taskChangeCity.buttonChCi();
    taskChangeCity.changeCityArea();
    Thread.sleep(50000);
    taskChangeCity.changeToZhes();
    taskChangeCity.cityIsZhes();

  }
}
