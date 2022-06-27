package PageObject;

import Utils.SysUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class InitialPage {

  WebDriver driver;
  By imgInitial = By.className("lnXdpd");
  By txtShared = By.xpath("//input[@name='q']");
  By btnSearch = By.xpath("//input[@value='Google Search']");

  public InitialPage(WebDriver driver) throws InterruptedException {
    this.driver = driver;
    Thread.sleep(10);
  }

  public void waitPageLoad(){
    SysUtil util = new SysUtil();
    util.waitElement(this.driver, imgInitial);
  }

  public void setShared(String value){
    this.driver.findElement(txtShared).sendKeys(value, Keys.ENTER);
  }

}
