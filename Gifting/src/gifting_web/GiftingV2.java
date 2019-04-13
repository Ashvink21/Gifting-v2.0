package gifting_web;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GiftingV2 extends Main
{
	
	public static String genre;
		
public static void start_gifting_button() throws IOException, InterruptedException
{
	driver.findElement(By.cssSelector("#landing-new > div.hero-container > div.hero-content > a > button")).click();
	//click on start gifting button
	System.out.println("Start gifting button is clicked on Homepage");
	Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Get_started"+timestamp()+".png");
	Thread.sleep(3000);	
}

public static void get_started_button() throws InterruptedException
{
	driver.findElement(By.cssSelector("#getstarted > div > div > div > div:nth-child(4) > a > button")).click();
	//click on get started button
	System.out.println("Get started button is clicked");
	Thread.sleep(1000);
}

public static void recipient_name(String name) throws IOException, InterruptedException
{
	driver.findElement(By.cssSelector("#send-gift-name > div > div > div > div:nth-child(2) > div > input[type=\"text\"]")).sendKeys(name);
	//click on receiver name input and enter the name in the text box
	Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Recipient_name"+timestamp()+".png");
	System.out.println("Recipient Name entered:" +name);
	Thread.sleep(1000);
}

public static void select_city_button() throws IOException, InterruptedException
{
	driver.findElement(By.cssSelector("#send-gift-name > div > div > div > div:nth-child(3) > a > button")).click();
	//click on select city button
	Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Recipient_city"+timestamp()+".png");
	System.out.println("Select city button is clicked");
	Thread.sleep(1000);
}

public static void choose_city(String city) throws InterruptedException, IOException
{
	switch(city) 
	{
	case "Chennai":
		driver.findElement(By.id("5")).click();
		Thread.sleep(1000);
		Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/City_selection"+timestamp()+".png");
		System.out.println("Chennai city is selected");
		break;
	case "Bengaluru":
		driver.findElement(By.xpath("//*[@id=\"1\"]")).click();
		Thread.sleep(1000);
		Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/City_selection"+timestamp()+".png");
		System.out.println("Bengaluru city is selected");
		break;
	case "Hyd":
		driver.findElement(By.cssSelector("#\\31 6")).click();
		Thread.sleep(1000);
		Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/City_selection"+timestamp()+".png");
		System.out.println("Hyderabad city is selected");
		break;
	}
}

public static void recipient_fav_drink_button() throws IOException, InterruptedException
{
	driver.findElement(By.cssSelector("#send-gift-city > div > div > div > div:nth-child(2) > div:nth-child(4) > a > button")).click();
	//click on recipient favorite drink button
	Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Recipient_fav_drink"+timestamp()+".png");
	System.out.println("Recipient favorite drink button is clicked");
	Thread.sleep(2500);
}

public static void view_drinks_button() throws IOException, InterruptedException 
{
	driver.findElement(By.cssSelector("#send-gift-drink > div > div > div > div:nth-child(2) > div:nth-child(4) > a > button")).click();
	//click on view drinks button
	System.out.println("View drinks button is clicked");
	Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/View_drinks"+timestamp()+".png");
	Thread.sleep(2000);
}

public static void switch_city(boolean condition,int number,boolean condition1) throws IOException, InterruptedException
{
	//Below if condition is to switch city using drop down menu
	String city = "Chennai";
			boolean f = condition;
			if(city.length() == number && f == condition1) 
			{
			Select changecity = new Select(driver.findElement(By.cssSelector("#product--listing__w-header > div:nth-child(1) > div > div > select")));
			changecity.selectByValue("1");
			Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Change_city"+timestamp()+".png");
			Thread.sleep(1000);
			}
			else if(city.length() == number && f == condition1) 
			{
				Select changecity = new Select(driver.findElement(By.cssSelector("#product--listing__w-header > div:nth-child(1) > div > div > select")));
			changecity.selectByValue("0");
			Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Change_city"+timestamp()+".png");
			Thread.sleep(1000);
			}
			else if(city.length() == number && f == condition1) 
			{
				Select changecity = new Select(driver.findElement(By.cssSelector("#product--listing__w-header > div:nth-child(1) > div > div > select")));
				changecity.selectByValue("2");
				Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Change_city"+timestamp()+".png");
				Thread.sleep(1000);
			}
}

public static void city_based_iteration() throws InterruptedException, IOException
{
	String city = "Chennai";
	if(city == "Chennai") 
	{
	    for (int i=1; i<=3; i++) 
	    {
        driver.findElement(By.xpath("//*[@id=\"BrandsListing\"]/div/div/div[2]/a["+ i + "]")).click();
        Thread.sleep(1500);
        Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Add_to_basket"+timestamp()+".png");
        driver.findElement(By.cssSelector("#product--details > div > div.paper.price > div.sku--container > div.sku--item > div.sku--item__desc > div.add-to-basket > button")).click();
        Thread.sleep(1000);
        Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Close_button"+timestamp()+".png");
        driver.findElement(By.cssSelector("#Cross")).click();
        Thread.sleep(1000);
        Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Back_button"+timestamp()+".png");
        driver.findElement(By.xpath("//*[@id=\"product--details\"]/div/div[1]/div[1]/a[1]")).click();
    	}
      }
	else if(city == "Bengaluru") 
	{
		for(int i=1;i<=3;i++) 
		{
			driver.findElement(By.xpath("//*[@id=\"BrandsListing\"]/div/div/div[2]/a["+ i + "]")).click();
	        Thread.sleep(1500);
	        Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Add_to_basket"+timestamp()+".png");
	        driver.findElement(By.cssSelector("#product--details > div > div.paper.price > div.sku--container > div.sku--item > div.sku--item__desc > div.add-to-basket > button")).click();
	        Thread.sleep(1000);
	        Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Close_button"+timestamp()+".png");
	        driver.findElement(By.xpath("//*[@id=\"modal-box2\"]/div/div/div[1]/p/span")).click();
	        Thread.sleep(1000);
	        Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Back_button"+timestamp()+".png");
	        driver.findElement(By.xpath("//*[@id=\"product--details\"]/div/div[1]/div[1]/a[1]")).click();
		}
	}
	System.out.println("N number of items are being iterated and added to basket for the following city:" +city);
	
}

public static void gift_basket_button() throws InterruptedException, IOException
{
	Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Gift_basket"+timestamp()+".png");
    driver.findElement(By.cssSelector("#product--listing__w-header > div:nth-child(2) > a")).click();
    //Gift basket is clicked
    System.out.println("Gift basket tab is clicked");
    Thread.sleep(1500);
}

public static void promo_codes(String promocodes) throws IOException, InterruptedException
{
    switch(promocodes)
    {
    case "Signin-Apply":
    	Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Signin_to_apply_promo_codes"+timestamp()+".png");
    	driver.findElement(By.xpath("//*[@id=\"gift--basket\"]/div/div/div[2]/div[1]/div")).click();
    	System.out.println("Sign in to view promo codes is clicked");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"SignIn\"]/div[1]/div/div/input")).sendKeys("9940191137");
        Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Consumer_number"+timestamp()+".png");
        System.out.println("Consumer Number is hardcoded");
        Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Proceed_button"+timestamp()+".png");
        driver.findElement(By.cssSelector("#SignIn > div.page-footer > div > div:nth-child(1) > button.btn.btn-primary.small")).click();
        System.out.println("Proceed button is clicked");
        Thread.sleep(2000);
        ((JavascriptExecutor)driver).executeScript("window.open()");
	    ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	    Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/New_window"+timestamp()+".png");
	    System.out.println("New browser tab is opened");
		driver.get("https://control.msg91.com/signin");
		Thread.sleep(5000);
		Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Msg91_signin_page"+timestamp()+".png");
		String newtabURL = driver.getCurrentUrl();
		if(newtabURL.contains("control.msg91.com/signin"))
		{
			System.out.println("Current tab URL is:" +newtabURL);
		}
		else
		{
			System.out.println("Given url failed to launch");
		}
		
		driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys("tech@hipbar.com");
		Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Msg91_username"+timestamp()+".png");
		System.out.println("Username is hardcoded");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"iwntuspswd2\"]")).click();
		Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Msg91_checkbox_for_password"+timestamp()+".png");
		System.out.println("Checkbox is selected");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("getclosertobooze");
		Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Msg91_password"+timestamp()+".png");
		System.out.println("Password is hardcoded");
		Thread.sleep(1500);
		Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Login_button"+timestamp()+".png");
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div/div/form[2]/div[2]/div/div/button")).click();
		Thread.sleep(5000);
		Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Send_sms"+timestamp()+".png");
		driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[3]/div/div[4]/ul/li[2]/a")).click();
		Thread.sleep(6000);
		Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Delivery_report"+timestamp()+".png");
		driver.findElement(By.xpath("//*[@id=\"filter_string\"]")).sendKeys("9940191137");
		Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Search_mobile_number"+timestamp()+".png");
		System.out.println("Mobile number is hardcoded in search box");
		Thread.sleep(1500);
		Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Search_record"+timestamp()+".png");
		driver.findElement(By.xpath("//*[@id=\"searchRecord\"]")).click();
		System.out.println("Search button is clicked");
		Thread.sleep(3500);
		Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Last_generated_otp"+timestamp()+".png");
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div[1]/div[5]/form/table/tbody/tr[1]/td[3]/a/div")).click();
		System.out.println("Last OTP for the hardcoded mobile number link is clicked");
		Thread.sleep(4000);
		Browser.scroll1p();
		Thread.sleep(2000);
		WebElement TxtBoxContent = driver.findElement(By.xpath("//*[@id=\"msgPreview\"]//textarea"));
		Actions act = new Actions(driver);
		Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Double_click_otp_text"+timestamp()+".png");
		act.moveToElement(TxtBoxContent).doubleClick().build().perform();
		String s1 = TxtBoxContent.getText();
				System.out.println("OTP Text box message is:" +s1);
		String s2= s1.substring(55, 61);
			System.out.println("OTP substring message is:" +s2);
			Thread.sleep(1500);
		Browser.scroll1n();
		Thread.sleep(1000);
		Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Close_button"+timestamp()+".png");
		driver.findElement(By.xpath("/html/body/div[12]/div[1]/button")).click();
		System.out.println("Closing the pop up window");
		Thread.sleep(1000);
		driver.switchTo().window(tabs.get(0));
		Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Previous_window"+timestamp()+".png");
		System.out.println("Switching tabs from 1 to 0");
		Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@id=\"SignIn\"]/div[1]/div[4]/div/input")).sendKeys(s2);
        System.out.println("OTP Text box is clicked and the stored OTP value in a variable is hardcoded");
        Thread.sleep(1500);
        Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Otp_pasted"+timestamp()+".png");
        Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Signin_to_proceed_button"+timestamp()+".png");
        driver.findElement(By.cssSelector("#SignIn > div.page-footer > div:nth-child(1) > button.btn.btn-primary.small")).click();
        System.out.println("Signin to Proceed button is clicked");
        Thread.sleep(1500);
        Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Apply_promo_code"+timestamp()+".png");
        driver.findElement(By.xpath("//*[@id=\"gift--basket\"]/div/div/div[2]/div[1]/div")).click();
        System.out.println("Apply promo code tab is clicked");
        Thread.sleep(4500);
        //String xpath = driver.findElement(By.xpath("//*[@id=\"promo--codes\"]/div[2]/p")).getText();
        //System.out.println(xpath);
        //Thread.sleep(2000);
        String qamani = driver.findElement(By.xpath("//*[@id=\"promo--codes\"]/div[2]/div/div[1]/div[1]/p[1]")).getText();
        System.out.println("Listed promo code is:" +qamani);
        Thread.sleep(1500);
        String amount = driver.findElement(By.xpath("//*[@id=\"gift--basket\"]/div/div/div[2]/div[2]/div/div[1]/div/p[2]")).getText();
        System.out.println("Amount to be paid in String value:" +amount);
        String topay = amount.substring(2, 4);
        System.out.println("Amount to be paid is converted to interger value:" +topay);
        Thread.sleep(1000);
        int itest = Integer.parseInt(topay);
        try {
        
        // promoinput = "#promo--codes > div.promo--code__form > div > input";

        		//driver.findElement(By.xpath("//*[@id=\"promo--codes\"]/div[1]/div/input")).sendKeys("TESLA")
        	if(itest >= 100) {
        if(qamani.contains("QAMANI"))
        	{
        			driver.findElement(By.xpath("//*[@id=\"promo--codes\"]/div[1]/div/input")).sendKeys(qamani);
        			Thread.sleep(1000);
        			driver.findElement(By.xpath("//*[@id=\"promo--codes\"]/div[1]/div/span")).click();
        			Thread.sleep(1500);
        	}
        else if(driver.findElement(By.xpath("//*[@id=\"promo--codes\"]/div[2]/p")).isDisplayed()) {
        	System.out.println("No promo codes available");
        	Thread.sleep(1000);
        	Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Close_button"+timestamp()+".png");
        	driver.findElement(By.xpath("//*[@id=\"modal-box2\"]/div/div/div[1]/p/div/div[2]")).click();
    		Thread.sleep(1500);
        	
        }
        }
        	else
        		
        		System.out.println("Promo conditions are not met");
        }
    catch(Exception e) {
    	System.out.println("No such element");
    }
        driver.findElement(By.xpath("//*[@id=\"modal-box2\"]/div/div/div[1]/p/div/div[2]")).click();
        Thread.sleep(1500);
        break;
        
    case "Apply":
    	Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Apply_promo_code"+timestamp()+".png");
    	driver.findElement(By.xpath("//*[@id=\"gift--basket\"]/div/div/div[2]/div[1]/div")).click();
        Thread.sleep(4000);
        String qamani1 = driver.findElement(By.xpath("//*[@id=\"promo--codes\"]/div[2]/div/div[1]/div[1]/p[1]")).getText();
        System.out.println(qamani1);
        Thread.sleep(1500);
        String amount1 = driver.findElement(By.xpath("//*[@id=\"gift--basket\"]/div/div/div[2]/div[2]/div/div[1]/div/p[2]")).getText();
        System.out.println(amount1);
        String topay1 = amount1.substring(2, 4);
        System.out.println(topay1);
        Thread.sleep(1000);
        int itest1 = Integer.parseInt(topay1);
        try {
        	if(itest1 >= 100) {
        if(qamani1.contains("QAMANI"))
    	{
    			driver.findElement(By.xpath("//*[@id=\"promo--codes\"]/div[1]/div/input")).sendKeys(qamani1);
    			Thread.sleep(1000);
    			driver.findElement(By.xpath("//*[@id=\"promo--codes\"]/div[1]/div/span")).click();
    			Thread.sleep(1500);
    	}
        else if(driver.findElement(By.xpath("//*[@id=\"promo--codes\"]/div[2]/p")).isDisplayed()) {
        	System.out.println("No promo codes available");
        	Thread.sleep(1000);
        	Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Close_button"+timestamp()+".png");
        	driver.findElement(By.xpath("//*[@id=\"modal-box2\"]/div/div/div[1]/p/div/div[2]")).click();
    		Thread.sleep(1500);
        	
        }
        }
        	else
        		System.out.println("Promo conditions are not met");
        }
        catch(Exception e) {
	    	System.out.println("No such element");
	    }
        driver.findElement(By.xpath("//*[@id=\"modal-box2\"]/div/div/div[1]/p/div/div[2]")).click();
        Thread.sleep(1500);
        break;
    }
}

