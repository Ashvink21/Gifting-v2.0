package gifting_web;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

public class ReportFormat 
{
	
  @Test(priority = 1)
  public void Open_Browser() throws IOException, InterruptedException
  {
    Browser.openBrowser();
	// Open chrome browser and maximize the window
  }
  
  
  @Test(priority = 2)
  public void Enter_URL() throws InterruptedException, IOException
  {
	Browser.enterURL("https://gifting-web.amebae21.hasura-app.io");
	// Opens the gifting URL
  }
  
  
  @Test(priority = 3)
  public void Age_Gate() throws IOException, InterruptedException
  {
	Agegate.agegate_button_type("Agree");
	// Agree button is clicked based on switch case type
  }
  
  
  @Test(priority = 4)
  public void Start_Gifting() throws IOException, InterruptedException
  {
	GiftingV2.start_gifting_button();
	// Start gifting button is clicked
  }
  
  
  @Test(priority = 5)
  public void Get_Started() throws InterruptedException
  {
	GiftingV2.get_started_button();
	// Get started button is clicked
  }
  
  
  @Test(priority = 6)
  public void Recipient_Name() throws IOException, InterruptedException
  {
	GiftingV2.recipient_name("Ash");
	// Recipient name is passed as String parameters
  }
  
  
  @Test(priority = 7)
  public void Select_City() throws IOException, InterruptedException
  {
	GiftingV2.select_city_button();
	// Select city button is clicked
  }
  
  
  @Test(priority = 8)
  public void Choose_City() throws InterruptedException, IOException
  {
	GiftingV2.choose_city("Chennai");
	// Recipient residing city is selected based on String parameters
  }
  
  
  @Test(priority = 9)
  public void Recipient_Favourite_Drink() throws IOException, InterruptedException
  {
	GiftingV2.recipient_fav_drink_button();
	// Recipient favourite drink button is clicked
  }
  
  
  @Test(priority = 10)
  public void Select_Genre() throws IOException, InterruptedException
  {
	GiftingV2.select_genre_type();
	// Recipient favourite genre is selected based on city
  }
  
  
  @Test(priority = 11)
  public void View_Drinks() throws IOException, InterruptedException
  {
	GiftingV2.view_drinks_button();
	// View drinks button is clicked
  }
  
  
  @Test(priority = 12)
  public void Switch_City() throws IOException, InterruptedException
  {
	GiftingV2.switch_city(false,3,true);
	// City is changed based on city length and boolean variable declaration(i.e true or false)
  }
  
  
  @Test(priority = 13)
  public void City_Iteration() throws InterruptedException, IOException
  {
  GiftingV2.city_based_iteration();	
  // Based on the selected city the iteration for adding drinks is carried out by a for loop
  }
  
  
  @Test(priority = 14)
  public void Gift_Basket() throws InterruptedException, IOException
  {
	GiftingV2.gift_basket_button();
	// Gift basket button is clicked
  }
  
  
  @Test(priority = 15)
  public void Promo_Codes() throws IOException, InterruptedException
  {
	GiftingV2.promo_codes("Signin-Apply");
	// Signin to apply promo codes is clicked and all its actions are taken place here
  }
  
  
  @Test(priority = 16)
  public void Personalise() throws IOException, InterruptedException
  {
	GiftingV2.personalise_button();
	// Personalise button is clicked
  }
  
  
  @Test(priority = 17)
  public void Personal_Message() throws IOException, InterruptedException
  {
	GiftingV2.personal_msg_input("Manual");
	// Personal message input field is given as String parameters
  }
  
  
  @Test(priority = 18)
  public void Receiver_Number() throws InterruptedException, IOException
  {
	GiftingV2.receiver_number_input("9940191137");
	// Receiver mobile number is passed as String parameters
  }
  
  
  @Test(priority = 19)
  public void Personalise_Checkbox() throws InterruptedException, IOException
  {
	GiftingV2.personalise_page_checkbox_input();
	// Checkbox field is selected
  }
  
  
  @Test(priority = 20)
  public void Personalise_TC_or_Pay() throws InterruptedException, IOException
  {
	GiftingV2.personalise_tc_or_pay(false,true);
	// Based on boolean condition T&C will be clicked and navigated else it will proceed to pay
  }
  
  
  @Test(priority = 21)
  public void Payment_Type() throws IOException, InterruptedException
  {
	Payments.payment_method("Debit/Credit");
	// Payments method will be selected based on switch case variable mentioned in parameters and runs the corresponding case
  }
  
  
  @Test(priority = 22)
  public void Quit()
  {
	Browser.browser_quit();
  // Browser will be closed
  }

  
protected static String timestamp() 
{
	return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
}

}
