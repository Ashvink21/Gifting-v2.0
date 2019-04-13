package testNG_test;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Email extends WebTestBase {
	public static void MandrillDotCom() throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.navigate().to("https://mandrillapp.com/login/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"logins-block\"]/div[1]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("hipbar");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("B00z$M@ndRiL1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/div[4]/button")).click();
		Thread.sleep(7000);
		String s1 = driver.findElement(By.xpath("//*[@id=\"main-narrow\"]/div[3]/div[2]/div[1]/div/div/span[1]"))
				.getText();
		System.out.println("Email Count:" + s1);
		driver.findElement(By.xpath("//*[@id=\"main-nav\"]/li[3]/a")).click();
		Thread.sleep(5000);
		String s2 = driver.findElement(By.xpath("//*[@id=\"search-results\"]/table/tbody/tr[1]/td[1]/span")).getText();
		System.out.println("Last Sent Email Date&Time:" + s2);

	}
}