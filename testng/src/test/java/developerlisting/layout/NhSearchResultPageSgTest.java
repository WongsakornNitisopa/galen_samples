/**
 *
 */
package developerlisting.layout;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import util.testng.GalenBaseTest;

import java.net.MalformedURLException;
import java.util.Arrays;

import static developerlisting.constantName.constantName.*;
/**
 * @author win
 */
public class NhSearchResultPageSgTest extends GalenBaseTest {

    @BeforeMethod(groups = "smoke")
    public void LoadPage() throws MalformedURLException {
        String nhSearchResultPageUrl = String.format(NhListingSearchResultPageSG, getTestingEnv());
        System.out.print(nhSearchResultPageUrl);
        load(nhSearchResultPageUrl);
    }

    @Test(dataProvider = "devices", groups = "smoke")
    public void shouldShowMainNavBar(final TestDevice device) throws Exception {
        verifyPage(device,
                "/specs/widgets/menuBar.gspec",
                Arrays.asList(TestSmoke, PageNhSearchResult, WidgetMenuBar, regionSg));
    }

    @Test(dataProvider = "devices", groups = "smoke")
    public void shouldShowSearchOption(final TestDevice device) throws Exception {
        verifyPage(device,
                "/specs/widgets/searchOption.gspec",
                Arrays.asList(TestSmoke, PageNhSearchResult, WidgetSearchOption, regionSg));
    }

}

