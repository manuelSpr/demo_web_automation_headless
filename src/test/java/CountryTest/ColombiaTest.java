package CountryTest;

import PageObject.InitialPage;
import PageObject.ResultPage;
import Utils.DriverConfig;
import Utils.SysUtil;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ColombiaTest extends DriverConfig {

  @BeforeClass(alwaysRun = true)
  public void beforeC() {
    setDriver();
  }

  @Test()
  public void mexicoCountryTest() throws InterruptedException {
    /*InitialPage initialPage = new InitialPage(driver);
    initialPage.setShared("Colombia");
    String nameFile = "test" + "Colombia";
    ResultPage resultPage = new ResultPage(driver);
    resultPage.waitPageLoad();
    Thread.sleep(10);
    SysUtil sysUtil = new SysUtil();
    sysUtil.addScreenshot("Test_Colombia", driver);
    Assert.assertTrue(resultPage.getDescription("País en América del Sur"));*/
    driver.quit();
  }

}
