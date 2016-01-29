/**
 * 
 */
package developerlisting.layout;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import util.testng.GalenBaseTest;

import java.util.Arrays;

/**
 * @author win
 *
 */
public class NhLandingPageMyTest extends GalenBaseTest {

	@Test(dataProvider = "devices", groups = "smoke")
	public void  shouldShowFeatureNewProject(final TestDevice device) throws Exception {
		String nhLandingPageUrl = "http://www.propertyguru.com.sg/new-project-launch";
		load(nhLandingPageUrl);
		verifyPage(device,
				"/specs/pages/nhLandingPageMyLayout.gspec",
				Arrays.asList("landingPage", "Bootstrap"));
	}

//	@Test(dataProvider = "devices", groups = "regression")
//	public void shouldShowCorrectBaseLayout(final TestDevice device) throws Exception {
//		verifyPage("/",
//		        device,
//		        "/specs/homePageLayout.gspec",
//		        Arrays.asList("Homepage", "Bootstrap"));
//	}

//	@Test(dataProvider = "devices")
//	public void shouldShowCorrectBaseLayouts(final TestDevice device) throws Exception {
//		load("/");
//		enterText(By.id("lst-ib"),"Galen Testing");
//		clickElement(By.xpath("//*[contains(@class,'lsb')]//button"));
//		verifyPage(device,
//				"/specs/googlePageLayout.gspec",
//				Arrays.asList("Google"));
//	}

}
