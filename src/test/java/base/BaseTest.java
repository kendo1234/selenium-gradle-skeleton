package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {

  protected WebDriver driver;

  @BeforeAll
  public static void setupClass() {
    WebDriverManager.chromedriver().setup();
  }

  @BeforeEach
  public void setupTest() {
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--headless");
    options.addArguments("--disable-gpu");
    driver = new ChromeDriver(options);  }

  @AfterEach
  public void teardown() {
    if (driver != null) {
      driver.quit();
    }
  }

}
