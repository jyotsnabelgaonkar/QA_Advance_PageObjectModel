package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseClasses.PageBaseClass;
import baseClasses.TopMenuClass;

public class RediffWritemailPage extends PageBaseClass{

	public TopMenuClass topmenu;

	public RediffWritemailPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		topmenu = new TopMenuClass(driver, logger);
		PageFactory.initElements(driver, topmenu);
	}
	
	@FindBy(xpath="//input[@id='TO_IDcmp2']")
	public WebElement writemailid_textbox;
	
	@FindBy(xpath="//body/div[4]/div[2]/div[2]/div[2]/div[2]/ul[2]/li[2]/div[1]/div[1]/div[1]/a[1]")
	public WebElement sendMailButton;
	
	
	
	public void enterRediffMalId(String rediffMailId){
		try {
			
			writemailid_textbox.sendKeys(rediffMailId);
			logger.log(Status.PASS, "Entered Portfolio Name : " + rediffMailId);
		} catch (Exception e) {
			reportFail(e.getMessage());
	}
}
	
		public void sendRediffMail(){
			try {
				sendMailButton.click();
				logger.log(Status.PASS, "Clicked the Add Stock Button");
			} catch (Exception e) {
				reportFail(e.getMessage());;
			}
  }
		
}