public static void personalise_button() throws IOException, InterruptedException
{
	Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Personalise_button"+timestamp()+".png");
    driver.findElement(By.xpath("//*[@id=\"gift--basket\"]/div/div/div[2]/div[3]/a/button")).click();
    Thread.sleep(2000);
    System.out.println("Personalise button is clicked");
}

public static void personal_msg_input(String type) throws IOException, InterruptedException
{
	switch(type) {
    case "Manual":
    	Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Personal_message"+timestamp()+".png");
    	driver.findElement(By.xpath("//*[@id=\"giftInputForm\"]/div/div/div[3]/div/textarea")).sendKeys("Hi, Enjoy your drink!");
    	Thread.sleep(1000);
    	System.out.println("Personal message entered is hardcoded");
    	break;
    case"Automatic":
    	String generatedString = RandomStringUtils.randomAlphabetic(250);
	    System.out.println(generatedString);
	    Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Personalise_button"+timestamp()+".png");
		driver.findElement(By.xpath("//*[@id=\\\"giftInputForm\\\"]/div/div/div[3]/div/textarea")).sendKeys(generatedString);
		System.out.println("Personal message entered is auto generated");
		Thread.sleep(1500);
		break;
    }
}

public static void receiver_number_input(String number) throws InterruptedException, IOException
{
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,400)", "");
	Thread.sleep(1000);
	Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Receiver_number"+timestamp()+".png");
	driver.findElement(By.xpath("//*[@id=\"giftInputForm\"]/div/div/div[4]/div[2]/div/input")).sendKeys(number);
	Thread.sleep(1000);
	System.out.println("Receiver mobile number entered is hardcoded");
}

