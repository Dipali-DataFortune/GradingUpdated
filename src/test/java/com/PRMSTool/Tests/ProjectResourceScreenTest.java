package com.PRMSTool.Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PRMSTool.Pages.LoginPage;
import com.PRMSTool.Pages.ProjectResourceScreenPage;
import com.PRMSTool.base.TestBase;
import com.PRMSTool.util.UtilityClass;

public class ProjectResourceScreenTest extends TestBase{
	
	public ProjectResourceScreenTest()
	{
		super();
	}
	
	@Test(priority = 0, enabled=true)
	public void verifyLogin()throws InterruptedException {
		LoginPage lp = PageFactory.initElements(driver,LoginPage.class);
		lp.login(prop.getProperty("email1"),prop.getProperty("password1"));
	}
	
	@Test(priority = 1, enabled=true)
	public void verifyclickOnProjectResource()throws InterruptedException {
		ProjectResourceScreenPage prs = PageFactory.initElements(driver, ProjectResourceScreenPage.class);
		prs.clickOnProjectResource();
	}
	
	@Test(priority = 2, enabled=true)
	public void verifyclickOnAddNew()throws InterruptedException {
		ProjectResourceScreenPage prs = PageFactory.initElements(driver, ProjectResourceScreenPage.class);
		prs.clickOnAddNew();
	}
		
	@Test(priority = 3, enabled=true)
	public void verifyaddProjectResourceDetails()throws InterruptedException {
		ProjectResourceScreenPage prs = PageFactory.initElements(driver, ProjectResourceScreenPage.class);
		prs.addProjectResourceDetails();
	}	
	
	@Test(priority = 4, enabled=true)
	public void verifyselectStartDate()throws InterruptedException {
		ProjectResourceScreenPage prs = PageFactory.initElements(driver, ProjectResourceScreenPage.class);
		prs.selectStartDate();
	}
	
	@Test(priority = 5, enabled=true)
	public void verifyselectEndDate()throws InterruptedException {
		ProjectResourceScreenPage prs = PageFactory.initElements(driver, ProjectResourceScreenPage.class);
		prs.selectEndDate();
	}
			
	@Test(priority = 6, enabled=true)
	public void verifyclickOnAdd()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.clickOnAdd();
	}
		
	@Test(priority = 7, enabled=true)
	public void verifysearch()throws InterruptedException {
		ProjectResourceScreenPage prs = PageFactory.initElements(driver, ProjectResourceScreenPage.class);
		prs.searchProjectResource("Test");
	}
	
	@Test(priority = 8, enabled=true)
	public void verifyclickOnEditButton()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.clickOnEditButton();
	}
	
	@Test(priority = 9, enabled=true)
	public void verifyeditResourceInformation()throws InterruptedException {
		ProjectResourceScreenPage prs = PageFactory.initElements(driver, ProjectResourceScreenPage.class);
		prs.editProjectResourceInformation();
	}
	
	@Test(priority = 10, enabled=true)
	public void verifyclickOnUpdateButton()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.clickOnUpdateButton();
	}
	
	@Test(priority = 11, enabled=true)
	public void verifydelete()throws InterruptedException {
		ProjectResourceScreenPage prs = PageFactory.initElements(driver, ProjectResourceScreenPage.class);
		prs.deleteProjectResource("Dipali");
	}
	
	@Test(priority = 12, enabled=true)
	public void verifydownloadFile()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.downloadFile();
	}
	
	@Test(priority = 13, enabled=true)
	public void verifydisplayAllStatusList()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.displayAllStatusList();
	}
	
	@Test(priority = 14, enabled=true)
	public void verifydisplayInactiveStatusList()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.displayInactiveStatusList();
	}
	
	@Test(priority = 15, enabled=true)
	public void verifydisplayActiveStatusList()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.displayActiveStatusList();
	}
	
	@Test(priority = 17, enabled=true)
	public void verifyselectBusinessUnitAll()throws InterruptedException {
		ProjectResourceScreenPage prs = PageFactory.initElements(driver, ProjectResourceScreenPage.class);
		prs.selectBusinessUnitAll();
	}
	
	@Test(priority = 16, enabled=true)
	public void verifyselectBusinessUnitVResource()throws InterruptedException {
		ProjectResourceScreenPage prs = PageFactory.initElements(driver, ProjectResourceScreenPage.class);
		prs.selectBusinessUnitVResource();
	}
	
	@Test(priority = 18, enabled=true)
	public void verifyselectBusinessUnitRow()throws InterruptedException {
		ProjectResourceScreenPage prs = PageFactory.initElements(driver, ProjectResourceScreenPage.class);
		prs.selectBusinessUnitRow();
	}
	
	@Test(priority = 19, enabled=true)
	public void verifyselectBusinessUnitPractices()throws InterruptedException {
		ProjectResourceScreenPage prs = PageFactory.initElements(driver, ProjectResourceScreenPage.class);
		prs.selectBusinessUnitPractices();
	}
	
	@Test(priority = 20, enabled=true)
	public void verifyselectBusinessUnitLicence()throws InterruptedException {
		ProjectResourceScreenPage prs = PageFactory.initElements(driver, ProjectResourceScreenPage.class);
		prs.selectBusinessUnitLicence();
	}
	
	@Test(priority = 21, enabled=true)
	public void verifyselectBusinessUnitOthers()throws InterruptedException {
		ProjectResourceScreenPage prs = PageFactory.initElements(driver, ProjectResourceScreenPage.class);
		prs.selectBusinessUnitOthers();
	}
}
