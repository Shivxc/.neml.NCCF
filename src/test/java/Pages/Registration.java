package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import nccf_utils.base;
import nccf_utils.ui;

public class Registration extends base {
	WebDriver driver;
	ui ui;
	WebDriverWait wt;

	public Registration(WebDriver driver) {
		this.driver = driver;
		ui = new nccf_utils.ui(driver);
		wt = new WebDriverWait(driver, Duration.ofSeconds(15));
	}

	public void FamReg() throws InterruptedException {
		ui.click(By.linkText("REGISTRATION"));
		ui.click(By.xpath("//*[@id=\"header\"]/header/div[2]/div[1]/nav/ul/li[5]/div/div/ul/li[1]/a[2]/span"));
		By centercode = By.xpath("//select[@data-ng-model=\"farmerDtls.marketCode\"]");
		Select select = new Select(driver.findElement(centercode));
		select.selectByVisibleText("SMPF - SM NCCF PSF CENTER");

		By regType = By.xpath("//select[@data-ng-options=\"i.value as i.description for i in registrationTypeList\"]");
		Select select1 = new Select(driver.findElement(regType));
		select1.selectByVisibleText("FARMER");

		ui.type(By.xpath("//input[@placeholder=\"Enter Farmer/Trader Name\"]"), "automationFarmer");
		ui.type(By.xpath("//*[@id=\"H_Farmer_DetailsShowHide\"]/div[1]/div[3]/input"), "9503571561");

		By cast = By.xpath("//*[@id=\"H_Farmer_DetailsShowHide\"]/div[2]/div[1]/select");
		Select select2 = new Select(driver.findElement(cast));
		select2.selectByVisibleText("Other Backward Classes");

		By ID = By.xpath(
				"//select[@data-ng-change=\"changeDiv();farmerBasicModified();enableAadharQR(farmerDtls.docType);\"]");
		Select select3 = new Select(driver.findElement(ID));
		select3.selectByVisibleText("Voter ID");

		ui.type(By.xpath("//*[@id=\"H_Farmer_DetailsShowHide\"]/div[2]/div[3]/input"), "mock12345678");

		By gender = By.xpath("//select[@data-ng-model=\"farmerDtls.gender\"]");
		Select select4 = new Select(driver.findElement(gender));
		select4.selectByVisibleText("Male");

		ui.type(By.xpath("//input[@data-ng-model=\"farmerDtls.age\"]"), "35");
		ui.type(By.xpath("//input[@data-ng-model=\"farmerDtls.pincode\"]"), "400042");

		By district = By.xpath("//select[@data-ng-init=\"farmerDtls.districtCode\"]");
		Select select5 = new Select(driver.findElement(district));
		select5.selectByVisibleText("MUMBAI");

		By taluka = By.xpath("//select[@data-ng-model=\"farmerDtls.talukaCode\"]");
		Select select6 = new Select(driver.findElement(taluka));
		select6.selectByVisibleText("BANDRA");

		ui.type(By.xpath("//input[@data-ng-model=\"farmerDtls.village\"]"), "Mock");
		ui.type(By.xpath("//textarea[@data-ng-model=\"farmerDtls.address\"]"), "MockAdd");

		WebElement fileInput = driver.findElement(By.id("logo"));
		fileInput.sendKeys("C:\\Users\\neml10574\\eclipse-workspace\\NCCF\\src\\test\\resources\\properties\\demo");

		WebElement land = driver.findElement(By.id("logoLand"));
		land.sendKeys("C:\\Users\\neml10574\\eclipse-workspace\\NCCF\\src\\test\\resources\\properties\\demo");

		WebElement save = driver
				.findElement(By.xpath("//button[@sglclick=\"saveFarmerNew();clientSideValidation();\"]"));
		Actions ac = new Actions(driver);
		ac.moveToElement(save);

		ui.type(By.xpath("//input[@placeholder=\"Account Holder Name\"]"), "mockUser");
		ui.type(By.xpath("//input[@placeholder=\"Enter Bank Account No.\"]"), "123456789");

		ui.type(By.xpath("//input[@placeholder=\"IFSC Code\"]"), "SBIN0000012");
		ui.click(By.className("refreshbtnsmall"));

		WebElement doc = driver.findElement(By.xpath("//input[@ng-file-model=\"bankPassbook.file\"]"));
		doc.sendKeys(
				"C:\\\\Users\\\\neml10574\\\\eclipse-workspace\\\\NCCF\\\\src\\\\test\\\\resources\\\\properties\\\\demo");

		ui.click(By.xpath("//button[@sglclick=\"saveFarmerNew();clientSideValidation();\"]"));
		
		Thread.sleep(1000);
	

		Actions ac1 = new Actions(driver);
		ac1.sendKeys(Keys.PAGE_UP);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
}
