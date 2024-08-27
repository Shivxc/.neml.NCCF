package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import nccf_utils.ui;

public class viewLotEntry {
	
	WebDriver driver;
	ui ui;
	WebDriverWait wait;
	
	public viewLotEntry(WebDriver driver) {
		this.driver = driver;
		ui = new nccf_utils.ui(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
	}
	
	public void lotEntryView() {
		ui.click(By.xpath("//button[@title=\"Submit\"]"));
		
	}

}
