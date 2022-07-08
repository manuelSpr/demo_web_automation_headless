package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import static java.lang.String.format;

public class SysUtil {

  /**
   * A general method to wait see any element
   * @param driver
   * @param element
   */
  public void waitElement(WebDriver driver, By element){
    Duration fromSeconds = Duration.ofSeconds(10);
    WebDriverWait wait = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.visibilityOfElementLocated(element));
  }

  public void addScreenshot(String filename, WebDriver driver) {
    File srcFile = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);

    File targetFile = new File(
        format("%s/screenshots", "target/Report"), // dir
        format("%s.jpg", filename));  // filename
    try {
      FileUtils.copyFile(srcFile, targetFile);
    } catch (IOException e) {
      e.printStackTrace();
      throw new RuntimeException("Unable to save " + targetFile.getName(), e);
    }
  }

}
