package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverConfig {

  public static WebDriver driver;
  //public static WebDriverManager wdm = WebDriverManager.chromedriver().browserInDocker();

  public static void setDriver() throws InterruptedException {
    System.out.println("hola");
    ChromeDriverService service = new ChromeDriverService.Builder()
        .usingPort(64185)
        .build();
    //WebDriverManager wdm = WebDriverManager.chromedriver().browserInDocker();
    //driver = new WebDriverManager.chromedriver().browserInDocker();
    //driver = wdm.create();
    //System.out.println("hola a todos");
    //System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
    System.setProperty("webdriver.chrome.whitelistedIps", "");
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--no-sandbox");
    options.addArguments("--headless");
    options.addArguments("--verbose");
    options.addArguments("--disable-gpu");
    options.addArguments("--ignore-certificate-errors");
    options.addArguments("--allow-running-insecure-content");
    options.addArguments("--allow-insecure-localhost");
    options.addArguments("--disable-web-security");
    //options.setBinary("/usr/bin/google-chrome");
    //options.addArguments("--headless", "--window-size=1920,1200");
    options.addArguments("start-maximized"); // open Browser in maximized mode
    //options.addArguments("disable-infobars"); // disabling infobars
    //options.setHeadless(true);
    //options.addArguments("--disable-extensions");
    options.addArguments("--disable-dev-shm-usage");
    //WebDriverManager.chromedriver().browserInDocker();
    //driver = WebDriver.Chrome("/usr/lib/chromium");
    options.setBinary("/usr/bin/chromedriver");
    driver = new ChromeDriver(service, options);
    //driver.get("https://www.google.com/");
    //wdm.getWebDriver().get("https://bonigarcia.dev/selenium-webdriver-java/");
    Thread.sleep(5000);
    driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
    Thread.sleep(5000);
    //assertThat(driver.getTitle()).contains("Selenium WebDriver");
    //return driver;
  }
}
