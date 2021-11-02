package com.technocredits.orghrm.testscripts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.technocredits.orghrm.pages.MenuPage;
import com.technocredits.orghrm.pages.PIM_AddEmployee;

public class PIM_AddEmployeeTest extends TestBase{

	private MenuPage menuPage;
	
	@BeforeMethod
	public void setUp() {
		menuPage = super.setup();
	}
	
	@Test
	public void verifyAddEmployeeTest() {
		System.out.println("Step: Navigate to Add Employee");
		menuPage.navigateTo("PIM->Add Employee");
		PIM_AddEmployee pim_AddEmployee = new PIM_AddEmployee();
		System.out.println("Step: Enter all the mandatory details and save the entry");
		pim_AddEmployee
			.setEmpFirstName("Eliza")
			.setEmpMiddleName("Mary")
			.setEmpLastName("Jems")
			.setEmployeeLocation("Australian Regional HQ")
			.clickOnNext()
			.setHobbies("Dancing")
			.clickOnNext()
			.setWorkShift("Twilight")
			.setEffectiveFrom("26")
			.setRegion("Region-1")
			.setFTE("0.5")
			.setTemporaryDepartment("Sub unit-2")
			.clickOnSave();
		Assert.assertTrue(pim_AddEmployee.successMessage());
		
	}
	
	@AfterMethod
	public void teardown() {
		super.teardown();
	}
}
