package com.technocredits.orghrm.pages;

import org.openqa.selenium.By;

import com.technocredits.orghrm.base.PredefinedActions;

public class PIM_EmployeeList extends PredefinedActions{
	
	public PIM_EmployeeList clickOnFilter() {
		driver.findElement(By.xpath("//i[text()='ohrm_filter']")).click();
		return this;
	}
	
	public PIM_EmployeeList setEmpName(String empName) {
		driver.findElement(By.xpath("//input[@id='emp_search_mdl_employee_name_filter_value']")).clear();
		driver.findElement(By.xpath("//input[@id='emp_search_mdl_employee_name_filter_value']")).sendKeys(empName);
		driver.findElement(By.xpath("//input[@id='emp_search_mdl_employee_name_filter_value']")).click();
		return this;
	}

	public PIM_EmployeeList clickOnSearch() {
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		return this;
	}
}
