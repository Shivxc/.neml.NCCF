package Pages;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import nccf_utils.ui;

public class viewReg {
	WebDriver driver;
	ui ui;
	WebDriverWait wait;
	
	public viewReg(WebDriver driver) {
		this.driver = driver;
		ui = new nccf_utils.ui(driver);
		wait = new WebDriverWait(driver,Duration.ofSeconds(15)); 
		
	}

	public void ViewRegistration() {
		ui.click(By.xpath("//md-tab-item[@class=\"md-tab ng-scope ng-isolate-scope md-ink-ripple md-active\"]"));
		ui.click(By.xpath("//*[@id=\"tab-content-0\"]/div/md-content/div[1]/div[2]/div[3]/div/div/input"));
		ui.click(By.xpath("//button[@class=\"btn btn-sm btn-info ng-binding waves-effect\"]"));
		ui.click(By.xpath("//button[@data-ng-click=\"searchFarmer()\"]"));
		
		WebElement cellID = driver.findElement(By.xpath("//*[@id=\"1722268291945-0-uiGrid-0007-cell\"]/div/a"));
		String FarmerID = cellID.getText();
		System.out.println("Farmer created sucessfully with FarmerID as" + FarmerID);
		String ID = null ;
		Properties prop = new Properties();
		prop.setProperty(ID, FarmerID);
				
		ui.click(By.xpath("//div[@style=\"overflow: scroll;\"]"));
		Actions ac =new Actions(driver);
		ac.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		
	}
}
