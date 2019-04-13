package gifting_web;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

//import com.sun.org.apache.xpath.internal.operations.VariableSafeAbsRef;

public class Main {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		Browser.openBrowser();
		// Open chrome browser and maximize the window
		Browser.enterURL("https://gifting-web.amebae21.hasura-app.io");
		// Opens the gifting URL
		Agegate.agegate_button_type("Agree");
		// Agree button is clicked based on switch case type 
		GiftingV2.start_gifting_button();
		// Start gifting button is clicked
		GiftingV2.get_started_button();
		// Get started button is clicked
		GiftingV2.recipient_name("Ash");
		// Recipient name is passed as String parameters
		GiftingV2.select_city_button();
		// Select city button is clicked
		GiftingV2.choose_city("Chennai");
		// Recipient residing city is selected based on String parameters
		GiftingV2.recipient_fav_drink_button();
		// Recipient favourite drink button is clicked
		GiftingV2.select_genre_type();
		// Recipient favourite genre is selected based on city
		GiftingV2.view_drinks_button();
		// View drinks button is clicked
		GiftingV2.switch_city(false,3,true);
		// City is changed based on city length and boolean variable declaration(i.e true or false)
        GiftingV2.city_based_iteration();	
        // Based on the selected city the iteration for adding drinks is carried out by a for loop
		GiftingV2.gift_basket_button();
		// Gift basket button is clicked
		GiftingV2.promo_codes("Signin-Apply");
		// Signin to apply promo codes is clicked and all its actions are taken place here
		GiftingV2.personalise_button();
		// Personalise button is clicked
		GiftingV2.personal_msg_input("Manual");
		// Personal message input field is given as String parameters
		GiftingV2.receiver_number_input("9940191137");
		// Receiver mobile number is passed as String parameters
		GiftingV2.personalise_page_checkbox_input();
		// Checkbox field is selected
		GiftingV2.personalise_tc_or_pay(false,true);
		// Based on boolean condition T&C will be clicked and navigated else it will proceed to pay
		Payments.payment_method("Debit/Credit");
		// Payments method will be selected based on switch case variable mentioned in parameters and runs the corresponding case
	    Browser.browser_quit();
	    // Browser will be closed
	    }

	protected static String timestamp() 
	{
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
	}
	
	}
		