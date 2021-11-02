package com.technocredits.orghrm.testscripts;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.technocredits.orghrm.base.PredefinedActions;
import com.technocredits.orghrm.pages.DashboardPage;
import com.technocredits.orghrm.pages.LoginPage;

public class DashboardTest {

	SoftAssert softAsset = new SoftAssert();
	
	@BeforeMethod
	public void setup() {
		System.out.println("STEP - Launch OrgHrm Application");
		PredefinedActions.start();
		LoginPage loginPage = new LoginPage();
		loginPage.enterCredentials("Admin", "MfTTca5Z@4");
		System.out.println("Click on Login button");
		loginPage.clickOnLoginButton();
	}
	
	@Test
	public void verfiyDashBoardPage() {
		
		System.out.println("Step: VERFIY - Dashboard page title should be Dashboard");
		DashboardPage dashboardPage = new DashboardPage();
		String expectedDashboardPageHeaderTitle = "Dashboard";
		String actualDashboardPageHeaderTitle = dashboardPage.getPageHeaderTitle();
		System.out.println(actualDashboardPageHeaderTitle);
		softAsset.assertEquals(actualDashboardPageHeaderTitle, expectedDashboardPageHeaderTitle);
		
		String expectedDashboardPageTitle = "Dashboard";
		String actualDashboardPageTitle = dashboardPage.getPageTitle();
		System.out.println(actualDashboardPageTitle);
		softAsset.assertEquals(actualDashboardPageTitle, expectedDashboardPageTitle);
		softAsset.assertAll();
	}
	
	@AfterMethod
	public void teardown() {
		PredefinedActions.closeBrowser();
	}
	
}
