package amazontesting.basictests;

import base.BaseTest;
import amazontesting.components.AmazonSearch;

import org.junit.jupiter.api.Test;

public class AmazonSearchTest extends BaseTest {

  @Test
  public void performCategorySearch() {
    AmazonSearch amazonSearch = new AmazonSearch(driver);
    amazonSearch.searchForBooks();
  }

}

