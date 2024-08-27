package Pages;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import nccf_utils.ui;

public class lotEntry {
	WebDriver driver;
	ui ui;
	WebDriverWait wait;
	
	public lotEntry(WebDriver driver) {
		this.driver = driver;
		ui = new nccf_utils.ui(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
	}

	public void LotEntry() {
		ui.click(By.linkText("PROCUREMENT"));
		ui.click(By.xpath("//*[@id=\"header\"]/header/div[2]/div[1]/nav/ul/li[6]/div/div[1]/ul/li[1]/a[2]/span"));
		By centercode = By.xpath("//select[@data-ng-model=\"ppl.pplMarketCode\"]");
		Select select = new Select(driver.findElement(centercode));
		select.selectByVisibleText("SMPF - SM NCCF PSF CENTER");
		
		By commodity = By.xpath("//select[@data-ng-model=\"ppl.pplCommodityCode\"]");
		Select select1 = new Select(driver.findElement(commodity));
		select1.selectByVisibleText("TUR_PSS");
		
		ui.type(By.xpath("//input[@placeholder=\"Bags\"]"), "15");
		ui.type(By.xpath("//input[@placeholder=\"Quantity\"]"), "50");
		ui.type(By.xpath("//input[@placeholder=\"Bill No.\"]"), "157845");
		
		Properties prop = new Properties();
		ui.type(By.xpath("//input[@placeholder=\"Farmer/ Trader TAC Id\"]"), prop.getProperty("ID"));
		ui.click(By.className("fa fa-refresh"));
		
		ui.click(By.xpath("//button[@title=\"Submit\"]"));
		
	}
}