public static void personalise_page_checkbox_input() throws InterruptedException, IOException
{
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,400)", "");
	Thread.sleep(1000);
	Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Checkbox_button"+timestamp()+".png");
	driver.findElement(By.xpath("//*[@id=\"giftInputForm\"]/div/div/div[5]/div[3]/div/span[1]")).click();
	Thread.sleep(1000);
	System.out.println("Checkbox is clicked");
}

public static void personalise_tc_or_pay(boolean condition,boolean condition1) throws InterruptedException, IOException
{
	boolean a = condition;
    WebElement tc = driver.findElement(By.linkText("Terms & Conditions"));
    
    
    if(tc.isDisplayed() && a == condition1) 
    {
    	tc.click();
        System.out.println("Terms&Conditions link is clicked and opened in a new tab");
        Thread.sleep(1500);
        Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/T&C_link"+timestamp()+".png");
        System.out.println("Terms and conditions <a> link is being clicked and opened in a new tab");
        ArrayList<String> tabs1 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs1.get(0));
        Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Previous_window"+timestamp()+".png");
        System.out.println("Switch back to the old tab");
        Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Proceed_to_pay_button"+timestamp()+".png");
        driver.findElement(By.xpath("//*[@id=\"giftInputForm\"]/div/div/div[6]/button")).click();
    	Thread.sleep(1500);
    	System.out.println("Proceed to Pay button is clicked");
    }
    else 
    {
    	Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Proceed_to_pay_button"+timestamp()+".png");
    	driver.findElement(By.xpath("//*[@id=\"giftInputForm\"]/div/div/div[6]/button")).click();
    	Thread.sleep(1500);
    	System.out.println("Proceed to Pay button is clicked");
    }
}

