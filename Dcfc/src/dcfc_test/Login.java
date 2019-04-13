package dcfc_test;

import org.openqa.selenium.By;

public class Login extends WebTestBase {
	public static void enterYear(String year) {
		driver.findElement(By.xpath("//*[@id=\"welcome\"]/div/div/div[1]/div/input")).sendKeys(year);
		// Year is entered in the loaded URL
	}
public static void enter_click() {
	driver.findElement(By.className("enter-site")).click();
	// Enter button is clicked
}

}

