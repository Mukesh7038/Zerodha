package Zerodha_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

public class Base_Class {
	 WebDriver driver;
	 SoftAssert softassert = new SoftAssert();
	 
	public String Exp_dashboard_title="Dashboard / Kite";
	public String Exp_dashboard_url="https://kite.zerodha.com/dashboard";
	public String Exp_orders_title="Orders / Kite";
	public String Exp_orders_url="https://kite.zerodha.com/orders";
	public String Exp_holdings_title="Holdings / Kite";
	public String Exp_holdings_url="https://kite.zerodha.com/holdings";
	public String Exp_positions_title="Positions / Kite";
	public String Exp_positions_url="https://kite.zerodha.com/positions";
	public String Exp_funds_title="Funds / Kite";
	public String Exp_funds_url="https://kite.zerodha.com/funds";
	 
	@Parameters("browser")
	@BeforeClass 
	public void setup(String browser) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		FirefoxOptions opt1 = new FirefoxOptions();
		opt.addArguments("--disable-notifications");
		
		
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver(opt);
		}

		else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dell\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver(opt1);
		}
		else if(browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Dell\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	

	@AfterClass
	public void quit() {
		driver.quit();
	}
	
	
	

}
