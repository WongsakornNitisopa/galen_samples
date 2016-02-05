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
public class NhLandingPageSgTest extends GalenBaseTest {

    @BeforeMethod(groups = "smoke")
    public void LoadPage() throws MalformedURLException {
        String nhLandingPageUrl = "http://www.propertyguru.com.sg/new-project-launch";
        load(nhLandingPageUrl);
    }

    @Test(dataProvider = "devices", groups = "smoke")
    public void shouldShowMainNavBar(final TestDevice device) throws Exception {
        verifyPage(device,
                "/specs/widgets/MenuBar.gspec",
                Arrays.asList(constantName.TestSmoke, constantName.PageNhLanding, constantName.WidgetNenuBar, constantName.regionSg));
    }

    @Test(dataProvider = "devices", groups = "smoke")
    public void shouldShowFeatureNewProject(final TestDevice device) throws Exception {
        verifyPage(device,
                "/specs/widgets/featuredCarouselNewProject.gspec",
                Arrays.asList(constantName.TestSmoke, constantName.PageNhLanding, constantName.WidgetFeaturedNewhomesCarousel, constantName.regionSg));
    }

    @Test(dataProvider = "devices", groups = "smoke")
    public void shouldShowExploreUpcomingProjectsFirstLevel(final TestDevice device) throws Exception {
        verifyPage(device,
                "/specs/widgets/featuredExploreUpcomingProjectsFirstLevel.gspec",
                Arrays.asList(constantName.TestSmoke, constantName.PageNhLanding, constantName.WidgetFeaturedExploreUpcoming, constantName.regionSg));
    }

}
