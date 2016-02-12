/**
 *
 */
package developerlisting.layout;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import util.testng.GalenBaseTest;

import java.net.MalformedURLException;
import java.util.Arrays;

import static developerlisting.constantName.constantName.*;

/**
 * @author win
 */
public class NhListingDetailPageSgTest extends GalenBaseTest {

    @BeforeMethod(groups = "smoke")
    public void LoadPage() throws MalformedURLException {
        String nhSearchResultPageUrl = String.format(NhListingSearchResultPageSG, getTestingEnv());
        System.out.println(nhSearchResultPageUrl);
        load(nhSearchResultPageUrl);
        clickElement(By.partialLinkText("Newhomes Headline SG"));
    }

    @Test(dataProvider = "devices", groups = "smoke")
    public void shouldShowContactBottomStickyBar(final TestDevice device) throws Exception {
        verifyPage(device,
                "/specs/widgets/contactBottomStickyBar.gspec",
                Arrays.asList(TestRegression,
                        PageNhListingDetailPage,
                        WidgetMobileContactBottomStickyBar,
                        regionSg));
    }


}
