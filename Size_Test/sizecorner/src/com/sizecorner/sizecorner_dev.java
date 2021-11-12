package com.sizecorner;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sizecorner.sizecorner_dev;

//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class sizecorner_dev {

	static WebDriver driver;
	public ExtentReports extent;
	public ExtentTest extentTest;

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
		extent = new ExtentReports(System.getProperty("user.dir") + "test-output/sizecornerextent.html", true);
		extent.addSystemInfo("Host Name", "Rameshs-Mac-mini.local");
		extent.addSystemInfo("User Name", "ramesh");
		extent.addSystemInfo("Environment", "QA-Sizecorner");

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
		String destination = System.getProperty("user.dir") + "/Size_FailedTestsScreenshots/" + screenshotName
				+ dateName + ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;

	}
	
	@Test
	public void Camera() throws InterruptedException, IOException {

		extentTest = extent.startTest("Camera");
		// Test name: sizecorner_dev
		driver.findElement(By.cssSelector("#root > div > section > div > div.innerSection_categories > div:nth-child(1)")).click();
		Thread.sleep(5000);
		takeScreenshot("Camera");

		Thread.sleep(5000);
	}

	@Test
	public void Gallery() throws InterruptedException, IOException {
		extentTest = extent.startTest("Gallery");
		driver.findElement(By.cssSelector("#root > div > section > div > div.innerSection_categories > div:nth-child(2)")).click();
		Thread.sleep(5000);
		takeScreenshot("Gallery");
	}

	@Test
	public void ManualMeasurment() throws InterruptedException, IOException {
		extentTest = extent.startTest("ManualMeasurment");
		driver.findElement(By.cssSelector("#root > div > section > div > div.innerSection_categories > div:nth-child(3)")).click();
		Thread.sleep(5000);
		takeScreenshot("ManualMeasurment");

	}

	@Test
	public void LastPurchaseinOnline() throws InterruptedException, IOException {
		extentTest = extent.startTest("LastPurchaseinOnline");
		driver.findElement(By.cssSelector("#root > div > section > div > div.innerSection_categories > div:nth-child(4)")).click();
		takeScreenshot("LastPurchaseinOnline");
		Thread.sleep(5000);
	}

	@Test
	public void LastPurchaseinStore() throws InterruptedException, IOException {
		extentTest = extent.startTest("LastPurchaseinStore");
		driver.findElement(By.cssSelector("#root > div > section > div > div.innerSection_categories > div:nth-child(5)")).click();
		Thread.sleep(5000);
		takeScreenshot("LastPurchaseinStore");
	}

		

	


	


	@Test
	public void sizecornerdev1() throws IOException, InterruptedException {
		extentTest = extent.startTest("sizecornerdev1");

//		driver.findElement(By.cssSelector(".upperContentPurchaseOnline_cardArrow:nth-child(3) > img")).click();
//		driver.findElement(By.cssSelector(".upperContentPurchaseOnline_search > input")).click();
		driver.findElement(By.cssSelector(".innerSection_titleContainer")).click();
		Thread.sleep(5000);

		driver.findElement(By.cssSelector(".innerSection_categories > div:nth-child(4)")).click();
		Thread.sleep(5000);

		driver.findElement(By.cssSelector(".innerSection_categories > div:nth-child(3)")).click();
		Thread.sleep(5000);

		driver.findElement(By.cssSelector(".innerSection_categories > div:nth-child(2)")).click();
		Thread.sleep(5000);

		driver.findElement(By.cssSelector(".upperContentLeft_Gallery:nth-child(1) button")).click();
		Thread.sleep(5000);

		driver.findElement(By.id("price")).click();
		Thread.sleep(5000);

		driver.findElement(By.id("show")).click();
		Thread.sleep(5000);

		driver.findElement(By.cssSelector(".chooseContainer_content:nth-child(2)")).click();
		Thread.sleep(5000);

		driver.findElement(By.cssSelector(".chooseContainer_content:nth-child(2)")).click();
		Thread.sleep(5000);

		driver.findElement(By.cssSelector(
				".Box-sc-8h3cds-0:nth-child(3) > .Label-sc-oepk9l-0:nth-child(2) .Svg-sc-12lgb6u-0:nth-child(3)"))
				.click();

		driver.findElement(By.cssSelector(
				".Box-sc-8h3cds-0:nth-child(3) > .Label-sc-oepk9l-0:nth-child(2) .Svg-sc-12lgb6u-0:nth-child(2) > path"))
				.click();
		driver.findElement(By.cssSelector(
				".Box-sc-8h3cds-0:nth-child(3) > .Label-sc-oepk9l-0:nth-child(3) .Svg-sc-12lgb6u-0:nth-child(3)"))
				.click();

		driver.findElement(By.cssSelector(
				".Box-sc-8h3cds-0:nth-child(3) > .Label-sc-oepk9l-0:nth-child(3) .Svg-sc-12lgb6u-0:nth-child(2) > path"))
				.click();
		driver.findElement(By.cssSelector(
				".Box-sc-8h3cds-0:nth-child(5) > .Box-sc-8h3cds-0:nth-child(3) .Svg-sc-12lgb6u-0:nth-child(3)"))
				.click();
		driver.findElement(By.cssSelector(
				".Box-sc-8h3cds-0:nth-child(5) > .Box-sc-8h3cds-0:nth-child(3) .Svg-sc-12lgb6u-0:nth-child(2) > path"))
				.click();
		driver.findElement(By.linkText("+ More")).click();

		driver.findElement(By.cssSelector(
				".Box-sc-8h3cds-0:nth-child(7) > .Box-sc-8h3cds-0:nth-child(3) .Svg-sc-12lgb6u-0:nth-child(3)"))
				.click();
		driver.findElement(By.cssSelector(
				".Box-sc-8h3cds-0:nth-child(7) > .Box-sc-8h3cds-0:nth-child(3) .Svg-sc-12lgb6u-0:nth-child(2) > path"))
				.click();

		driver.findElement(By.cssSelector(".Box-sc-8h3cds-0:nth-child(7) > .Link-sc-16qjtx7-0")).click();

		driver.findElement(By.cssSelector(
				".Box-sc-8h3cds-0:nth-child(9) > .Box-sc-8h3cds-0:nth-child(3) .Svg-sc-12lgb6u-0:nth-child(3)"))
				.click();

		driver.findElement(By.cssSelector(
				".Box-sc-8h3cds-0:nth-child(9) > .Box-sc-8h3cds-0:nth-child(3) .Svg-sc-12lgb6u-0:nth-child(2) > path"))
				.click();
		driver.findElement(By.id("color")).click();
	}

	@AfterMethod
	public void tearDown(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			// To add name in extent report
			extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS -- " + result.getName());
			// to add error/exception in extent report
			extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS -- " + result.getThrowable());

			String screenshortPath = sizecorner_dev.getScreenshot(driver, result.getName());
			// to add screenshot in extent report
			extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screenshortPath));
			// to add screen record video in extent report
