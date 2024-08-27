package nccf_Test;
import java.io.IOException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import Pages.Registration;
import Pages.cropRecord;
import Pages.loginpage;
import Pages.lotEntry;
import Pages.viewLotEntry;
import Pages.viewReg;
import nccf_utils.base;

public class nccf extends base {

	@Test(priority = 1)
	public void logintitletest() {
		driver.get(prop.getProperty("url"));
		Assert.assertEquals(driver.getTitle().contains("Unified Procurement"), true);
	}

	@Test(priority = 2)
	public void logintest() {
		loginpage lp = new loginpage(driver);
		lp.doLogin(prop.getProperty("society"), prop.getProperty("pass"));
	}

	@Test(priority = 3) 
	public void registration() throws InterruptedException {
		Registration reg = new Registration(driver);
		reg.FamReg();
	}

	/*
	 * * @Test(priority = 4) public void viewFarmer() { viewReg vr = new
	 * viewReg(driver); vr.ViewRegistration(); }
	 * 
	 * @Test(priority = 5) public void cropRecordAddition() { cropRecord cr = new
	 * cropRecord(driver); cr.cropRecordAdd(); }
	 * 
	 * @Test(priority = 6) public void LotEntry() { lotEntry le = new
	 * lotEntry(driver); le.LotEntry(); }
	 * 
	 * @Test(priority = 7) public void ViewLotEntry() { viewLotEntry vle = new
	 * viewLotEntry(driver); vle.lotEntryView(); }
	 */
}
