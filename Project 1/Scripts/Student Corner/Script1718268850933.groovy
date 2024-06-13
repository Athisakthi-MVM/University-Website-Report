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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.andhrauniversity.edu.in/')

WebUI.click(findTestObject('Object Repository/Page_Andhra University  Visakhapatnam/span__navbar-toggler-icon fas fa-bars'))

WebUI.click(findTestObject('Object Repository/Page_Andhra University  Visakhapatnam/a_Student Corner'))

WebUI.click(findTestObject('Object Repository/Page_Andhra University  Visakhapatnam/a_Student Events'))

WebUI.click(findTestObject('Object Repository/Page_Andhra University  Academic Calendar/img'))

WebUI.click(findTestObject('Object Repository/Page_Andhra University  Academic Calendar/h4_Inauguration -  Andhra TECH League -2023'))

WebUI.click(findTestObject('Object Repository/Page_Andhra University  Visakhapatnam/a_Student Corner'))

WebUI.click(findTestObject('Object Repository/Page_Andhra University  Visakhapatnam/a_Students Affairs'))

WebUI.click(findTestObject('Object Repository/Page_Andhra University  Students Affairs/a_READ MORE'))

WebUI.click(findTestObject('Object Repository/Page_Andhra University  Students Affairs/button__navbar-toggler p-0 border-0'))

WebUI.click(findTestObject('Object Repository/Page_Andhra University  Students Affairs/a_Student Corner'))

WebUI.click(findTestObject('Object Repository/Page_Andhra University  Students Affairs/a_UG  PG Time-Tables'))

WebUI.closeBrowser()

