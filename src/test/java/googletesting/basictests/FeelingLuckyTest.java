package googletesting.basictests;

import googletesting.components.Home;
import googletesting.components.SearchResults;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class FeelingLuckyTest {

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
  public void feelingLucky() {
    Home home = new Home(driver);
    SearchResults searchResults = new SearchResults(driver);

    home.feelingLucky();
    searchResults.luckyResultsAreReturned();
  }
}
