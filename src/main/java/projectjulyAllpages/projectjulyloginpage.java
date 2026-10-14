package projectjulyAllpages;

import org.openqa.selenium.By;

import projectjulybase.projectjulybaseC;

public class projectjulyloginpage extends projectjulybaseC
{

	public static   By inputEmail= By.name("email");
	public static   By inputpassword= By.name("pass");
	public static   By buttonogin= By.xpath("//div[@aria-label='Log in']");
	public static By errormessage= By.xpath("//span[contains(text(),'The password you')]");
			
			
		
	public static String Errormessage_login()
	{
		return  driver.findElement(errormessage).getText();
	}
	
	public static void Enteremail(String emailid)
	{
		driver.findElement(inputEmail).sendKeys(emailid);
	}
	
	public static void Enterpassword(String password)
	{
		driver.findElement(inputpassword).sendKeys(password);
	}
	
	
	public static void clickbutton() throws InterruptedException
	{
		driver.findElement(buttonogin).click();
		Thread.sleep(16000);
	}
	
}
