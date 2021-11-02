package com.technocredits.orghrm.pages;
import org.openqa.selenium.By;

import com.technocredits.orghrm.base.PredefinedActions;

public class DashboardPage extends PredefinedActions{
	
	public String getPageHeaderTitle() {
		return driver.getTitle();
	}
	
	public String getPageTitle() {
		return driver.findElement(By.xpath("//li[@class='page-title']")).getText();
	}

}
