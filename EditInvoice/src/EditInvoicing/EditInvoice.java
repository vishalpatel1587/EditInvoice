
/*********** This packages is used to search for an invoice for a customer entered by user, selecting the first invoice and approving
 the invoice. It also checks for the approval confirmation message.**************/

package EditInvoicing;

//Importing all the required classes

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import Login.Login;
import POM.POM;


// Class containing the main function
public class EditInvoice {

	//Main function call used for Editing the invoice.
	public static void main(String[] args) {
		try
		{
			WebDriver driver =  new FirefoxDriver();
		
			// waits for the firefox to load
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
			// Gets to the page mentioned below
			driver.get("https://www.xero.com/signup/");
			
			//Calls the Login function which logins to the site.
			Login.LoginScreen(driver);
			
			//Waits for the page to load
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			//Navigates to Account
			POM.Account(driver).click();
			
			//Navigates to Sales
			POM.Sales(driver).click();
			
			//Navigates to Repeating tab
			POM.RepeatingTab(driver).click();
			
			//Finds SAM's first invoice and opens it for editing
			driver.findElement(By.linkText("SAM")).click();
			
			//Adds a new line to SAM's bill for entering more inventory item.
			POM.AddNewLine(driver).click();
			
			//Adds Baklava to the new line and presses enter to populate all the required fields
			POM.SelectInventory(driver).sendKeys("Bakl");
			POM.SelectInventory(driver).sendKeys(Keys.RETURN);
			
			//Saves the edited invoice.
			POM.SaveInventory(driver).click();
			
		}
		catch(Throwable e)
		{
			System.out.println("Exception occured in the flow. try again!");
		}
				
		
	}

}
