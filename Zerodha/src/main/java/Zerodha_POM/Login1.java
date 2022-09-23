package Zerodha_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login1 {
	
	//Step 1 Declare Variable globally (Data member)
	
	@FindBy (xpath = "//input[@type='text']") private WebElement Username;
	@FindBy (xpath="//input[@type='password']") private WebElement Password;
	@FindBy (xpath="//button[@type='submit']") private WebElement LoginButton;
	
	// Step 2 Initialization Global Data members
	
	public Login1(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
    // Step 3 method creation
	public void enterUN() {
		
		Username.sendKeys("OKP335");
	}
	public void enterPWD() {
		
		Password.sendKeys("WSX12345");
	}
	public void clickbutton() {
		
		LoginButton.click();
	}
}
