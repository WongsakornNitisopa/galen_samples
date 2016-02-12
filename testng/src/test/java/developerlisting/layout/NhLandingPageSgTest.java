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

import static developerlisting.constantName.constantName.*;

/**
 * @author win
 */
public class NhLandingPageSgTest extends GalenBaseTest {

    @BeforeMethod(groups = "smoke")
    public void LoadPage() throws MalformedURLException {
        String nhLandingPageUrl = String.format(NhLandingPageSG, getTestingEnv());
        System.out.print(nhLandingPageUrl);
        load(nhLandingPageUrl);
    }

    @Test(dataProvider = "devices", groups = "smoke")
    public void shouldShowMainNavBar(final TestDevice device) throws Exception {
        verifyPage(device,
                "/specs/widgets/menuBar.gspec",
                Arrays.asList(TestSmoke, PageNhLanding, WidgetMenuBar, regionSg));
    }

    @Test(dataProvider = "devices", groups = "smoke")
    public void shouldShowFeatureNewProject(final TestDevice device) throws Exception {
        verifyPage(device,
                "/specs/widgets/featuredCarouselNewProject.gspec",
                Arrays.asList(TestSmoke, PageNhLanding, WidgetFeaturedNewhomesCarousel, regionSg));
    }

    @Test(dataProvider = "devices", groups = "smoke")
    public void shouldShowExploreUpcomingProjectsFirstLevel(final TestDevice device) throws Exception {
        verifyPage(device,
                "/specs/widgets/featuredExploreUpcomingProjectsFirstLevel.gspec",
                Arrays.asList(TestSmoke, PageNhLanding, WidgetFeaturedExploreUpcoming, regionSg));
    }

}
