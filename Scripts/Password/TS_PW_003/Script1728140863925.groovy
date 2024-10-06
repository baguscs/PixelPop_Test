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

WebUI.callTestCase(findTestCase('Login/TS_LI_001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Change Password Invalid Without Confirm Value/Page_PixelPop  Dashboard/img'))

WebUI.click(findTestObject('Object Repository/Change Password Invalid Without Confirm Value/Page_PixelPop  Dashboard/span_Setting'))

WebUI.setEncryptedText(findTestObject('Object Repository/Change Password Invalid Without Confirm Value/Page_PixelPop  Setting Profile/input_Log Out_YInput-root YInputGroup-input_2edce6'), 
    '8oUrX8yGy9Y=')

WebUI.click(findTestObject('Object Repository/Change Password Invalid Without Confirm Value/Page_PixelPop  Setting Profile/button_Save Changes'))

WebUI.setEncryptedText(findTestObject('Object Repository/Change Password Invalid Without Confirm Value/Page_PixelPop  Setting Profile/input_Log Out_YInput-root YInputGroup-input_2edce6'), 
    '0hehu2uuA5kc9uN6xfIUpg==')

WebUI.click(findTestObject('Object Repository/Change Password Invalid Without Confirm Value/Page_PixelPop  Setting Profile/button_Save Changes'))

