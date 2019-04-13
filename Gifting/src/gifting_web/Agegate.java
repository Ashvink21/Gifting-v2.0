package gifting_web;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;

public class Agegate extends Main 
{
	public static void agegate_button_type(String button_type) throws IOException, InterruptedException
	{
		switch(button_type) 
		{
		case "Disagree":
			driver.findElement(By.cssSelector("#app > div > div > div.button-group > button.btn.btn-secondary")).click();
			Thread.sleep(1500);
			Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Landing_page"+timestamp()+".png");
			System.out.println("Disagree button is clicked on Age gate page");
			break;
			
		case "Agree":
			driver.findElement(By.xpath("//*/div/div/div[2]/button[2]")).click();
			Thread.sleep(1500);
			Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Landing_page"+timestamp()+".png");
			System.out.println("Agree button is clicked on Age gate page");
			break;	
	}
	}
	
	public static void legalageLink() throws InterruptedException 
	{
		driver.findElement(By.xpath("//*[@id=\"confirm-modal\"]/div/div/div[2]/div/a")).click();
		Thread.sleep(2000);

    }
	
	public static void switchTabs() throws InterruptedException 
	{
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
	    Thread.sleep(2000);
	    driver.close();
	    Thread.sleep(2000);
	    driver.switchTo().window(tabs2.get(0));
	    Thread.sleep(2000);	
	}
	
	public static void disagreeBtn_click() throws InterruptedException 
	{
		driver.findElement(By.xpath("//*[@id=\"confirm-modal\"]/div/div/div[3]/button[1]")).click();
		Thread.sleep(2000);
	}
	
	public static void agreeBtn_click() throws InterruptedException 
	{
		driver.findElement(By.xpath("//*[@id=\"confirm-modal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
	}
	
}
