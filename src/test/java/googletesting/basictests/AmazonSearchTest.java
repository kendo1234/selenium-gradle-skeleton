package googletesting.basictests;

import googletesting.components.AmazonSearch;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AmazonSearchTest {

  private WebDriver driver;

  @BeforeAll
  public static void setupClass() {
    WebDriverManager.chromedriver().setup();
  }

  @BeforeEach
  public void setupTest() {
    driver = new ChromeDriver();
  }

  @AfterEach
  public void teardown() {
    if (driver != null) {
      driver.quit();
    }
  }

  @Test
  public void searchForBooks() {
    AmazonSearch amazonSearch = new AmazonSearch(driver);
    amazonSearch.searchForBooks();
  }

}

