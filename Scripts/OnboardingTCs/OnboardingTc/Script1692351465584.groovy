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

if (Mobile.verifyElementVisible(findTestObject('Object Repository/OnboardingElements/TestAdText'), 5, FailureHandling.OPTIONAL)) {
	Mobile.delay(5)
}

Mobile.tap(findTestObject('Object Repository/OnboardingElements/FirstLetsStartButton'), 10)

Mobile.tap(findTestObject('Object Repository/OnboardingElements/Health'), 10)
Mobile.tap(findTestObject('Object Repository/OnboardingElements/Wealth'), 10)
Mobile.tap(findTestObject('Object Repository/OnboardingElements/Relationships'), 10)
Mobile.tap(findTestObject('Object Repository/OnboardingElements/Happiness'), 10)
Mobile.tap(findTestObject('Object Repository/OnboardingElements/StressAnxiety'), 10)

Mobile.tap(findTestObject('Object Repository/OnboardingElements/ContinueButton'), 10)

Mobile.tap(findTestObject('Object Repository/OnboardingElements/DecreaseTimerCounter-'), 10)
Mobile.tap(findTestObject('Object Repository/OnboardingElements/IncreaseTimerCounter'), 10)

Mobile.tap(findTestObject('Object Repository/OnboardingElements/DecreaseStartTime'), 10)
Mobile.tap(findTestObject('Object Repository/OnboardingElements/IncreaseStarTime'), 10)
Mobile.tap(findTestObject('Object Repository/OnboardingElements/StarTimeAM'), 10)
Mobile.tap(findTestObject('Object Repository/OnboardingElements/StarTimePM'), 10)


Mobile.tap(findTestObject('Object Repository/OnboardingElements/DecreaseEndTime'), 10)
Mobile.tap(findTestObject('Object Repository/OnboardingElements/IncreaseEndTime'), 10)
Mobile.tap(findTestObject('Object Repository/OnboardingElements/EndTimeAM'), 10)
Mobile.tap(findTestObject('Object Repository/OnboardingElements/EndTimePM'), 10)

Mobile.tap(findTestObject('Object Repository/OnboardingElements/ContinueButton'), 10)

if (Mobile.verifyElementVisible(findTestObject('Object Repository/OnboardingElements/AllowNotificationButton'), 0, FailureHandling.OPTIONAL)) {
	Mobile.tap(findTestObject('Object Repository/OnboardingElements/AllowNotificationButton'), 10)
}

Mobile.tap(findTestObject('Object Repository/OnboardingElements/SecondLetsStartButton'), 10)

Mobile.tap(findTestObject('Object Repository/OnboardingElements/SkipGuideButton'), 10)

Mobile.verifyElementVisible(findTestObject('Object Repository/HomeElements/CategoryLabel'), 0, FailureHandling.STOP_ON_FAILURE)