package Utils;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverConfig {

  public static WebDriver driver;
  public static WebDriverManager wdm = WebDriverManager.chromedriver().browserInDocker();

  public static void setDriver(){
    driver = wdm.create();
    //System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
    /*ChromeOptions options = new ChromeOptions();
    options.addArguments("--no-sandbox");
    options.addArguments("--headless");
    options.setBinary("/usr/bin/chromedriver");
    //options.setBinary("/usr/bin/google-chrome");
    //options.addArguments("--headless", "--window-size=1920,1200");
    options.addArguments("start-maximized"); // open Browser in maximized mode
    options.addArguments("disable-infobars"); // disabling infobars
    //options.setHeadless(true);
    options.addArguments("--disable-gpu");
    options.addArguments("--disable-extensions");
    options.addArguments("--disable-dev-shm-usage");
    WebDriverManager.chromedriver().browserInDocker();
    //driver = WebDriver.Chrome("/usr/lib/chromium");
    */
    //driver = new ChromeDriver(options);
    //driver.get("https://www.google.com/");
    driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
    //return driver;
  }
}
