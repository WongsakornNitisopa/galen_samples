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
public class NhListingDetailPageMyTest extends GalenBaseTest {

    @BeforeMethod(groups = "regression")
    public void LoadPage() throws MalformedURLException {
        String nhSearchResultPageUrl = String.format(NhListingSearchResultPageMY, getTestingEnv());
        System.out.println(nhSearchResultPageUrl);
        load(nhSearchResultPageUrl);
        clickElement(By.partialLinkText("Newhomes Headline MY"));
//        load("http://www.integration.propertyguru.com.my/new-property-launch/newhomes-project-name-my-1455176442446-1308890");
    }

    @Test(dataProvider = "devices", groups = "regression")
    public void shouldShowContactBottomStickyBar(final TestDevice device) throws Exception {
        verifyPage(device,
                "/specs/widgets/contactBottomStickyBar.gspec",
                Arrays.asList(TestRegression,
                        PageNhListingDetailPage,
                        WidgetMobileContactBottomStickyBar,
                        regionMY));
    }

    @Test(dataProvider = "devices", groups = "regression")
    public void shouldShowContent(final TestDevice device) throws Exception {
        verifyPage(device,
                "/specs/widgets/tableContentAndUnitType.gspec",
                Arrays.asList(TestRegression,
                        PageNhListingDetailPage,
                        WidgetTableContentAndUnitType,
                        regionMY));
    }

}