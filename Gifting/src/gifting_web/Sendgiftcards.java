package gifting_web;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Sendgiftcards extends Main {
	public static void sendGCtab() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"nav-item-1\"]")).click();
		Thread.sleep(4000);
	}
	public static void switchcase( int amount) throws InterruptedException {
		
		switch(amount) {
		case 500:
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/div[1]/div/div[2]/div[1]/div/div[1]/input")).click();
			break;
		case 1000:
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/div[1]/div/div[2]/div[1]/div/div[2]/input")).click();
			break;
		case 2000:
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/div[1]/div/div[2]/div[1]/div/div[3]/input")).click();
			break;
		}
	}
		public static void otherBtn_click() throws InterruptedException {
			Random rand = new Random();
			int n = rand.nextInt(10000) + 100;
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/div[1]/div/div[2]/div[1]/div/div[4]/input")).sendKeys(String.valueOf(n));
			Thread.sleep(2000);
			
	}
		public static void personalmessage_click(String msgtype) throws InterruptedException {
			//String msgtype = "edit";
			switch(msgtype) {
				case "random":
			String generatedString = RandomStringUtils.randomAlphabetic(250);
		    System.out.println(generatedString);
			driver.findElement(By.xpath("//*[@id=\"send-gift\"]/div[2]/div/div[1]/div/div[2]/div[2]/textarea")).sendKeys(generatedString);
			Thread.sleep(2500);
			break;
				case "edit":
					driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/div[1]/div/div[2]/div[2]/textarea")).sendKeys("Happy birthday to one of the few people whose birthday I can remember without a Facebook reminder.\n" + 
							"Forget about the past, you can’t change it. Forget about the future, you can’t predict it. Forget about the present,I didn’t get you one.Enjoy the drink");
					Thread.sleep(2500);
					break;
			}
			
		}
		public static void receivername_click(String name) throws InterruptedException {
			//String s = RandomStringUtils.randomAlphabetic(8); 
			//System.out.println(s);
			//driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/div[1]/div/div[3]/div[1]/input")).sendKeys(s);
			//Thread.sleep(1500);
			driver.findElement(By.xpath("//*[@id=\"send-gift\"]/div[2]/div/div[1]/div/div[3]/div[1]/input")).sendKeys(name);
			Thread.sleep(1500);
		}
		public static void receiverno_click(long number) throws InterruptedException {
			//Random objGenerator = new Random();
            //for (int iCount = 0; iCount< 10; iCount++){
              //int randomNumber = objGenerator.nextInt(500000000);
              //System.out.println("Random No : " + randomNumber);
              //driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/div[1]/div/div[3]/div[2]/div/input")).sendKeys(String.valueOf(randomNumber));
			driver.findElement(By.xpath("//*[@id=\"send-gift\"]/div[2]/div/div[1]/div/div[3]/div[2]/div/input")).sendKeys(String.valueOf(number));
             //}
            Thread.sleep(3000);
		}
		public static void sendername_click(String name) throws InterruptedException {
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/div[1]/div/div[4]/div[1]/input")).sendKeys(name);
			Thread.sleep(1500);
		}
		public static void senderno_click(long number) throws InterruptedException {
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/div[1]/div/div[4]/div[2]/div/input")).sendKeys(String.valueOf(number));
			Thread.sleep(1500);
		}
		public static void sgctc() throws InterruptedException {
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/div[1]/div/div[5]/div/div/span[2]/a")).click();
			Thread.sleep(2000);
		}
		public static void switchTabs() throws InterruptedException {
			ArrayList<String> tabs5 = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs5.get(1));
		    Thread.sleep(2000);
		    driver.close();
		    Thread.sleep(2000);
		    driver.switchTo().window(tabs5.get(0));
		    Thread.sleep(2000);
		}
		public static void checkbox_click() throws InterruptedException {
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/div[1]/div/div[5]/div/div/span[1]")).click();
			Thread.sleep(1500);
		}
		public static void signinBtn_click() throws InterruptedException {
			driver.findElement(By.xpath("//*[@id=\"send-gift\"]/div[2]/div/div[1]/div/div[6]/button")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath("//*[@id=\"SignIn\"]/div[2]/div/div[1]/button[2]")).click();
			Thread.sleep(1500);
		}
		public static void msg91() throws InterruptedException {
			((JavascriptExecutor)driver).executeScript("window.open()");
		    ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs.get(1));
			driver.get("https://control.msg91.com/signin");
			Thread.sleep(5000);
			//driver.switchTo().frame(driver.findElement(By.name("iFrameTitle")));
			//Thread.sleep(1000);
			//driver.findElement(By.xpath("//*[@id=\"intercom-container\"]/div/div/div[2]")).click();
			//Thread.sleep(1500);
			//driver.findElement(By.xpath("//*[@id=\"intercom-container\"]/div/div/div[2]")).click();
			//Thread.sleep(1500);
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
			driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[3]/div/div[4]/ul/li[2]/a")).click();
			Thread.sleep(4500);
			driver.findElement(By.xpath("//*[@id=\"filter_string\"]")).sendKeys("9940191137");
			Thread.sleep(1500);
			driver.findElement(By.xpath("//*[@id=\"searchRecord\"]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div[1]/div[5]/form/table/tbody/tr[1]/td[3]/a/div")).click();
			Thread.sleep(1500);
			Browser.scroll1p();
			WebElement TxtBoxContent = driver.findElement(By.xpath("//*[@id=\"msgPreview\"]/textarea"));
		//System.out.println("Output: " + TxtBoxContent.getAttribute("value"));
			Actions act = new Actions(driver);
			act.moveToElement(TxtBoxContent).doubleClick().build().perform();
			String s1 = TxtBoxContent.getText();
					System.out.println(s1);
			String s2= s1.substring(55, 61);
				System.out.println(s2);
				Thread.sleep(1500);
			
