package com.classplusapp.mobile.tests;


import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import com.b2b.mobile.pages.base.B2BBaseMobileAutomationPage;
import com.b2b.mobile.tests.base.B2BBaseMobileAutomationTest;
import com.b2b.vo.B2BMobileConfigurationVO;


@Listeners(com.b2b.mobile.util.B2BBaseTestListener.class)

public class ClassplusBaseMobileAutomationTest extends B2BBaseMobileAutomationTest {

	private static final Logger log = Logger.getLogger(ClassplusBaseMobileAutomationTest.class);
	
	static String CODE = "learn";
	static String EMAIL = "gunjan@classplusappp.com";
	protected static String TUTOR_NUMBER= "9711153079";
	protected static String FACULTY_NUMBER= "7290085267";
	protected static String STUDENT_NUMBER= "9502247373";
	protected static String PARENT_NUMBER= "7675952597";
	protected static final String ORG_CODE = ((System.getProperty("wl_org_code")==null)) ? CODE :(System.getProperty("wl_org_code"));
	protected static final String emailAddress = ((System.getProperty("wl_email_address")==null)) ? EMAIL : System.getProperty("wl_email_address");
	protected static final String TUTOR_MOBILE =  ((System.getProperty("wl_email_address")==null)) ? TUTOR_NUMBER : System.getProperty("wl_tutor_mobile_number");
	protected static final String FACULTY_MOBILE =  ((System.getProperty("wl_faculty_mobile_number")==null)) ? FACULTY_NUMBER :  System.getProperty("wl_faculty_mobile_number");
	protected static String STUDENT_MOBILE =  ((System.getProperty("wl_student_mobile_number")==null)) ? STUDENT_NUMBER : System.getProperty("wl_student_mobile_number");
	protected static String PARENT_MOBILE =  ((System.getProperty("wl_parent_mobile_number")==null)) ? PARENT_NUMBER :  System.getProperty("wl_parent_mobile_number");
	

	@BeforeSuite(alwaysRun=true)
	@Parameters({ "language"})
	public void initAutomation(String language) {
		
		this.initApplication(language);
		
		log.debug("Site URL :{} ");
	}

}