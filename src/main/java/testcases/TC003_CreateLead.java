package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC003";
		testCaseName = "TC003_CreateLead";
		testDescription = "CreateLead";
		category= "Smoke";
		authors	="Abi";
		browserName ="chrome";
	
	}
	
	@Test(dataProvider="fetchData")
	public void createLead(String userName, String passWord,String firstName,String lastName, String companyName, String source) {
		
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCRMSFAlink()
		.clickLeadslink()
		.clickCreateLead()
		.enterfirstName(firstName)
	    .enterlastName(lastName)
	    .entercompanyName(companyName)
	    .selectSource(source)
	    .clickcreateleadbtn()
	    .verifyFirstName(firstName);
		
		
		//.clickLogout();
		
		
		
		
		
		
		
	}

}
