package CountryTest;

import PageObject.InitialPage;
import PageObject.ResultPage;
import Utils.DriverConfig;
import Utils.SysUtil;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MexicoTest extends DriverConfig {

  @BeforeClass(alwaysRun = true)
  public void beforeC() {
    setDriver();
  }

  @Test()
  public void mexicoCountryTest() throws InterruptedException {

    //assertThat(driver.getTitle()).contains("Selenium WebDriver");
    /*InitialPage initialPage = new InitialPage(driver);
    initialPage.setShared("Mexico");
    String nameFile = "test" + "Mexico";
    ResultPage resultPage = new ResultPage(driver);
    resultPage.waitPageLoad();
    Thread.sleep(10);
    SysUtil sysUtil = new SysUtil();
    sysUtil.addScreenshot("Test_Mexico", driver);
    Assert.assertTrue(resultPage.getDescription("País en América del Norte"));*/
    driver.quit();
  }

}
