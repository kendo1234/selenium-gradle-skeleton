package amazontesting.advancedtests;

import amazontesting.components.AmazonSearch;
import base.BaseTest;
import java.io.IOException;
import org.junit.jupiter.api.Test;

public class ScreenshotElement extends BaseTest {

  @Test
  public void captureTheSearchbox() throws IOException {
    AmazonSearch amazonSearch = new AmazonSearch(driver);
    amazonSearch.screenshotSearchBox();
  }

}
