package com.technocredits.orghrm.testscripts;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.technocredits.orghrm.pages.MenuPage;
import com.technocredits.orghrm.pages.PIM_EmployeeList;

public class PIM_EmployeeListTest extends TestBase {
	
	private MenuPage menuPage;
	
	@BeforeMethod
	public void setUp() {
		menuPage = super.setup();
	}
	
	@Test
	public void verifyEmployeeList() {
		System.out.println("Step: Navigate to Employee List");
		menuPage.navigateTo("PIM->Employee List");
		PIM_EmployeeList pim_EmployeeList = new PIM_EmployeeList();
		System.out.println("Step: Search for the Employee");
		pim_EmployeeList.findEmpNameInSearch("Elizabeth S Mary ").clickOnSearch();
		Assert.assertTrue(pim_EmployeeList.isEmpDisplayed("Elizabeth S Mary "));
	}
	
}
