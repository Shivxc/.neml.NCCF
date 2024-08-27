package Pages;

import org.openqa.selenium.By;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import nccf_utils.base;


public class loginpage extends base{
	WebDriver driver;
	nccf_utils.ui ui;
	WebDriverWait wt;

	public loginpage(WebDriver driver) {
		this.driver = driver;
		ui = new nccf_utils.ui(driver);
		wt = new WebDriverWait(driver, Duration.ofSeconds(15));
	}

	By e_user = By.xpath("//input[@placeholder=\"User Id\"]");
	By e_pwd = By.xpath("//input[@placeholder=\"Password\"]");
	By e_login = By.xpath("//button[@class=\"button_go\"]");
    String actualTitle = "Unified Procurement";
    		
	public void doLogin(String user, String pwd) {
		ui.type(e_user, user);
		ui.type(e_pwd, pwd);

		wt.until(ExpectedConditions.elementToBeClickable(e_login)).click();
	
		String url = driver.getCurrentUrl();
		
		if(url.equals("https://nccf.neml.xyz/InventoryWeb/views/index.html#/home")) {
			System.out.println("user logged in");
			
		}else {
			ui.type(e_pwd, pwd);

			wt.until(ExpectedConditions.elementToBeClickable(e_login)).click();
		
			
		}
	}

}