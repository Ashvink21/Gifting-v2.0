package gifting_web;

import java.util.ArrayList;

import org.openqa.selenium.By;

public class Redeeminggiftcards extends Main {
	public static void redeemingGCtab() throws InterruptedException {
		driver.findElement(By.cssSelector("#nav-item-2 > div:nth-child(1)")).click();
		Thread.sleep(2000);
	}
	public static void appleBtn_click() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/div[2]/a[1]")).click();
		Thread.sleep(7000);
	}
	public static void switchtabs() throws InterruptedException {
		ArrayList<String> tabs3 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs3.get(1));
	    driver.close();
	    Thread.sleep(2000);
	    driver.switchTo().window(tabs3.get(0));
	    Thread.sleep(2000);
	}
	public static void playstoreBtn_click() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/div[2]/a[2]")).click();
		Thread.sleep(7000);
	}
	public static void retailoutletsBtn_click() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/div[5]/a")).click();
		Thread.sleep(4000);
	}
	public static void startgiftingBtn_click() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/a")).click();
		Thread.sleep(4000);
		
	}

}
