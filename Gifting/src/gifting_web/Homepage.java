package gifting_web;

import java.util.ArrayList;

import org.openqa.selenium.By;

public class Homepage extends Main {
	public static void startgiftingBtn_click() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"landing\"]/div[1]/div/div[1]/div/a/button")).click();
		Thread.sleep(2000);
	}
	public static void applestoreBtn_click() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"landing\"]/div[5]/div[3]/div/a[1]")).click();
		Thread.sleep(4000);
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
		driver.findElement(By.xpath("//*[@id=\"landing\"]/div[5]/div[3]/div/a[2]")).click();
	    Thread.sleep(4000);
	}
	public static void switchtabs1() throws InterruptedException {
		ArrayList<String> tabs4 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs4.get(1));
	    driver.close();
	    Thread.sleep(2000);
	    driver.switchTo().window(tabs4.get(0));
	    Thread.sleep(2000);
	}
	public static void retailoutletsBtn_click() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"landing\"]/div[5]/div[5]/a/button")).click();
		Thread.sleep(2000);
	}
	public static void startgiftingBtn2_click() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"landing\"]/div[6]/a/button")).click();
	    Thread.sleep(3000);
	}

}
