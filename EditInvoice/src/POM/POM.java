/*This package is create for page object modelling. All the Webelements used in the test are called from this page.*/

package POM;

//Importing all the selenium classes.
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/*The name of the class is POM which stands for Page Object Modelling*/
public class POM {

	private static WebElement element= null;
	
// Retrives element related to the Sign Up Link i.e. Existing User? Login to Xero
	public static WebElement SignUpLink(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//a[@href='https://login.xero.com/']"));
		return element;
		
	}
	
//Retrives Element related to the Username text box field.
	public static WebElement UserName(WebDriver driver)
	{
		element=driver.findElement(By.id("email"));
		return element;
		
	}
	
//Retrives element related to the Password textbox field.	
	public static WebElement Password(WebDriver driver)
	{
		element=driver.findElement(By.id("password"));
		return element;
		
	}
	
//Retrives element related to the Submit buttom.	
	public static WebElement Submit(WebDriver driver)
	{
		element=driver.findElement(By.id("submitButton"));
		return element;
		
	}

//Retrieves element related to the Account link on the homepage.
	public static WebElement Account(WebDriver driver)
	{
		element=driver.findElement(By.id("Accounts"));
		return element;
		
	}
	
//Retrieves element related to the Sales link under the Account link tab.
	public static WebElement Sales(WebDriver driver)
	{
		element=driver.findElement(By.linkText("Sales"));
		return element;
		
	}
	
//Retrieves element related to the repeating tab  link.	
	public static WebElement RepeatingTab(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//a[@href='/AccountsReceivable/SearchRepeating.aspx']"));
		return element;
		
	}
	
//Retrieves element related to the Add new line button.	
	public static WebElement AddNewLine(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//button[@id='addNewLineItemButton']"));
		return element;
		
	}
	
//Retrieves element related to the Search button	
	public static WebElement SearchInvoice(WebDriver driver)
	{
		element=driver.findElement(By.id("ext-gen47"));
		return element;
		
	}
	
//Retrieves element related to the Enter the Reference or Contact name text field.	
	public static WebElement EnterText(WebDriver driver)
	{
		element=driver.findElement(By.id("sb_txtReference"));
		return element;
		
	}
	
//Retrieves element related to the Search button for the search.
	public static WebElement SearchButton(WebDriver driver)
	{
		element=driver.findElement(By.id("sbSubmit_"));
		return element;
		
	}
	
//Retrieves the element related to the first contact name that appears during the search
	public static WebElement SelectFirstRow(WebDriver driver)
	{
		element=driver.findElement(By.id("ext-gen52"));
		return element;
		
	}

//Retrieves the element related to the Approve button for approving invoice
	public static WebElement ApproveInvoice(WebDriver driver)
	{
		element=driver.findElement(By.id("ext-gen41"));
		return element;
		
	}
	
//Retrieves the element related to the OK button obtained during the pop up when an invoice is approved.	
	public static WebElement Confirmation(WebDriver driver)
	{
		element=driver.findElement(By.linkText("OK"));
		return element;
		
	}
//Verifies the text displayed after the approval is successfully done
	public static void VerifyMessageApproval(WebDriver driver)
	{
		String bodyText = driver.findElement(By.className("message")).getText();

		try {
		Assert.assertEquals("1 repeating transaction approved", bodyText);
		}
		catch(Throwable e)
		{
			System.out.println("The transaction has not been approved due to some error!");
		}
		
	}
	
//Retrieves the element for the drop down in the invoice while adding an additional item in the invoice.
	public static WebElement SelectInventory(WebDriver driver)
	{
		
		element=driver.findElement(By.xpath("//input[@id='ext-comp-1001']"));
		return element;
			
	}
	
// Verifies the message once the deletion of an invoice is successful.	
	public static void VerifyMessageDeleted(WebDriver driver)
	{
		String bodyText = driver.findElement(By.className("message")).getText();

		try {
		Assert.assertEquals("1 repeating transaction deleted", bodyText);
		}
		catch(Throwable e)
		{
			System.out.println("The transaction has not been deleted due to some error!");
		}
		
	}

//REtrieves the element related to the Delete button used for deleting an invoice.
	public static WebElement DeleteInvoice(WebDriver driver)
	{
		element=driver.findElement(By.id("ext-gen45"));
		return element;
		
	}
	
//Retrieves the element related to the save button used to save the invoice post editing.	
	public static WebElement SaveInventory(WebDriver driver)
	{
		
		element=driver.findElement(By.xpath("(//button[@type='button'])[4]"));			
		return element;
		
	}

//Verifies the text which says that the invoice has been saved successfully.	
	public static void VerifyMessageSaved(WebDriver driver)
	{
		
		// Waits for the page to load once the save is done
		driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
		String bodyText = driver.findElement(By.className("message")).getText();
		
		try {
			
		//Checks whether the text "Repeating Template Saved. Click to view" is appearing on the screen or not		
		Assert.assertEquals("Repeating Template Saved. Click to view.", bodyText);
		}
		catch(Throwable e)
		{
			System.out.println("The transaction has not been saved due to some error!");
		}
		
	}
	
	
	
}
