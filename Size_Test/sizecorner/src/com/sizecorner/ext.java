package com.sizecorner;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ext {
	static WebDriver driver;
	public ExtentReports extent;
	public ExtentTest extentTest;
	
	

//	WebDriver driver = new SafariDriver(); 

	// Method to set up the browser and open the dummy website
	@BeforeClass
	public void BrowsersetUp() {

//          	System.setProperty("webdriver.chrome.driver", "\\Users\\Design\\eclipse-workspace\\samplenft\\chromedriver.exe");
//          	driver = new ChromeDriver();
//          	driver.get("https://www.lambdatest.com");
		driver = new SafariDriver();
		driver.manage().window().maximize();
	    driver.get("https://dev.sizecorner.com/");

	}

	@BeforeTest
	public void setExtent() {
		System.out.println("welcomegoogle");
		extent = new ExtentReports(System.getProperty("user.dir")+"test-output/sizecornerextent.html", true);
		extent.addSystemInfo("Host Name", "Rameshs-Mac-mini.local");
		extent.addSystemInfo("User Name", "ramesh");
		extent.addSystemInfo("Environment", "QA-Rolodx");
		
	}
	
	@AfterTest
	public void endReport() {
		extent.flush();
		extent.close();

	}

	
	
	public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException {
		String dateName = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/" + screenshotName + dateName + ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
		
	}

		@Test
		   public void tC1() throws InterruptedException, IOException {
		    extentTest = extent.startTest("tc1"); 
		    String title = driver. getTitle();
			System.out.println("Test Case 1");
			Assert.assertEquals(title, "RoloDX123");
//			    driver.get("https://rolodx.vercel.app/");
			    driver.manage().window().maximize();
			    Thread. sleep(2000);
		  
	}
//		   @Test
//		   public void tC2() throws InterruptedException, IOException {
//		      System.out.println("Test Case 2");
//			    driver.findElement(By.id("result-11")).click();
//			    Thread. sleep(5000);
//
//
//		   }

		@AfterMethod
		public  void tearDown(ITestResult result) throws IOException {
		 if (result.getStatus()==ITestResult.FAILURE) {
			 //To add name in extent report
			extentTest.log(LogStatus.FAIL,"TEST CASE FAILED IS" +result.getName());
			//to add error/exception in extent report
			extentTest.log(LogStatus.FAIL,"TEST CASE FAILED IS" +result.getThrowable());
		
			String screenshortPath = sizecorner_dev.getScreenshot(driver, result.getName());
			//to add screenshot in extent report
			extentTest.log(LogStatus.FAIL,extentTest.addScreenCapture(screenshortPath));
			//to add screen record video in extent report
//			extentTest.log(LogStatus.FAIL,extentTest.addScreencast(screenshortPath));
		 }
		 else if (result.getStatus()==ITestResult.SKIP) {
			 extentTest.log(LogStatus.SKIP, "TEST CASE SHIPPED IS" + result.getName());
		 }
		 else if (result.getStatus()==ITestResult.SUCCESS) {
			 extentTest.log(LogStatus.PASS, "TEST CASE PASSED IS" + result.getName());
		 }
		 
		 extent.endTest(extentTest);
//		 driver.quit();

		}
		
}
