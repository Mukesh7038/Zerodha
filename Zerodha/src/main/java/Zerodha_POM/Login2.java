package Zerodha_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login2 {
	
	@FindBy (xpath="//input[@id='pin']") private WebElement PIN;
	
	@FindBy (xpath="//button[@type='submit']") private WebElement ContinueButton;
	
	public Login2 (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
     
	public void enterPIN() {
		
		PIN.sendKeys("7654321");
	}
	
	public void clickcontinueButton() {
		
		ContinueButton.click();
	}
	
	
}
