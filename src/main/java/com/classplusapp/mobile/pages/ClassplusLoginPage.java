package com.classplusapp.mobile.pages;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import com.b2b.mobile.pages.base.B2BBaseMobileAutomationPage;
import com.b2b.mobile.pages.base.B2BVisualComparisionPage;
import com.b2b.support.B2BFindBy;
import com.b2b.support.B2BPageFactory;
import io.appium.java_client.AppiumDriver;
import net.bytebuddy.implementation.bytecode.Duplication;

public class ClassplusLoginPage extends ClassplusBaseMobileAutomationPage {

	@B2BFindBy(xpath = "{tutorloginpage.btnnoneoftheabove.xpath}")
	private WebElement btnNoneOfTheAbove;
	
	@B2BFindBy(id = "{tutorloginpage.imginformation.id}")
	private WebElement imgInformation;

	@B2BFindBy(xpath = "{tutorloginpage.lblclpstaging.xpath}")
	private WebElement lblClpStaging;

	@B2BFindBy(xpath = "{tutorloginpage.lblloginorsignup.xpath}")
	private WebElement lblLoginOrSignUp;

	@B2BFindBy(xpath = "{tutorloginpage.lblverifynumber.xpath}")
	private WebElement lblVerifyNumber;

	@B2BFindBy(id = "{tutorloginpage.lblpopupdescription.id}")
	private WebElement lblPopUpDescription;

	@B2BFindBy(xpath = "{tutorloginpage.lblhometitle.xpath}")
	private WebElement lblHomeTitle;

	@B2BFindBy(id = "{tutorloginpage.txtmobilenumber.id}")
	private WebElement txtMobileNumber;

	@B2BFindBy(xpath = "{tutorloginpage.txtentermobilenumberfield.xpath}")
	private WebElement txtEnterMobileNumberField;

	@B2BFindBy(id = "{tutorloginpage.btnproceedsecurelybutton.id}")
	private WebElement btnProceedSecurelyButton;

	@B2BFindBy(id = "{tutorloginpage.txtotpfield.id}")
	private WebElement txtOTPField;

	@B2BFindBy(id = "{tutorloginpage.btnverifyotp.id}")
	private WebElement btnVerifyOTP;

	@B2BFindBy(id = "{tutorloginpage.btnchangeenvironment.id}")
	private WebElement btnChangeEnvironment;

	@B2BFindBy(xpath = "{tutorloginpage.rdopreprod.xpath}")
	private WebElement rdoPreprod;

	@B2BFindBy(xpath = "{tutorloginpage.rdobaseurl.xpath}")
	private WebElement rdoBaseURL;

	@B2BFindBy(xpath = "{tutorloginpage.rdocamsurl.xpath}")
	private WebElement rdoCAMSURL;

	@B2BFindBy(xpath = "{tutorloginpage.rdourl.xpath}")
	private WebElement rdoURL;

	@B2BFindBy(xpath = "{tutorloginpage.rdochatsocketurl.xpath}")
	private WebElement rdoChatSocketURL;

	@B2BFindBy(xpath = "{tutorloginpage.rdoamschatsocketurl.xpath}")
	private WebElement rdoAMSChatSocketURL;

	@B2BFindBy(id = "{tutorloginpage.btnsave.id}")
	private WebElement btnSave;

	@B2BFindBy(id = "{tutorloginpage.btncloseaddpopup.id}")
	private WebElement btnCloseAddPopUp;
	
	public WebElement scrollToElement = null;

	public ClassplusLoginPage(AppiumDriver<WebElement> driver) {
		super(driver);
		logger.info("Starting of TutorLoginPage method");

		B2BPageFactory.initElements(driver, this);
		visualComparisionPage = new B2BVisualComparisionPage(driver);

		logger.info("Ending of TutorLoginPage method");
	}

	private static final Logger logger = LogManager.getLogger(ClassplusLoginPage.class.getName());

	public void clickOnImgInfo() {
		logger.info("Starting of clickOnImgInfo method");

		//hardWait(2);
		findElement(imgInformation,MOBILE_ACTIONS.CLICK);
		this.imgInformation.click();

		logger.info("Ending of clickOnImgInfo method");
	}
		
