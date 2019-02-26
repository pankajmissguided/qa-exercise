package ccom.valtech.testMethods;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import com.valtech.pageObjects.AboutPage;
import com.valtech.pageObjects.HomePage;
import com.valtech.pageObjects.ServicesPage;
import com.valtech.pageObjects.WorkPage;
import com.valtech.testBase.TestBase;
import com.valtech.utils.Category;

/**
 * Test Script for Home Page Controls Verification
 * @author Pankaj Kumar
 *
 */
public class TC01_verifyHomePageMenuItems extends TestBase{
	
	HomePage homePage;
	ServicesPage servicesPage;
	WorkPage workPage;
	AboutPage aboutPage;
//	SerpPage serpPage;
	public TC01_verifyHomePageMenuItems() {
		
		super();
	}
	
	@BeforeSuite
	public void setUp() throws InterruptedException {
		try {
			// Creating an instance for Browser, Navigating to Url & Maximize the browser
			initialize();
			// Start Reporting - Extent Report
			report = new ExtentReports(System.getProperty("user.dir") + "\\ExtentReports.html");
			test = report.startTest("Home Page Controls verification");
			homePage = new HomePage(driver);
			 servicesPage = new ServicesPage(driver);
			 workPage = new WorkPage(driver);
			 aboutPage = new AboutPage(driver);
//			serpPage = new SerpPage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 
	@Test(enabled= false)
	public void TS01_verifyRecentBlogs(){
		 
		try {
			test.log(LogStatus.PASS, "------TS01_verify Recent Blogs--------");
			test.log(LogStatus.PASS, "Verify the Home Page Title - " + homePage.getTitle());
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
	}
	@Test(enabled =true)
	public void TS02_verifyServices(){
		 try {
			   test.log(LogStatus.PASS, "------TC02_Verify Services Page info --------");
				test.log(LogStatus.PASS, "Verify the Home Page Title - " + homePage.getTitle());
				test.log(LogStatus.PASS, "Click on Services Menu");
			    homePage.clickServiceMenu("Services");
			    test.log(LogStatus.PASS, "Verify the Service Header exits");
			    assertTrue(homePage.getHeaderName("Services"));
				
				
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
	}
	@Test(enabled =true)
	public void TS03_verifyWork(){
		 try {
			   test.log(LogStatus.PASS, "------TC03_Verify Work Page info --------");
				test.log(LogStatus.PASS, "Verify the Home Page Title - " + homePage.getTitle());
				test.log(LogStatus.PASS, "Click on Work Menu");
			    homePage.clickWorkMenu("Work");
			    test.log(LogStatus.PASS, "Verify the Work Header exits");
			    assertTrue(homePage.getHeaderName("Work"));
				
				
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
	}
	@Test(enabled =true)
	public void clickAboutMenu(){
		 try {
			   test.log(LogStatus.PASS, "------TC04_Verify About Page info --------");
				test.log(LogStatus.PASS, "Verify the Home Page Title - " + homePage.getTitle());
				test.log(LogStatus.PASS, "Click on About Menu");
			    homePage.clickAboutMenu("About");
			    test.log(LogStatus.PASS, "Verify the About Header exits");
			    assertTrue(homePage.getHeaderName("About"));
				
				
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
	}
	
	
	
	@AfterSuite
	public void closeBrowser() {
		try {
			Thread.sleep(1000);
			driver.close();
			report.endTest(test);
			report.flush();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
