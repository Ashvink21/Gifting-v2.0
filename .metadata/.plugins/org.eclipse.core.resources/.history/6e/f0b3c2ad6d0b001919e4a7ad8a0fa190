package dcfc_test;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;

public class Utils extends WebTestBase {
	public static void scroll() throws InterruptedException {
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
			jse.executeScript("window.scrollBy(0,500)", "");
			Thread.sleep(2000);
			//Scroll down the page 6 times
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
			//Scroll up the page 6 times
		}
	public static void toggle_btn() throws InterruptedException {
		driver.findElement(By.className("navbar-mobile-toggle")).click();
		Thread.sleep(2000);
		//Selects the toggle button(3 horizontal lines)
	}
	public static void minimize_window(int x,int y) throws InterruptedException {
		Dimension n = new Dimension(x,y);
		driver.manage().window().setSize(n);
		//Minimizes the window and the value is passed as an integer
		Thread.sleep(2000);
	}
	public static void HipbarDotCom() throws InterruptedException {
		Utils.scroll();
		Utils.minimize_window(964,2505);
		Utils.toggle_btn();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[4]/ul/li[2]/a")).click();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Utils.scroll();
		Utils.minimize_window(964,2505);
		Utils.toggle_btn();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[4]/ul/li[3]/a")).click();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Utils.scroll();
		Utils.minimize_window(964,2505);
		Utils.toggle_btn();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[4]/ul/li[4]/a")).click();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Utils.scroll();
		Utils.minimize_window(964,2505);
		Utils.toggle_btn();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[4]/ul/li[5]/a")).click();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Utils.scroll();
		Utils.minimize_window(964,2505);
		Utils.toggle_btn();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[4]/ul/li[7]/a")).click();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Utils.scroll();
		Utils.minimize_window(964,2505);
		Utils.toggle_btn();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[4]/ul/li[8]/a")).click();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Utils.scroll();
		Utils.minimize_window(964,2505);
		Utils.toggle_btn();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[4]/ul/li[6]/a")).click();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().to("https://medium.com/the-hipbar-blog");
		Utils.scroll();
		//*scrolls the page and minimizes the window and then the toggle button is clicked and
		//next tab is selected and the window is maximized and then again scrolls the page and
		//at last navigated to different URL*

	}
}
