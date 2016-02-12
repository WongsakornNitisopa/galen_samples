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
public class NhPropertyReviewDetailPageSgTest extends GalenBaseTest {

    @BeforeMethod(groups = "smoke")
    public void LoadPage() throws MalformedURLException {
        String nhSearchResultPageUrl = String.format(NhListingPropertyReviewSearchResultPageSG, getTestingEnv());
        System.out.print(nhSearchResultPageUrl);
        load(nhSearchResultPageUrl);
        clickElement(By.partialLinkText("Test create article for project review with paid"));
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
