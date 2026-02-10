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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.click(findTestObject('Object Repository/LoginPage/LinkRegis'))

WebUI.waitForElementVisible(findTestObject('Object Repository/RegistrationPage/LblRegis'), GlobalVariable.timeOut)

//ini contoh kalau mau lebih lengkap lagi untuk memastikan error msg nya muncul dan msg nya sesuai
WebUI.setText(findTestObject('Object Repository/RegistrationPage/TxtNamaDepan'), fName)
WebUI.verifyElementPresent(findTestObject('Object Repository/RegistrationPage/ErrorMsgNamaDepan'), GlobalVariable.timeOut, FailureHandling.CONTINUE_ON_FAILURE)
String actualErrorTextNamaDepan = WebUI.getText(findTestObject('Object Repository/RegistrationPage/ErrorMsgNamaDepan'))
println("Error yang muncul: " + actualErrorTextNamaDepan)

WebUI.setText(findTestObject('Object Repository/RegistrationPage/TxtNamaBlkng'), lName)
WebUI.verifyElementPresent(findTestObject('Object Repository/RegistrationPage/ErrorMsgNamaDepan'), GlobalVariable.timeOut)

WebUI.setText(findTestObject('Object Repository/RegistrationPage/TxtPhoneNumber'), phoneNumber)

WebUI.setText(findTestObject('Object Repository/RegistrationPage/TxtEmail'), email)
WebUI.verifyElementPresent(findTestObject('Object Repository/RegistrationPage/ErrorMsgEmail'), GlobalVariable.timeOut)

WebUI.setText(findTestObject('Object Repository/RegistrationPage/TxtPassword'), password)

WebUI.setText(findTestObject('Object Repository/RegistrationPage/TxtPasswordConfirm'), passwordconfirm)
WebUI.verifyElementPresent(findTestObject('Object Repository/RegistrationPage/ErrorMsgPasswordConfirm'), GlobalVariable.timeOut)


