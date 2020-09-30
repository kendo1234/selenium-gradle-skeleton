package amazontesting.components;

import base.driver.DriverFactory;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AmazonSearch extends DriverFactory {
  private WebDriver driver;

  //Page URL
  private static final String PAGE_URL="https://www.amazon.co.uk/";

  //Locators
  @FindBy(css = "#searchDropdownBox")
  private WebElement catSelect;

  //Alt way to do findBy
  @FindBy(how = How.ID, using = "twotabsearchtextbox")
      private WebElement searchInput;

  @FindBy(how = How.XPATH, using = "//*[@id=\"nav-search\"]/form/div[2]/div/input")
      private WebElement searchBtn;

  @FindBy(how = How.CSS, using = "//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[4]")
      private WebElement searchResultBar;

  //Page Constructor
  public AmazonSearch(WebDriver driver){
    this.driver=driver;
    driver.get(PAGE_URL);
    //Initialise Elements
    PageFactory.initElements(driver, this);
  }

  //Test Action
  public void searchForBooks(){
    Select categorySelectLocator = new Select(catSelect);
    categorySelectLocator.selectByVisibleText("Books");
    searchInput.sendKeys("Automation");
    searchBtn.click();

  }





}
