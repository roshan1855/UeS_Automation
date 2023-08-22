package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import uesHeader_Tabs_and_Links.Logout;
import uesPages.LoginPage;



public class Login_Logout_Steps {
	
	WebDriver driver =null;
	LoginPage login;
	Logout logout;
	
	@Given("Browser is open")
	public void browser_is_open() {
		String systemPath=System.getProperty("user.dir");
		System.setProperty("WebDriver.Chrome.driver", systemPath+"/Drivers/chromedrive.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Given("User is on the UeS Login Page")
	public void user_is_on_the_ues_login_page() {
		login=new LoginPage();
		login.open_LoginPage(driver);
		
		System.out.println("User is on UeS Login Page");
	}

	@When("^User enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) {
		login=new LoginPage();
		login.enter_username_password(driver , username, password);
		System.out.println("User entered Username and Password");

	}

	@And("User clicks on login button")
	public void user_clicks_on_login_button() {
		login=new LoginPage();
		login.click_login_Button(driver);
		System.out.println("User clicked on the Login Button");
	}

	@Then("User should be navigated to the UeS Home Page")
	public void user_should_be_navigated_to_the_ues_home_page() {
		System.out.println("User is navigated to UeS Home Page");

	}

	@And("User clicks on logout button.")
	public void user_clicks_on_logout_button() { 
		logout= new Logout();
		logout.do_logout(driver);
		System.out.println("User clicked the Logout button");

	}

	@Then("User should be navigated back to UeS Login Page.")
	public void user_should_be_navigate_to_ues_login_page() {
        System.out.println("User Logged out Succesfully");
	}

}
