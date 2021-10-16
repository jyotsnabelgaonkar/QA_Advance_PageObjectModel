package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseClasses.PageBaseClass;
import baseClasses.TopMenuClass;

public class RediffMailPage extends PageBaseClass {

	public TopMenuClass topmenu;

	public RediffMailPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		topmenu = new TopMenuClass(driver, logger);
		PageFactory.initElements(driver, topmenu);
	}
	
	
	@FindBy(xpath="//b[contains(text(),'Write mail')]")
	public WebElement writemail;
	
	
	
	public RediffWritemailPage rediffwritemailPage() {
		logger.log(Status.INFO, "Clicking the Money Link, Present in Header");
		writemail.click();
		logger.log(Status.PASS, "Clicked the Money Link");
		RediffWritemailPage rediffwritemailPage = new RediffWritemailPage(driver, logger);
		PageFactory.initElements(driver, rediffwritemailPage);
		return rediffwritemailPage;
	}
}
