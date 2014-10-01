
/*********** This package looks after the login functionality which includes navigating the user to the login page, entering the username and
password and submitting it*************/

package Login;

//imports all the required classes
import org.openqa.selenium.WebDriver;

import POM.POM;

public class Login {

	
	public static void LoginScreen(WebDriver driver)
	{
		//Clicks on the link saying"Existing User? Login to Xero"
		POM.SignUpLink(driver).click();
		
		//Enters the user name
		POM.UserName(driver).sendKeys("vishalpatel1587@gmail.com");
		
		//Enters the password
		POM.Password(driver).sendKeys("abudhabi15");
		
		//Clicks on Submit button
		POM.Submit(driver).click();
		
		
	}


}


