package PageObject;

import Utils.SysUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ResultPage {

  WebDriver driver;
  SysUtil util = new SysUtil();
  public ResultPage(WebDriver driver) throws InterruptedException {
    this.driver = driver;
    Thread.sleep(10);
  }

  By btnAll = By.className("MUFPAc");
  By lblResults = By.xpath("//*[@jsname='K8Pnod']");
  By lblStories = By.className("GmE3X");
  public static String lblDescription = "//span[contains(text(), '%%')]";
  //By lblDescription = By.cssSelector("//span[contains(text(), '%%')]");

  public void waitPageLoad(){
    util.waitElement(this.driver, btnAll);
  }

  public List<WebElement> getAllResults(){
    List<WebElement> list = this.driver.findElements(lblResults);
    return list;
  }

  public void scrollToElement(){
    WebElement element = this.driver.findElement(lblResults);
    ((JavascriptExecutor) this.driver).executeScript("arguments[0].scrollIntoView(true);", element);
  }

  public void selectElement(String index){
    util.waitElement(this.driver, lblStories);
    int element = Integer.parseInt(index);
    int counter = 1;
    List<WebElement> list = getAllResults();
    if(element != 0){
      for(WebElement web : list){
        if(element==counter){
          web.click();
        }
        counter++;
      }
    }
  }

  public Boolean getDescription(String text){
    String description = lblDescription.replace("%%", text);
    return this.driver.findElement(By.xpath(description)).isDisplayed();
  }

}
