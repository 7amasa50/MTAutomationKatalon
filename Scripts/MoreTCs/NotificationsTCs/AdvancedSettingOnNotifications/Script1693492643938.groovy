import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('E:\\Projects\\MTAutomationKatalon\\apk\\MT 4.5.apk', false)
//Click on Skip Ad Manually
if (Mobile.verifyElementVisible(findTestObject('Object Repository/OnboardingElements/TestAdText'), 5, FailureHandling.OPTIONAL)) {
	Mobile.delay(5)
}
if (Mobile.verifyElementVisible(findTestObject('Object Repository/HomeElements/GotItOnSwipeButton'), 5, FailureHandling.OPTIONAL)) {
	if (Mobile.verifyElementVisible(findTestObject('Object Repository/HomeElements/DoNotShowThisDialogAgainCheckBox'), 3, FailureHandling.OPTIONAL)) {
		Mobile.tap(findTestObject('Object Repository/HomeElements/DoNotShowThisDialogAgainCheckBox'), 3)
	}
	Mobile.tap(findTestObject('Object Repository/HomeElements/GotItOnSwipeButton'), 5)
}
Mobile.tap(findTestObject('Object Repository/HomeElements/MoreButton'), 5)


Mobile.tap(findTestObject('Object Repository/MoreElements/NotificationButtonOnMore'), 5)

Mobile.tap(findTestObject('Object Repository/MoreElements/NotificationsElements/NotificationItSelf'), 5)

Mobile.tap(findTestObject('Object Repository/MoreElements/NotificationsElements/AdvancedSettings'), 5)
Mobile.tap(findTestObject('Object Repository/MoreElements/NotificationsElements/AddImageOnNotificationTrigger'), 5)
Mobile.verifyElementVisible(findTestObject('Object Repository/MoreElements/NotificationsElements/SendTestNotification'), 0)
Mobile.tap(findTestObject('Object Repository/MoreElements/NotificationsElements/SendTestNotification'), 0)

Mobile.openNotifications()
if(Mobile.verifyElementNotVisible(findTestObject('Object Repository/MoreElements/NotificationsElements/MotivationTestNotification'), 0))
{
'Get Device Height and Store in device_height variable' 
device_Height = Mobile.getDeviceHeight()

'Get Width Height and Store in device_Width variable'
device_Width = Mobile.getDeviceWidth()

'Storing the startX value by dividing device width by 2. Because x coordinates are constant for Vertical Swiping'
int startX = device_Width / 2
 
'Here startX and endX values are equal for vertical Swiping for that assigning startX value to endX' 
int endX = startX

'Storing the startY value'
int startY = device_Height * 0.30
 
'Storing the endY value'
int endY = device_Height * 0.70
 
'Swipe Vertical from top to bottom'
Mobile.swipe(startX, endY, endX, startY)
}
Mobile.verifyElementVisible(findTestObject('Object Repository/MoreElements/NotificationsElements/MotivationTestNotification'), 0)
Mobile.closeNotifications()

Mobile.tap(findTestObject('Object Repository/MoreElements/NotificationsElements/YourQuotesChecked'), 5)
if(Mobile.verifyElementVisible(findTestObject('Object Repository/MoreElements/NotificationsElements/Add your own quote'), 5,FailureHandling.OPTIONAL))
{
	Mobile.tap(findTestObject('Object Repository/MoreElements/NotificationsElements/Add your own quote'), 0)
	Mobile.sendKeys(findTestObject('Object Repository/CategoriesElements/AddQuoteElements/TypeYourOwnQuoteText'), GlobalVariable.Quote)
		
		
	Mobile.sendKeys(findTestObject('Object Repository/CategoriesElements/AddQuoteElements/Author'), GlobalVariable.Author)
		
		
	Mobile.tap(findTestObject('Object Repository/CategoriesElements/AddQuoteElements/ChooseCategoryButtonWhenAddingQuote'), 0)
		
	Mobile.sendKeys(findTestObject('Object Repository/CategoriesElements/AddQuoteElements/SearchCategoriesWhenAddingQuote'), 'Ability')
	Mobile.hideKeyboard()
	Mobile.tap(findTestObject('Object Repository/CategoriesElements/AddQuoteElements/FirstResultWhenSearchCategoryForAddingQuote'), 0)
	
	Mobile.tap(findTestObject('Object Repository/CategoriesElements/AddQuoteElements/SaveButtonWhenChossingCategory'), 0)
	
	Mobile.tap(findTestObject('Object Repository/CategoriesElements/AddQuoteElements/SaveButtonWhenAddingQuote'), 0)
	
	Mobile.verifyElementVisible(findTestObject('Object Repository/CategoriesElements/AddQuoteElements/QuoteCreatedLabel'), 0)
	Mobile.tap(findTestObject('Object Repository/MoreElements/NotificationsElements/YourQuotesChecked'), 5)
	
		
}
Mobile.tap(findTestObject('Object Repository/MoreElements/NotificationsElements/FavoriteQuotesChecked'), 5)


