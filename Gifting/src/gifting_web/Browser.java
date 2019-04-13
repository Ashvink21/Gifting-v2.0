package gifting_web;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser extends Main {
	
	public static void openBrowser() throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/home/ashvin/eclipse-workspace/Dcfc/BrowserDrivers/chromedriver");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		screenshot("/home/ashvin/Desktop/AutomationScreenshots/Browser_opened"+timestamp()+".png");
		Thread.sleep(1000);
		System.out.println("Browser is opened");
    }
	
	public static void enterURL(String URL) throws InterruptedException, IOException 
	{
		driver.get(URL);
		screenshot("/home/ashvin/Desktop/AutomationScreenshots/Url_launched"+timestamp()+".png");
		Thread.sleep(3000);
		String URL1 = driver.getCurrentUrl();
		// Gets the currentUrl and stores it in URL variable
		
		
		//Below if condition is to check whether the given url is launched successfully or not
		if(URL1.contains("https://gifting-web.amebae21.hasura-app.io"))
		{
		System.out.println("Given URL is launched");
		Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Age_gate"+timestamp()+".png");
		}
		else
		{
			System.out.println("Given URL is failed to launch");
		}
        Thread.sleep(2000);
	}
	
	public static void navigateBack() throws InterruptedException 
	{
		driver.navigate().back();
		Thread.sleep(2000);
	}
	
	public static void scroll5p() throws InterruptedException 
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
	}
	
	public static void scroll1p() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
	}
	public static void scroll6n() throws InterruptedException 
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-500)", "");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-500)", "");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-500)", "");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-500)", "");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-500)", "");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-500)", "");
		Thread.sleep(2000);
	}
	
	public static void scroll1n() throws InterruptedException 
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-500)", "");
		Thread.sleep(2000);
    }
	
	public static void scroll3p() throws InterruptedException 
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
    }
	
	public static void scroll2n() throws InterruptedException 
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-500)", "");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-500)", "");
		Thread.sleep(2000);
	}
	
	public static void screenshot(String path) throws IOException 
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(scrFile, new File(":/home/ashvin/Desktop/screenshot"+timestamp()+".png"));
				File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				try {
				 // now copy the  screenshot to desired location using copyFile //method
				FileUtils.copyFile(src, new File(path));
				}
				catch (IOException e)
				 {
				  System.out.println(e.getMessage());
				 }
	}
	
	public static String timestamp() 
	{
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }
	
	public static void browser_quit()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}