//		extentTest.log(LogStatus.FAIL,extentTest.addScreencast(screenshortPath));
		} else if (result.getStatus() == ITestResult.SKIP) {
			extentTest.log(LogStatus.SKIP, "TEST CASE SHIPPED IS -- " + result.getName());
			String screenshortPath = sizecorner_dev.getScreenshot(driver, result.getName());
			extentTest.log(LogStatus.SKIP, extentTest.addScreenCapture(screenshortPath));

		} else if (result.getStatus() == ITestResult.SUCCESS) {
			extentTest.log(LogStatus.PASS, "TEST CASE PASSED IS -- " + result.getName());
			String screenshortPath = sizecorner_dev.getScreenshot(driver, result.getName());
			extentTest.log(LogStatus.PASS, extentTest.addScreenCapture(screenshortPath));

		}

		extent.endTest(extentTest);
//	 driver.quit();

	}

//	public static void takeScreenshot(String fileName) throws IOException {
//		//1.Take screenshort  and store it as a file format;
//		File scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(scrfile, new File ("/Users/Design/eclipse-workspace/samplenft"+fileName+".jpg"));
//	}

	public void takeScreenshot(String fileName) throws IOException {
		// 1.Take screenshort and store it as a file format;
		File scrfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File screenshotName = new File("/Users/Design/eclipse-workspace/sizecorner/ss" + fileName + ".png");
		FileUtils.copyFile(scrfile, screenshotName);
		Reporter.log("<b><img src='" + screenshotName + "' height='400' width='400'/><br>");
	}

	@AfterClass
	public void afterClass() {
	}

	@AfterTest
	public void afterTest() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

	@BeforeSuite
	public void beforeSuite() {
	}

	@AfterSuite
	public void afterSuite() {
	}

}
