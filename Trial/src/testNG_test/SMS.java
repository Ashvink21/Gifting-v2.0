package testNG_test;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SMS extends WebTestBase {
	public static void msg91() throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(2));
		driver.get("https://control.msg91.com/signin");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys("tech@hipbar.com");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"iwntuspswd2\"]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("tech@hipbar.com");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("getclosertobooze");
		Thread.sleep(1500);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div/div/form[2]/div[2]/div/div/button")).click();
		Thread.sleep(5000);
		String s1 = driver.findElement(By.cssSelector("#routeBal_4")).getText();
		System.out.println("SMS Count:" + s1);
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"menu\"]/li[2]/a")).click();
		Thread.sleep(3000);
		String s2 = driver
				.findElement(By
						.xpath("html/body/div[3]/div[1]/div[2]/div[1]/div[1]/div[5]/form[1]/table/tbody/tr[1]/td[1]/p"))
				.getText();
		// System.out.println("Output: " + TxtBoxContent.getAttribute("value"));
		// Actions act = new Actions(driver);
		// act.moveToElement(TxtBoxContent)..build().perform();
		// String s2 = TxtBoxContent.getText();
		System.out.println("Last Send SMS Date&Time:" + s2);
		// String s2 =
		// driver.findElement(By.xpath("//*[@id=\"dlrchk_3961446f505a363431313133\"]/td[1]")).getText();
		// System.out.println("Last Send SMS Date&Time:" + s2);
	}

}
