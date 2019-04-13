package testNG_test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
  @BeforeTest
  public void browser_open() throws InterruptedException {
	  Browser.openBrowser();
  }
  @Test(priority=0)
  public void enter_url() throws InterruptedException {
	  Browser.enterUrl("https://www.hipbar.com");
  }
  @Test(enabled=false)
  public void SMS() throws InterruptedException {
	  SMS.msg91();
  }
  @Test(priority=2)
  public void Email() throws InterruptedException {
	  Email.MandrillDotCom();
  }
  @Test(dependsOnMethods="enter_url")
  public void Login() {
	  Login.enterYear("1999");
  }
  @Test(priority=1)
  public void Login_click() throws InterruptedException {
	  Login.enter_click();
	  Utils.HipbarDotCom();
  }
}
