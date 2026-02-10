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

//TC email tidak terdaftar
WebUI.setText(findTestObject('Object Repository/LoginPage/TxtEmail'), emailUnregis)
WebUI.click(findTestObject('Object Repository/LoginPage/BtnMasukAkun'))
WebUI.setText(findTestObject('Object Repository/LoginPage/TxtPassword'), password)
WebUI.click(findTestObject('Object Repository/LoginPage/BtnMasukAkun'))

// Validasi error pop up
WebUI.waitForElementVisible(findTestObject('Object Repository/Common/PopUpError'), GlobalVariable.timeOut)
String actualMsg0 = WebUI.getText(findTestObject('Object Repository/Common/PopUpError'))
println("Error Message yang muncul: " + actualMsg0)
WebUI.delay(4)

//TC password salah
WebUI.click(findTestObject('Object Repository/LoginPage/BtnEditEmail'))
WebUI.setText(findTestObject('Object Repository/LoginPage/TxtEmail'), email)
WebUI.click(findTestObject('Object Repository/LoginPage/BtnMasukAkun'))
WebUI.setText(findTestObject('Object Repository/LoginPage/TxtPassword'), password)
WebUI.click(findTestObject('Object Repository/LoginPage/BtnMasukAkun'))

// Validasi error pop up
WebUI.waitForElementVisible(findTestObject('Object Repository/Common/PopUpError'), GlobalVariable.timeOut)
String actualMsg1 = WebUI.getText(findTestObject('Object Repository/Common/PopUpError'))
println("Error Message yang muncul: " + actualMsg1)
WebUI.delay(4)

