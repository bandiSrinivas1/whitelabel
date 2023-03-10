package com.classplusapp.mobile.pages;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeoutException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.b2b.mobile.pages.base.B2BBaseMobileAutomationPage;
import com.b2b.mobile.pages.base.B2BVisualComparisionPage;
import com.b2b.support.B2BPageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class ClassplusBaseMobileAutomationPage extends B2BBaseMobileAutomationPage{

	protected AppiumDriver<WebElement> driver = null;

	protected B2BVisualComparisionPage visualComparisionPage = null;

	public static final Logger logger = LogManager.getLogger(ClassplusBaseMobileAutomationPage.class);

	public ClassplusBaseMobileAutomationPage(AppiumDriver<WebElement> driver) {
		super(driver);
	}
	
	
}
