package googletesting.components;

import googletesting.driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSearch extends DriverFactory {
  private WebDriver driver;

  //Page URL
  private static String PAGE_URL="https://www.amazon.co.uk/";

  //Locators
  @FindBy(css = "#searchDropdownBox")
  private WebElement categorySelect;

  //Page Constructor
  public AmazonSearch(WebDriver driver){
    this.driver=driver;
    driver.get(PAGE_URL);
    //Initialise Elements
    PageFactory.initElements(driver, this);
  }

  //Test Action
  public void searchForBooks(){
    categorySelect.click();
  }



}
