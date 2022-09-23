package Zerodha_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy (xpath="//a[@href='/logout']")private WebElement LogoutButton;
	@FindBy (xpath="//span[text()='OKP335']") private WebElement Profilename;
	@FindBy (xpath="//a[@href='/dashboard']")private WebElement Dashboard;
	@FindBy (xpath="//a[@href='/orders']")private WebElement Orders;
	@FindBy (xpath="//a[@href='/holdings']")private WebElement Holdings;
	@FindBy (xpath="//a[@href='/positions']")private WebElement Positions;
	@FindBy (xpath="//a[@href='/funds']")private WebElement Funds;
	
	public HomePage (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public String Verify_profilename() {
		
		String x = Profilename.getText();
		return x;
	}
	public String Verify_dashboard() {
		
		String x = Dashboard.getText();
		return x;
	}
	public String Verify_orders() {
		String x =Orders.getText();
		System.out.println(x);
		return x;
	}
	public String Verify_holdings() {
		String x = Holdings.getText();
		return x;
	}
	public String Verify_positions() {
		
		String x= Positions.getText();
		return x;
	}
	public String Verify_funds() {
		
		String x=Funds.getText();
		return x;
	}

		
	
	public void Click_dashboard() {
		Dashboard.click();
	  
	}
	
	public void Click_order() {
		
		Orders.click();
	
	}
	public void Click_holdings() {
		Holdings.click();
		
	}
	public void Click_positions() {
		Positions.click();

	}
	public void Click_funds() {
		Funds.click();
	
	}
	public void Click_profilename() {
		Profilename.click();
	}
	public void Click_logout() {
		LogoutButton.click();
	}
	
}
