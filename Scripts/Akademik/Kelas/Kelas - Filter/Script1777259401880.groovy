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

WebUI.maximizeWindow()

WebUI.navigateToUrl(url)

WebUI.setText(findTestObject('Portal Badiklat/Page_Sign in to Pusdiklat/input_Sistem Informasi Badiklat_username'), username)

WebUI.setText(findTestObject('Portal Badiklat/Page_Sign in to Pusdiklat/input_Sistem Informasi Badiklat_password'), password)

WebUI.click(findTestObject('Portal Badiklat/Page_Sign in to Pusdiklat/button_Sign In'))

WebUI.click(findTestObject('Portal Badiklat/Page_Pusdiklat Badiklat/h5_Pusdiklat                        Bahasa Badiklat Kemhan'))

WebUI.click(findTestObject('Portal Badiklat/Page_Pusdiklat Badiklat/h5_Pengelolaan Akademik'))

WebUI.switchToWindowTitle('SISTEM INFORMASI AKADEMIK')

WebUI.click(findTestObject('Akademik/Sidebar/Page_SISTEM INFORMASI AKADEMIK/span_Dashboard'))

WebUI.verifyElementText(findTestObject('Akademik/Dashboard/Page_SISTEM INFORMASI AKADEMIK/h2_Dashboard'), 'DASHBOARD')

WebUI.click(findTestObject('Akademik/Sidebar/Page_SISTEM INFORMASI AKADEMIK/span_Kelas'))

WebUI.click(findTestObject('Akademik/Kelas/Page_SISTEM INFORMASI AKADEMIK/span_Filter'))

WebUI.click(findTestObject('Akademik/Kelas/Page_SISTEM INFORMASI AKADEMIK/span_filter Kursus - Angkatan'))

WebUI.setText(findTestObject('Akademik/Kelas/Page_SISTEM INFORMASI AKADEMIK/combobox kursa'), kursus)

WebUI.sendKeys(findTestObject('Akademik/Kelas/Page_SISTEM INFORMASI AKADEMIK/combobox kursa'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Akademik/Kelas/Page_SISTEM INFORMASI AKADEMIK/span_ filter Class Master'))

WebUI.setText(findTestObject('Akademik/Kelas/Page_SISTEM INFORMASI AKADEMIK/combobox cm'), 'Jajang')

WebUI.sendKeys(findTestObject('Akademik/Kelas/Page_SISTEM INFORMASI AKADEMIK/combobox cm'), Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('Akademik/Kelas/Page_SISTEM INFORMASI AKADEMIK/verif filter kelas'), kelas)

WebUI.verifyElementText(findTestObject('Akademik/Kelas/Page_SISTEM INFORMASI AKADEMIK/verif cm kelas'), cm)

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Akademik/Kelas/Page_SISTEM INFORMASI AKADEMIK/p_2 Filter yang diterapkan'), '2 Filter yang diterapkan')

WebUI.click(findTestObject('Akademik/Kelas/Page_SISTEM INFORMASI AKADEMIK/button_Hapus Filter'))

WebUI.click(findTestObject('Akademik/Kelas/Page_SISTEM INFORMASI AKADEMIK/span_Filter'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Akademik/Kelas/Page_SISTEM INFORMASI AKADEMIK/p_2 Filter yang diterapkan'), '0 Filter yang diterapkan')

WebUI.closeBrowser()

