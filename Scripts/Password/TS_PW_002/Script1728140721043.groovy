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

WebUI.navigateToUrl('https://sandbox.pixelpop.id/login')

WebUI.setText(findTestObject('Object Repository/Change Password Invalid/Page_PixelPop  Log in/input_Forgot Password_YInput-root YInputGro_51ea33'), 
    'tacin97898@coloruz.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Change Password Invalid/Page_PixelPop  Log in/input_Forgot Password_YInput-root YInputGro_51ea33_1'), 
    '5Ed5CIkj9UQfaMZXAkDVaQ==')

WebUI.click(findTestObject('Object Repository/Change Password Invalid/Page_PixelPop  Log in/button_Log in'))

WebUI.click(findTestObject('Object Repository/Change Password Invalid/Page_PixelPop  Dashboard/img'))

WebUI.click(findTestObject('Object Repository/Change Password Invalid/Page_PixelPop  Dashboard/div_Setting'))

WebUI.setEncryptedText(findTestObject('Object Repository/Change Password Invalid/Page_PixelPop  Setting Profile/input_Log Out_YInput-root YInputGroup-input_2edce6'), 
    'roMmn5083eo=')

WebUI.click(findTestObject('Object Repository/Change Password Invalid/Page_PixelPop  Setting Profile/button_Save Changes'))

