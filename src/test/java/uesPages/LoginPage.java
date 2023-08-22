package uesPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {


	public void open_LoginPage(WebDriver driver) {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.unitedeservices.com"); //Open UeS url
		//boolean LoginLogo=driver.findElement(By.xpath("//legend[contains(text(),'Please Log In')]")).isDisplayed();
		//if(LoginLogo== true) System.out.println("--Please Log In--   displayed sucessfully");
		//else System.out.println("--Please Log In--   Not Displayed");


	}

	public void enter_username_password(WebDriver driver , String username, String password) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='U']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='P']")).sendKeys(password);
		
	}

	public void click_login_Button(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@id='login']")).click(); //Click login button
		
	}

}