//			String s1= TxtBoxContent.getText();
//			String s2= s1.substring(55, 6);
//			Thread.sleep(3000);
			Browser.scroll1n();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[12]/div[1]/button")).click();
			Thread.sleep(1000);
			driver.switchTo().window(tabs.get(0));
			Thread.sleep(1500);
			//String s1 = TxtBoxContent.getText();
//			String s2 = s1.substring(55, 62);
//			System.out.println(s2);
            driver.findElement(By.xpath("//*[@id=\"SignIn\"]/div[1]/div[4]/div/input")).sendKeys(s2);
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id=\"SignIn\"]/div[2]/div[1]/button[2]")).click();
            Thread.sleep(3500);
            Browser.scroll3p();
            driver.findElement(By.xpath("//*[@id=\"send-gift\"]/div[2]/div/div[1]/div/div[6]/button")).click();
            Thread.sleep(4000);
            driver.findElement(By.id("1")).click();
            Thread.sleep(1500);
            
		}
		public static void card_details(long number) throws InterruptedException {
			driver.findElement(By.xpath("//*[@id=\"checkout\"]/div[2]/div/div[1]/div[1]/div/div/div[1]/div[2]/div[1]/input")).sendKeys(String.valueOf(number));
			Thread.sleep(1500);
			driver.findElement(By.xpath("//*[@id=\"checkout\"]/div[2]/div/div[1]/div[1]/div/div/div[1]/div[2]/div[2]/div[1]/input")).sendKeys("052020");
			Thread.sleep(1500);
			driver.findElement(By.xpath("//*[@id=\"checkout\"]/div[2]/div/div[1]/div[1]/div/div/div[1]/div[2]/div[2]/div[2]/input")).sendKeys("123");
			Thread.sleep(1500);
			driver.findElement(By.xpath("//*[@id=\"checkout\"]/div[2]/div/div[1]/div[1]/div/div/div[1]/div[2]/div[3]/input")).sendKeys("Test");
			Thread.sleep(1500);
			Browser.scroll1p();
			driver.findElement(By.xpath("//*[@id=\"checkout\"]/div[2]/div/div[1]/div[2]/button")).click();
			Thread.sleep(10000);
			Browser.scroll1p();
		}
			public static void TxnHistory_Btn() throws InterruptedException {
			driver.findElement(By.cssSelector("div.s7:nth-child(2)")).click();
			Thread.sleep(1500);
			driver.findElement(By.cssSelector("div.menu-item:nth-child(1)")).click();
			Thread.sleep(5000);
			}
			public static void signout_Btn() throws InterruptedException {
				driver.findElement(By.cssSelector("div.s7:nth-child(2)")).click();
				Thread.sleep(1500);
				driver.findElement(By.cssSelector("div.menu-item:nth-child(2)")).click();
				Thread.sleep(1500);
			}
		}


