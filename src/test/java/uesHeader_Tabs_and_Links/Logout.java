package uesHeader_Tabs_and_Links;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class Logout {
     
	By logout= By.xpath("//a[@class='toolLinks' and contains(text(),'Logout')]");
	
	
	public void do_logout(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame("navbar");
		driver.findElement(logout).click();	
	}
	
	

}
