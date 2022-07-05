package Utils;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverConfig {

  public static WebDriver driver;

  public static WebDriver setDriver(){
    driver = null;
    //System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
    ChromeOptions options = new ChromeOptions();
    options.setBinary("/usr/bin/chromedriver");
    options.addArguments("--headless", "--window-size=1920,1200");
    options.addArguments("--no-sandbox");
    //options.setHeadless(true);
    //options.addArguments("--disable-gpu");
    //options.addArguments("--disable-extensions");
    options.addArguments("--disable-dev-shm-usage");
    WebDriverManager.chromedriver().setup();
    //driver = WebDriver.Chrome("/usr/lib/chromium");
    driver = new ChromeDriver(options);
    driver.get("https://www.google.com/");
    return driver;
  }
}