public static void select_genre_type() throws IOException, InterruptedException
{
	String city = "Chennai";
	if(city.equals("Chennai")) 
	{
		genre = "beer";
		System.out.println("Selected genre:"+genre);
		switch(genre) 
		{
		case "beer":
			driver.findElement(By.cssSelector("#\\30")).click();
			Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Recipient_fav_genre"+timestamp()+".png");
			Thread.sleep(1000);
			break;
		case "rum":
			driver.findElement(By.cssSelector("#\\31")).click();
			Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Recipient_fav_genre"+timestamp()+".png");
			Thread.sleep(1000);
			break;
		case "domesticwhisky":
			driver.findElement(By.cssSelector("#\\32")).click();
			Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Recipient_fav_genre"+timestamp()+".png");
			Thread.sleep(1000);
			break;
		case "importedwhiskey":
			driver.findElement(By.cssSelector("#\\33")).click();
			Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Recipient_fav_genre"+timestamp()+".png");
			Thread.sleep(1000);
			break;
		case "singlemaltwhiskey":
			driver.findElement(By.cssSelector("#\\34")).click();
			Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Recipient_fav_genre"+timestamp()+".png");
			Thread.sleep(1000);
			break;
		case "domesticwine":
			driver.findElement(By.cssSelector("#\\35")).click();
			Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Recipient_fav_genre"+timestamp()+".png");
			Thread.sleep(1000);
			break;
		case "importedwine":
			driver.findElement(By.cssSelector("#\\36")).click();
			Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Recipient_fav_genre"+timestamp()+".png");
			Thread.sleep(1000);
			break;
		case "vodka":
			driver.findElement(By.cssSelector("#\\37")).click();
			Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Recipient_fav_genre"+timestamp()+".png");
			Thread.sleep(1000);
			break;
		case "gin":
			driver.findElement(By.cssSelector("#\\38")).click();
			Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Recipient_fav_genre"+timestamp()+".png");
			Thread.sleep(1000);
			break;
		case "tequila":
			driver.findElement(By.cssSelector("#\\39")).click();
			Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Recipient_fav_genre"+timestamp()+".png");
			Thread.sleep(1000);
			break;
		case "brandy":
			driver.findElement(By.cssSelector("#\\31 0")).click();
			Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Recipient_fav_genre"+timestamp()+".png");
			Thread.sleep(1000);
			break;
		case "liqueur":
			driver.findElement(By.cssSelector("#\\31 1")).click();
			Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Recipient_fav_genre"+timestamp()+".png");
			Thread.sleep(1000);
			break;
		}
		}
		else if(city.equals("Bengaluru")) 
		{
			switch(genre) 
			{
			case "beer":
				driver.findElement(By.cssSelector("#\\30")).click();
				Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Recipient_fav_genre"+timestamp()+".png");
				Thread.sleep(1000);
				break;
			case "rtd":
				driver.findElement(By.cssSelector("#\\31")).click();
				Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Recipient_fav_genre"+timestamp()+".png");
				Thread.sleep(1000);
				break;
			case "rum":
				driver.findElement(By.cssSelector("#\\32")).click();
				Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Recipient_fav_genre"+timestamp()+".png");
				Thread.sleep(1000);
				break;
			case "domesticwhiskey":
				driver.findElement(By.cssSelector("#\\33")).click();
				Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Recipient_fav_genre"+timestamp()+".png");
				Thread.sleep(1000);
				break;
			case "importedwhiskey":
				driver.findElement(By.cssSelector("#\\34")).click();
				Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Recipient_fav_genre"+timestamp()+".png");
				Thread.sleep(1000);
				break;
			case "singlemaltwhiskey":
				driver.findElement(By.cssSelector("#\\35")).click();
				Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Recipient_fav_genre"+timestamp()+".png");
				Thread.sleep(1000);
				break;
			case "domesticwine":
				driver.findElement(By.cssSelector("#\\36")).click();
				Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Recipient_fav_genre"+timestamp()+".png");
				Thread.sleep(1000);
				break;
			case "vodka":
				driver.findElement(By.cssSelector("#\\37")).click();
				Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Recipient_fav_genre"+timestamp()+".png");
				Thread.sleep(1000);
				break;
			}
			
		}
		else if(city.equals("Hyd")) 
		{
			switch(genre) 
			{
			case "countyside":
				driver.findElement(By.cssSelector("#\\30")).click();
				Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Recipient_fav_genre"+timestamp()+".png");
				Thread.sleep(1000);
				break;
			case "domesticwhiskey":
				driver.findElement(By.cssSelector("#\\31")).click();
				Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Recipient_fav_genre"+timestamp()+".png");
				Thread.sleep(1000);
				break;
			case "singlemaltwhiskey":
				driver.findElement(By.cssSelector("#\\32")).click();
				Browser.screenshot("/home/ashvin/Desktop/AutomationScreenshots/Recipient_fav_genre"+timestamp()+".png");
				Thread.sleep(1000);
				break;
			}
		}
}

}