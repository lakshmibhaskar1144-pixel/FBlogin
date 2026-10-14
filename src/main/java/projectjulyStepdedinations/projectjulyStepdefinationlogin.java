package projectjulyStepdedinations;

import java.io.IOException;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import projectjulyAllpages.projectjulyloginpage;
import projectjulybase.projectjulybaseC;
import projectjulygeneric.projectjulygenericC;

public class projectjulyStepdefinationlogin extends projectjulyloginpage

{	
	@Given("user is on login  page")
	public static void  user_is_on_loginpage() throws IOException
	{
		browserInitzation();
		ExtentCucumberAdapter.addTestStepLog("launch the browser");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(projectjulygenericC.captureScreenShot(), "login page");
	}
	
	@When("user enter valid username {string}")
	public static void  user_enter_valid_username(String username) throws IOException
	{
		Enteremail(username);
		ExtentCucumberAdapter.addTestStepLog("entered the username   "+username);
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(projectjulygenericC.captureScreenShot(), "entered email");
	}
	
	@When("^user enters valid usernameM \"([^\"]*)\"$")
	public static void  userentersvalidusernameM(String username) throws IOException
	{
		Enteremail(username);
		ExtentCucumberAdapter.addTestStepLog("entered the username   "+username);
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(projectjulygenericC.captureScreenShot(), "entered email");
	}
	
	
	
	
	@And("user enter valid password {string}")
	public static void  user_entervalidpassword(String password) throws IOException
	{
		Enterpassword(password);
		ExtentCucumberAdapter.addTestStepLog("entered the username   "+password);
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(projectjulygenericC.captureScreenShot(), "entered password");
	}
	
	
	
	@And("^user enters valid passwordM \"([^\"]*)\"$")
	public static void  userentersvalidpasswordM (String password) throws IOException
	{
		Enterpassword(password);
		ExtentCucumberAdapter.addTestStepLog("entered the username   "+password);
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(projectjulygenericC.captureScreenShot(), "entered password");
	}
	@And("click on submit")
	public static void  click_on_submit() throws InterruptedException, IOException
	{
		clickbutton();
		ExtentCucumberAdapter.addTestStepLog("login button is clicked");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(projectjulygenericC.captureScreenShot(), "login button is clicked");
	}
	
	@Then("user should be able to see expected error message")
	public static void Validate_login_errormessage()
	{
		String exepctederror="The password you've entered is incorrect.";
		
		System.out.print(Errormessage_login()); 
		if(exepctederror.equals(Errormessage_login()))
		{
			System.out.print("pass"); 
		}
		else
		{
			System.out.print("fail"); 
		}
	}
	
}
