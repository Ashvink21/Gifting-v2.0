package gifting_web;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Payments extends Main 
{
	public static void payment_method(String ModeOfPayment) throws IOException, InterruptedException
	{   
        switch(ModeOfPayment) 
        {
        case "Debit/Credit":
        	Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Payment_page"+timestamp()+".png");
        	driver.findElement(By.xpath("//*[@id=\"1\"]")).click();
        	Thread.sleep(1500);
        	Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Debit_Credit_radio_button"+timestamp()+".png");
        	System.out.println("Debit/Credit card radio button is clicked");
        	JavascriptExecutor jse = (JavascriptExecutor)driver;
        	jse.executeScript("window.scrollBy(0,400)", "");
    		Thread.sleep(2000);
        	driver.findElement(By.xpath("//*[@id=\"checkout\"]/div/div/div[2]/div[1]/div/div/div[4]/div[2]/div[1]/input")).sendKeys("4242424242424242");
        	Thread.sleep(2000);
        	Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Card_number"+timestamp()+".png");
        	System.out.println("Card Number is entered and it is hardcoded");
        	driver.findElement(By.xpath("//*[@id=\"checkout\"]/div/div/div[2]/div[1]/div/div/div[4]/div[2]/div[2]/div[1]/input")).sendKeys("0520");
        	Thread.sleep(2000);
        	Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Expiry_date"+timestamp()+".png");
        	System.out.println("Expiry date is entered and it is hardcoded");
        	driver.findElement(By.xpath("//*[@id=\"checkout\"]/div/div/div[2]/div[1]/div/div/div[4]/div[2]/div[2]/div[2]/input")).sendKeys("111");
        	Thread.sleep(2000);
        	Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/CVV"+timestamp()+".png");
        	System.out.println("CVV is entered and it is hardcoded");
        	driver.findElement(By.xpath("//*[@id=\"checkout\"]/div/div/div[2]/div[1]/div/div/div[4]/div[2]/div[3]/input")).sendKeys("Test");
        	Thread.sleep(2000);
        	Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Name_on_the_card"+timestamp()+".png");
        	System.out.println("Name on the card is entered and it is hardcoded");
        	jse.executeScript("window.scrollBy(0,300)", "");
    		Thread.sleep(1500);
    		Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Pay_button"+timestamp()+".png");
    		driver.findElement(By.xpath("//*[@id=\"checkout\"]/div/div/div[2]/div[2]/button")).click();
    		System.out.println("Pay button is clicked");
    		Thread.sleep(8000);
    		
    		String title = driver.getCurrentUrl();
    		if(title.contains("transaction-successful")) 
    		{
    			Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Transaction_successful"+timestamp()+".png");
    			driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div/span[2]")).click();
    			Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Logout_drop_down_button"+timestamp()+".png");
    			System.out.println("Logout drop down button is clicked");
    			Thread.sleep(1000);
    			Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Transaction_history"+timestamp()+".png");
    			driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div/div[2]/div[1]")).click();
    			System.out.println("Under the logout drop down button transaction history is clicked");
    			Thread.sleep(1500);
    			Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/TransactionHistory.png");
    			jse.executeScript("window.scrollBy(0,300)", "");
	    		Thread.sleep(1000);
	    		Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/TransactionHistory1.png");
	    		Thread.sleep(1000);
	    		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div/span[2]")).click();
    			System.out.println("Logout drop down button is clicked");
    			Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Sign_out_button"+timestamp()+".png");
	    		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div/div[2]/div[2]")).click();
	    		System.out.println("Under the logout drop down button sign out is clicked");
	    		Thread.sleep(1500);
	    		Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/SignOutPage.png");
	    		Thread.sleep(1000);
	    		Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/After_sign_out"+timestamp()+".png");
    		}
    		else 
    		{
    			System.out.println("transaction-failed");
    		}
    		break;
    		
        case "Netbanking":
        	driver.findElement(By.xpath("//*[@id=\"2\"]")).click();
        	System.out.println("Netbanking radio button is clicked");
        	Thread.sleep(1000);
        	
        	break;
        }
	}

}
