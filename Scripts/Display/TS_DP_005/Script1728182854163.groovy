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

WebUI.click(findTestObject('Object Repository/Edit Detail Device/Page_PixelPop  Dashboard/button_Display'))

WebUI.click(findTestObject('Object Repository/Edit Detail Device/Page_PixelPop  Display/svg'))

WebUI.click(findTestObject('Object Repository/Edit Detail Device/Page_PixelPop  Detail Display/button_Edit'))

WebUI.click(findTestObject('Object Repository/Edit Detail Device/Page_PixelPop  Detail Display/input_Save Changes_YInput-root YInputGroup-_949428'))

WebUI.setText(findTestObject('Object Repository/Edit Detail Device/Page_PixelPop  Detail Display/input_Save Changes_YInput-root YInputGroup-_949428'), 
    'HP QA')

WebUI.click(findTestObject('Object Repository/Edit Detail Device/Page_PixelPop  Detail Display/button_Save Changes'))

WebUI.click(findTestObject('Object Repository/Edit Detail Device/Page_PixelPop  Detail Display/button_Yes, Sure'))

