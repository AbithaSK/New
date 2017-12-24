package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{

	public ViewLeadPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);	
	}

	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement elefirstNameVerified;
	public ViewLeadPage verifyFirstName(String expectedFirstName){
		verifyExactText(elefirstNameVerified, expectedFirstName);
		System.out.println("The first name is as expected:"+expectedFirstName);
		return this;
}
	/*@FindBy(how=How.ID,using="sectionHeaderTitle_leads")
	private WebElement eleverifyTitle;
	public ViewLeadPage verifyTitle(String expectedTitle){
		verifyTitle(expectedTitle);
		System.out.println("Title is verified:" +expectedTitle);
		return this;*/
		
		@FindBy(how=How.XPATH,using="//div[text()='View Lead']")
		private WebElement eletitleViewLead;
		public ViewLeadPage verifytitleViewLead(String expectedTitle){
			verifyTitle(expectedTitle);
			return this;
		
	}
	@FindBy(how=How.LINK_TEXT,using="Edit")
	private WebElement eleclickEdit;
	public EditLeadPage clickEditLink() {
		click(eleclickEdit);
		return new EditLeadPage(driver,test);
	}	
	
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement eleverifyCname;
	public ViewLeadPage verifyCname(String expectedText){
		verifyExactText(eleverifyCname,expectedText);
		return this;
	}
	@FindBy(how=How.LINK_TEXT,using="Delete")
	private WebElement eleclickDelete;
	public MyLeadsPage clickDeleteLink() {
		click(eleclickDelete);
		return new MyLeadsPage(driver,test);
}
}