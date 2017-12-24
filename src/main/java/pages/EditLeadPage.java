package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods {

	public EditLeadPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);	
	}
	@FindBy(how=How.CLASS_NAME,using="inputBox")
	private WebElement eleCompanyName;	
	public EditLeadPage enterCName(String cName2) {
		type(eleCompanyName, cName2);
		return this;
}
	@FindBy(how=How.CLASS_NAME,using="inputBox")
	private WebElement eleclickUpdatebtn;
	public ViewLeadPage clickUpdate() {
		click(eleclickUpdatebtn);
		return new ViewLeadPage(driver,test);
		}
	
}