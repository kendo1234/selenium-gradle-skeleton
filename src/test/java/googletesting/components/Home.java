package googletesting.components;

import googletesting.driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home extends DriverFactory {
  private WebDriver driver;

  //Page URL
  private static String PAGE_URL="https://www.google.com/";

  //Locators
  @FindBy(css = ".gLFyf")
  private WebElement searchBox;

  @FindBy(css = ".FPdoLc > center:nth-child(1) > input:nth-child(1)")
  private WebElement searchButton;

  @FindBy(css = ".FPdoLc > center:nth-child(1) > input:nth-child(2)")
  private WebElement feelingLuckyButton;


  //Page Constructor
  public Home(WebDriver driver){
    this.driver=driver;
    driver.get(PAGE_URL);
    //Initialise Elements
    PageFactory.initElements(driver, this);
  }

  //Test Action
  public void performAGoogleSearch(){
    searchBox.clear();
    searchBox.sendKeys("google");
    searchButton.click();

  }

  public void feelingLucky() {
    feelingLuckyButton.click();
  }


}
