/**
 *
 */
package developerlisting.layout;

import developerlisting.constantName.constantName;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import util.testng.GalenBaseTest;

import java.net.MalformedURLException;
import java.util.Arrays;

/**
 * @author win
 */
public class NhSearchResultPageSgTest extends GalenBaseTest {

    private static String pageName = "02-Nh Search Result Page";

    @BeforeMethod(groups = "smoke")
    public void LoadPage() throws MalformedURLException {
        String nhLandingPageUrl = "http://www.propertyguru.com.sg/new-project-launch/1";
        load(nhLandingPageUrl);
    }

    @Test(dataProvider = "devices", groups = "smoke")
    public void shouldShowMainNavBar(final TestDevice device) throws Exception {
        verifyPage(device,
                "/specs/widgets/MenuBar.gspec",
                Arrays.asList(constantName.TestSmoke, constantName.PageNhSearchResult, constantName.WidgetNenuBar, constantName.regionSg));
    }

}
