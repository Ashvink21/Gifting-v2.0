package testNG_test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PinChange extends WebTestBase {
	public static void cedge() throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get("http://172.30.7.11/MOBILEWALLET_HIPBAR_PROD/Login.aspx");
		//Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Form1 > div.content > input.input.username")));
		driver.findElement(By.cssSelector("#Form1 > div.content > input.input.username")).sendKeys("ho");
		//driver.findElement(By.cssSelector("#Form1 > div.content > input.input.username")).sendKeys("ho");
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("#Form1 > div.content > input.input.password")).sendKeys("edge@123");
		Thread.sleep(1500);
		driver.findElement(By.id("btnLogIn")).click();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);  

		try {  
		  driver.navigate().to("http://172.30.7.11/MOBILEWALLET_HIPBAR_PROD/Login.aspx");  
		} catch (TimeoutException e) {  
		  // Ignore the exception. 
			driver.findElement(By.cssSelector("#navigation > ul > li:nth-child(1) > a")).click();
		}  
		//Actions action = new Actions(driver);
		//action.SendKeys(Keys.ESCAPE);
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("return window.stop");
		//((JavascriptExecutor) driver).executeScript("return window.stop");
		//Thread.sleep(2000);
		//wait = new WebDriverWait(driver,100);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#navigation > ul > li:nth-child(1) > a")));
		driver.findElement(By.cssSelector("#navigation > ul > li:nth-child(1) > a")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//wait = new WebDriverWait(driver,100);
		//js = (JavascriptExecutor) driver;
		js.executeScript("return window.stop");
		Thread.sleep(2000);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#ctl00_cphMaster_rdoSTRType_0")));
		driver.findElement(By.cssSelector("#ctl00_cphMaster_rdoSTRType_0")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		js.executeScript("return window.stop");
		Thread.sleep(2000);
		//wait = new WebDriverWait(driver,100);
		Browser.scroll1p();
		driver.findElement(By.cssSelector("#ctl00_cphMaster_rptPager_ctl10_lnkPage")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Browser.scroll3p();
		
		
		
		

		
		
	}

}
