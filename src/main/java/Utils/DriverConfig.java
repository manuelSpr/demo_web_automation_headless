import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

class DriverConfig {

  WebDriver driver;
  WebDriverManager wdm = WebDriverManager.chromedriver().browserInDocker();

  @BeforeEach
  void setupTest() {
    driver = wdm.create();
  }

  @AfterEach
  void teardown() {
    wdm.quit();
  }

  @Test
  void test() {
    driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
    assertThat(driver.getTitle()).contains("Selenium WebDriver");
  }
}
