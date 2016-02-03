/**
 * 
 */
package sample.layout;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import util.testng.GalenBaseTest;

/**
 * @author mreinhardt
 *
 */
public class HomeLayoutTest extends GalenBaseTest {

	@Test(dataProvider = "devices", groups = "home")
	public void shouldShowCorrectBaseLayout(final TestDevice device) throws Exception {
		verifyPage("/",
		        device,
		        "/specs/homePageLayout.gspec",
		        Arrays.asList("Homepage", "Bootstrap"));
	}

	@Test(dataProvider = "devices")
	public void shouldShowCorrectBaseLayouts(final TestDevice device) throws Exception {
		load("/");
		enterText(By.id("lst-ib"),"Galen Testing");
		clickElement(By.xpath("//*[contains(@class,'lsb')]//button"));
		verifyPage(device,
				"/specs/googlePageLayout.gspec",
				Arrays.asList("Google"));
	}

}
