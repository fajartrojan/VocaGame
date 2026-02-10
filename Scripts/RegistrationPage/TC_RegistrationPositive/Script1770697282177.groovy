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
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

String randomfName = 'fName ' + RandomStringUtils.randomAlphabetic(5)

String randomlName = 'lName ' + RandomStringUtils.randomAlphabetic(4)

String randomEmail = ('test' + System.currentTimeMillis()) + '@yopmail.com'

String randomPhone = '0812' + RandomStringUtils.randomNumeric(8)

WebUI.setText(findTestObject('Object Repository/RegistrationPage/TxtNamaDepan'), randomfName)

WebUI.setText(findTestObject('Object Repository/RegistrationPage/TxtNamaBlkng'), randomlName)

WebUI.setText(findTestObject('Object Repository/RegistrationPage/TxtEmail'), randomEmail)

WebUI.setText(findTestObject('Object Repository/RegistrationPage/TxtPhoneNumber'), randomPhone)

WebUI.setText(findTestObject('Object Repository/RegistrationPage/TxtPassword'), password)

WebUI.setText(findTestObject('Object Repository/RegistrationPage/TxtPasswordConfirm'), password)

WebUI.click(findTestObject('Object Repository/RegistrationPage/ChkSNK'))

//delay for copy email
WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/RegistrationPage/BtnBuatAkun'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RegistrationPage/BtnLanjutkanOTP'), GlobalVariable.timeOut)

WebUI.click(findTestObject('Object Repository/RegistrationPage/ChsOTP'))

WebUI.click(findTestObject('Object Repository/RegistrationPage/BtnLanjutkanOTP'))

//Need Input manual OTP sent to email, if has API can be automated here
//button akan ke klik jika OTP manual sudah di input
WebUI.waitForElementClickable(findTestObject('Object Repository/RegistrationPage/BtnVerifikasiOTP'), GlobalVariable.timeOut)

WebUI.click(findTestObject('Object Repository/RegistrationPage/BtnVerifikasiOTP'))

// Validasi success atau tidaknya akun
boolean isSuccess = WebUI.verifyElementVisible(findTestObject('Object Repository/LoginPage/LblMasuk'), FailureHandling.CONTINUE_ON_FAILURE)

if (isSuccess) {
    println("ASSERTION SUCCESS: Akun berhasil dibuat dan user direct ke login page")
} else {
    WebUI.takeScreenshot()
    WebUI.keywordLogger.logFailed("ASSERTION FAILED: Akun gagal di buat")
}

