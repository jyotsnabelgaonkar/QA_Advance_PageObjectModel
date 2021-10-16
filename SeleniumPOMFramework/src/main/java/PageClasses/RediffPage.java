package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseClasses.PageBaseClass;
import baseClasses.TopMenuClass;

public class RediffPage extends PageBaseClass{

	public TopMenuClass topmenu;

	public RediffPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		topmenu = new TopMenuClass(driver, logger);
		PageFactory.initElements(driver, topmenu);
	}
	
	@FindBy(xpath = "//a[contains(text(),'Rediffmail')]")
	public WebElement rediffmailLink;
	
	

	public RediffmailLoginPage rediffmailLoginPage() {
		logger.log(Status.INFO, "Clicking the Money Link, Present in Header");
		rediffmailLink.click();
		logger.log(Status.PASS, "Clicked the Money Link");
		RediffmailLoginPage rediffmailloginPage = new RediffmailLoginPage(driver, logger);
		PageFactory.initElements(driver, rediffmailloginPage);
		return rediffmailloginPage;
	}
}
