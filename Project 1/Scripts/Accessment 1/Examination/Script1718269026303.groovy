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

WebUI.click(findTestObject('Object Repository/Page_Andhra University  Visakhapatnam/a_Examinations'))

WebUI.switchToWindowTitle('Andhra University Examination Computerization System & Certificate Genuineness Verification')

WebUI.click(findTestObject('Object Repository/Page_Andhra University Examination Computer_2bdc77/a_Services'))

WebUI.click(findTestObject('Object Repository/Page_Andhra University Examination Computer_2bdc77/a_results'))

WebUI.click(findTestObject('Object Repository/Page_Andhra University Examination Computer_2bdc77/a_pg login'))

WebUI.click(findTestObject('Object Repository/Page_Andhra University Examination Computer_2bdc77/a_ug login'))

WebUI.click(findTestObject('Object Repository/Page_AU/p_Copyright  2020 Andhra University. All ri_135de0'))

WebUI.click(findTestObject('Object Repository/Page_AU/div_HOME                                   _e8a884'))

WebUI.click(findTestObject('Object Repository/Page_AU/a_Mon-Sat  1000 AM to 530 PM_meanmenu-reveal'))

WebUI.click(findTestObject('Object Repository/Page_AU/a_SPECIAL HALLTICKETS'))

WebUI.click(findTestObject('Object Repository/Page_AU/a_Semester'))

WebUI.closeBrowser()

