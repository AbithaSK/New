package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods{

	public FindLeadsPage(RemoteWebDriver driver, ExtentTest test) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
			private WebElement eleFirstName;	
			public FindLeadsPage enterfirstName(String fName2) {
				type(eleFirstName, fName2);
				return this;

}
			@FindBy(how=How.XPATH,using="//button[contains(text(),'Find Leads')]")
			private WebElement eleFindLeadsbtn;
			public FindLeadsPage clickfindLeadbtn(){
				click(eleFindLeadsbtn);
				return this;
			}
			
			@FindBy(how=How.XPATH,using="(//a[@class='linktext'])[4]")
			private WebElement eleFirstResultingLead;
			public ViewLeadPage clickfirstResultingLd(){
				click(eleFirstResultingLead);
				return new ViewLeadPage(driver, test);
			}
			@FindBy(how=How.XPATH,using="//span[contains(text(),'Phone')]")
			private WebElement eleclickPhone;
			public FindLeadsPage clickPhone(){
				click(eleclickPhone);
				return this;
			}
			
			@FindBy(how=How.NAME,using="phoneNumber")
			private WebElement elePhoneNumber;	
			public FindLeadsPage enterphoneNumber(String PhoneNum) {
				type(elePhoneNumber, PhoneNum);
				return this;
			}
			
			@FindBy(how=How.XPATH,using="//button[contains(text(),'Find Leads')]")
			private WebElement eleFindLeadbtn;
			public FindLeadsPage clickfindLeadbtn1(){
				click(eleFindLeadbtn);
				return this;	
}
			//Capture lead ID of First Resulting lead
			/*text=getText(locateElement("xpath","(//a[@class='linktext'])[4]"));*/
			
			@FindBy(how=How.XPATH,using="(//a[@class='linktext'])[4]")
			private WebElement eleFirstResultingLD;
			public ViewLeadPage clickfirstResultingLd1(){
				click(eleFirstResultingLD);
				return new ViewLeadPage(driver,test);		
}
}