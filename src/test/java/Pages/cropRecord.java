package Pages;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import nccf_utils.base;

public class cropRecord extends base {
	nccf_utils.ui ui;

	public cropRecord(WebDriver driver) {
		this.driver = driver;
		ui = new nccf_utils.ui(driver);
		wt = new WebDriverWait(driver, Duration.ofSeconds(15));
	}

	public void cropRecordAdd() {

		ui.click(By.linkText("REGISTRATION"));
		ui.click(By.xpath("//*[@id=\"header\"]/header/div[2]/div[1]/nav/ul/li[5]/div/div/ul/li[2]/a[2]/span"));
		ui.click(By.xpath("//button[@class=\"addbtncss btntxtcss ng-binding\"]"));
		By centercode = By.xpath("//select[@data-ng-model=\"farmerCropModel.marketCode\"]");
		Select select = new Select(driver.findElement(centercode));
		select.selectByVisibleText("SMPF - SM NCCF PSF CENTER");

		By district = By.id("dist");
		Select select1 = new Select(driver.findElement(district));
		select1.selectByVisibleText("AHMED NAGAR");

		By taluka = By.id("talukaCode");
		Select select2 = new Select(driver.findElement(taluka));
		select2.selectByVisibleText("AHMEDANGAR");

		By commodity = By.id("commCode");
		Select select3 = new Select(driver.findElement(commodity));
		select3.selectByVisibleText("TUR_PSS");
		Properties prop = new Properties();
		By farmer = By.xpath("//input[@placeholder=\"Enter Farmer/Trader TAC Id\"]");
		ui.type(farmer, prop.getProperty("ID"));
		ui.click(By.className("fa fa-refresh"));

		ui.type(By.xpath("//input[@placeholder=\"Survey No.\"]"), "123456");

		WebElement cropRecord = driver.findElement(By.id("logo1"));
		cropRecord.sendKeys("C:\\Users\\neml10574\\eclipse-workspace\\NCCF\\src\\test\\resources\\properties\\demo");

		ui.click(By.xpath("//*[@id=\"content\"]/div/data/div[4]/div/div/div[3]/button[3]"));
	}
}