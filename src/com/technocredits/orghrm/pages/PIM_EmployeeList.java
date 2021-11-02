package com.technocredits.orghrm.pages;

import org.openqa.selenium.By;

import com.technocredits.orghrm.base.PredefinedActions;

public class PIM_EmployeeList extends PredefinedActions{
	
	public PIM_EmployeeList findEmpNameInSearch(String empName) {
		driver.findElement(By.xpath("//input[@id='employee_name_quick_filter_employee_list_value']")).sendKeys("Elizabeth S Mary ");
		return this;
	}
	
	public PIM_EmployeeList clickOnSearch() {
		driver.findElement(By.xpath("//i[text()='ohrm_search']")).click();
		return this;
	}
	
	public boolean isEmpDisplayed(String empName) {
		return driver.findElement(By.xpath("//table[@id='employeeListTable']/tbody//td[text()='"+empName+"']")).isDisplayed();
		 
	}

	
}
