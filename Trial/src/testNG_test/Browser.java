package testNG_test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser extends WebTestBase {
	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"/home/ashvin/eclipse-workspace/Dcfc/BrowserDrivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Opens the chrome browser and maximizes the window
	}

	public static void enterUrl(String url) throws InterruptedException {
		driver.get(url);
		// the URL is passed as a string
		Thread.sleep(2000);

	}
	public static void scroll1p() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
	}
	public static void scroll3p() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
	}
}
