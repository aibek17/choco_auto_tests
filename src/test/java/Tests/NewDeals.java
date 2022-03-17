package Tests;

import org.junit.jupiter.api.Test;

public class NewDeals extends TestBase{

  @Test
  public void testSlideIsDisp() throws InterruptedException{
    main.goTo();
    taskNewDeals.dealActive();
  }

  @Test
  public void testBtnNext() throws InterruptedException{
    main.goTo();
    taskNewDeals.btnNextDeal();
    taskNewDeals.dealBtnNext();
  }
}
