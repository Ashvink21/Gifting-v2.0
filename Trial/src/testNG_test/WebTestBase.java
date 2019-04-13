package testNG_test;

import org.openqa.selenium.WebDriver;

public class WebTestBase {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Browser.openBrowser();
		// Opens chrome browser
		Browser.enterUrl("https://www.hipbar.com");
		//Email.MandrillDotCom();
		//SMS.msg91();
		PinChange.cedge();
		// Enters the URL in the chrome browser
		// Login.enterYear("1997");
		// Enters the year in the loaded URL Page
		// Login.enter_click();
		// After entering the year, enter button is clicked to navigate to hipbar.com
		// homepage
		// Thread.sleep(6000);
		// Utils.HipbarDotCom();
		// Loads the entire URL Site page by page with scrolling option

	}

}
