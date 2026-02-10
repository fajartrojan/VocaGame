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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

WebUI.click(findTestObject('Object Repository/ProductOrderPage/TxtSearch'))
WebUI.setText(findTestObject('Object Repository/ProductOrderPage/TxtSearch'), "Roblox")
WebUI.click(findTestObject('Object Repository/ProductOrderPage/ImgRoblox'))

WebUI.click(findTestObject('Object Repository/ProductOrderPage/TxtEmail'))
WebUI.clearText(findTestObject('Object Repository/ProductOrderPage/TxtEmail'))
WebUI.setText(findTestObject('Object Repository/ProductOrderPage/TxtEmail'), email)

def productRoblox50k = findTestObject('Object Repository/ProductOrderPage/LblRoblox50k')
WebUI.waitForElementPresent(productRoblox50k, GlobalVariable.timeOut)
WebElement element = WebUiCommonHelper.findWebElement(productRoblox50k, GlobalVariable.timeOut)
WebUI.executeJavaScript("arguments[0].scrollIntoView({block: 'center'});", Arrays.asList(element))
WebUI.delay(1)
WebUI.click(productRoblox50k)

//Choose payment with qris
WebUI.click(findTestObject('Object Repository/ProductOrderPage/SecQRIS'))
WebUI.click(findTestObject('Object Repository/ProductOrderPage/BtnQRIS'))
WebUI.click(findTestObject('Object Repository/ProductOrderPage/BtnBuy'))

WebUI.delay(10)


