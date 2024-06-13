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

WebUI.click(findTestObject('Object Repository/Page_Andhra University  Visakhapatnam/a_Academics'))

WebUI.click(findTestObject('Object Repository/Page_Andhra University  Visakhapatnam/a_A.U Trans-Disciplinary Hub'))

WebUI.click(findTestObject('Object Repository/Page_Andhra University  Trans- Disciplinary_35d469/a_Research Review Meeting (RRM) - July 2023 Result'))

WebUI.click(findTestObject('Object Repository/Page_Andhra University  Trans- Disciplinary_35d469/img'))

WebUI.click(findTestObject('Object Repository/Page_Andhra University  Trans- Disciplinary_35d469/b_On successful completion of the Doctoral _680601'))

WebUI.click(findTestObject('Object Repository/Page_Andhra University  Trans- Disciplinary_35d469/span__fas fa-bars'))

WebUI.click(findTestObject('Object Repository/Page_Andhra University  Trans- Disciplinary_35d469/section_Name  Prof. M. James Stephen       _acda29'))

WebUI.click(findTestObject('Object Repository/Page_Andhra University  Trans- Disciplinary_35d469/a_Research Review Meeting (RRM) - July 2023 Result'))

WebUI.click(findTestObject('Object Repository/Page_Andhra University  Trans- Disciplinary_35d469/a_Web Mail'))

WebUI.closeBrowser()

