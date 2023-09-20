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

Mobile.callTestCase(findTestCase('Test Cases/CategoriesTCs/AddNewCategory'), [:])

Mobile.sendKeys(findTestObject('Object Repository/CategoriesElements/SearchInCategories'),  GlobalVariable.CategoryName)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/CategoriesElements/CategoryNameAfterSeaching'), 0)



Mobile.tap(findTestObject('Object Repository/CategoriesElements/AddQuoteWhenCategoryEmptyButton'), 0)

Mobile.sendKeys(findTestObject('Object Repository/CategoriesElements/AddQuoteElements/TypeYourOwnQuoteText'), GlobalVariable.Quote)


Mobile.sendKeys(findTestObject('Object Repository/CategoriesElements/AddQuoteElements/Author'), GlobalVariable.Author)


Mobile.tap(findTestObject('Object Repository/CategoriesElements/AddQuoteElements/ChooseCategoryButtonWhenAddingQuote'), 0)

Mobile.sendKeys(findTestObject('Object Repository/CategoriesElements/AddQuoteElements/SearchCategoriesWhenAddingQuote'), GlobalVariable.CategoryName)
Mobile.hideKeyboard()
Mobile.tap(findTestObject('Object Repository/CategoriesElements/AddQuoteElements/FirstResultWhenSearchCategoryForAddingQuote'), 0)


//Mobile.tap(findTestObject('Object Repository/CategoriesElements/AddQuoteElements/FirstResultWhenSearchCategoryForAddingQuote'), 0)

Mobile.tap(findTestObject('Object Repository/CategoriesElements/AddQuoteElements/SaveButtonWhenChossingCategory'), 0)

Mobile.tap(findTestObject('Object Repository/CategoriesElements/AddQuoteElements/SaveButtonWhenAddingQuote'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/CategoriesElements/AddQuoteElements/QuoteCreatedLabel'), 0)


