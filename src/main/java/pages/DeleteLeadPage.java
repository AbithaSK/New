package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class DeleteLeadPage extends ProjectMethods{

	public DeleteLeadPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;	
	public DeleteLeadPage enterfirstName(String fName) {
		type(eleFirstName, fName);
		return this;
	
	}
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;	
	public DeleteLeadPage enterlastName(String lName) {
		type(eleLastName, lName);
		return this;
	
	}
	@FindBy(how=How.CLASS_NAME,using="inputBox")
	private WebElement eleCompanyName;	
	public DeleteLeadPage entercompanyName(String cName) {
		type(eleCompanyName, cName);
		return this;
	}	
	@FindBy(how=How.ID,using="createLeadForm_dataSourceId")
	private WebElement eleSource;
	public DeleteLeadPage selectSource(String index){
		int number=Integer.parseInt(index);
		selectDropDownUsingIndex(eleSource,number);
		return this;
		
	}
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleCreateLeadBtn;
	public ViewLeadPage clickcreateleadbtn() {
		click(eleCreateLeadBtn);
		return new ViewLeadPage(driver, test);
	}
	
}
