package amazontesting.advancedtests;

import amazontesting.components.AmazonSearch;
import base.BaseTest;
import org.junit.jupiter.api.Test;

public class OpenTab extends BaseTest {

  @Test
  public void butAlsoCats() {
    AmazonSearch amazonSearch = new AmazonSearch(driver);
    amazonSearch.newTab();
  }

}