	public void clickOnCloseButton() {
		logger.info("Starting of clickOnCloseButton method");

		hardWait(2);
		findElement(btnCloseAddPopUp, MOBILE_ACTIONS.CLICK);
		this.btnCloseAddPopUp.click();

		logger.info("Ending of clickOnCloseButton method");
	}
	
	public void clickOnChangeEnvironmentButton() {
		logger.info("Starting of clickOnChangeEnvironmentButton method");

		hardWait(2);
		this.btnChangeEnvironment.click();
		this.rdoPreprod.click();

		try {
			this.verticalScroll();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

		this.rdoBaseURL.click();
		this.rdoCAMSURL.click();

		try {
			this.verticalScroll();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

		this.rdoURL.click();
		this.rdoChatSocketURL.click();

		try {
			this.verticalScroll();
			this.verticalScroll();
			this.verticalScroll();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		this.btnSave.click();

		logger.info("Ending of clickOnChangeEnvironmentButton method");
	}
	
	public void clickOnNoneOfTheAbove() {
		logger.info("Starting of clickOnNoneOfTheAbove method");

		try {
		hardWait(2);
		findElement(btnNoneOfTheAbove, MOBILE_ACTIONS.CLICK);
		this.btnNoneOfTheAbove.click();
		}catch(Exception e) {
			
		}

		logger.info("Ending of clickOnNoneOfTheAbove method");
	}

	public void setMobileNumber(String mobilenumber) {
		logger.info("Starting of setMobileNumber method");

		hardWait(2);
		this.txtMobileNumber.click();
		findElement(txtEnterMobileNumberField, MOBILE_ACTIONS.VISIBILE);
		this.getElementIfVisible(driver, txtEnterMobileNumberField);
		this.txtMobileNumber.sendKeys(mobilenumber);
		this.btnProceedSecurelyButton.click();

		logger.info("Ending of setMobileNumber method");
	}

	public void setOTP(String otp) {
		logger.info("Starting of setOTP method");

		hardWait(2);
		findElement(txtOTPField, MOBILE_ACTIONS.VISIBILE);
		this.txtOTPField.sendKeys(otp);
		this.btnVerifyOTP.click();

		logger.info("Ending of setOTP method");
	}

	public String getLblClpStagingText() {
		logger.info("Starting of getLblClpStagingText method");
		logger.info("Ending of getLblClpStagingText method");

		return lblClpStaging.getText();
	}

	public String getLblLoginOrSignUpText() {
		logger.info("Starting of getLblLoginOrSignUpText method");
		
		findElement(lblLoginOrSignUp, MOBILE_ACTIONS.VISIBILE);
		
		logger.info("Ending of getLblLoginOrSignUpText method");

		return lblLoginOrSignUp.getText();
	}

	public String getLblVerifyNumberText() {
		logger.info("Starting of getLblVerifyNumberText method");
		logger.info("Ending of getLblVerifyNumberText method");

		return lblVerifyNumber.getText();
	}

	public String getLblPopUpDescriptionText() {
		logger.info("Starting of getLblPopUpDescriptionText method");
		
		hardWait(2);
		findElement(lblPopUpDescription, MOBILE_ACTIONS.VISIBILE);
		
		logger.info("Ending of getLblPopUpDescriptionText method");

		return lblPopUpDescription.getText();
	}

	public String getLblHomeTitleText() {
		logger.info("Starting of getLblHomeTitleText method");
		
		hardWait(2);
		
		logger.info("Ending of getLblHomeTitleText method");

		return lblHomeTitle.getText();
	}

	public void loginToClassplusUsingMobileNumber(String strMobileNumber, String strOTP) {
		logger.info("Starting of LoginToClassplusUsingMobileNumber method");

		try {
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			this.clickOnNoneOfTheAbove();
			this.clickOnImgInfo();
			this.clickOnChangeEnvironmentButton();
			this.clickOnNoneOfTheAbove();
			this.setMobileNumber(strMobileNumber);
			this.setOTP(strOTP);
			
		}catch(Exception e) {
			this.clickOnNoneOfTheAbove();
			this.clickOnImgInfo();
			this.clickOnChangeEnvironmentButton();
			this.clickOnNoneOfTheAbove();
			this.setMobileNumber(strMobileNumber);
			this.setOTP(strOTP);
		}
		logger.info("Ending of LoginToClassplusUsingMobileNumber method");
	}
	
}
