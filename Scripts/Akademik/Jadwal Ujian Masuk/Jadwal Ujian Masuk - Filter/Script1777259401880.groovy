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

WebUI.click(findTestObject('Akademik/Sidebar/Page_SISTEM INFORMASI AKADEMIK/span_Jadwal Ujian Masuk'))

WebUI.verifyElementText(findTestObject('Akademik/Dashboard/Page_SISTEM INFORMASI AKADEMIK/h2_Dashboard'), 'JADWAL UJIAN MASUK')

WebUI.click(findTestObject('Akademik/Jadwal Ujian Masuk/Page_SISTEM INFORMASI AKADEMIK/button_Filter0'))

WebUI.click(findTestObject('Akademik/Jadwal Ujian Masuk/Page_SISTEM INFORMASI AKADEMIK/filter_Kursus - Angkatan'))

WebUI.setText(findTestObject('Akademik/Jadwal Ujian Masuk/Page_SISTEM INFORMASI AKADEMIK/combobox kursusa'), kursus)

WebUI.sendKeys(findTestObject('Akademik/Jadwal Ujian Masuk/Page_SISTEM INFORMASI AKADEMIK/combobox kursusa'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Akademik/Jadwal Ujian Masuk/Page_SISTEM INFORMASI AKADEMIK/filter_Tanggal'))

WebUI.click(findTestObject('Akademik/Jadwal Ujian Masuk/Page_SISTEM INFORMASI AKADEMIK/tanggal today'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Akademik/Jadwal Ujian Masuk/Page_SISTEM INFORMASI AKADEMIK/filter_Tipe Ujian'))

WebUI.setText(findTestObject('Akademik/Jadwal Ujian Masuk/Page_SISTEM INFORMASI AKADEMIK/combobox tipeuj'), 'ujian masuk')

WebUI.sendKeys(findTestObject('Akademik/Jadwal Ujian Masuk/Page_SISTEM INFORMASI AKADEMIK/combobox tipeuj'), Keys.chord(
        Keys.ENTER))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Akademik/Jadwal Ujian Masuk/Page_SISTEM INFORMASI AKADEMIK/p_0 Filter yang diterapkan'), 
    '3 Filter yang diterapkan')

WebUI.click(findTestObject('Akademik/Jadwal Ujian Masuk/Page_SISTEM INFORMASI AKADEMIK/button_Hapus Filter'))

WebUI.click(findTestObject('Akademik/Jadwal Ujian Masuk/Page_SISTEM INFORMASI AKADEMIK/button_Filter0'))

WebUI.waitForElementVisible(findTestObject('Akademik/Jadwal Ujian Masuk/Page_SISTEM INFORMASI AKADEMIK/p_0 Filter yang diterapkan'), 
    5)

WebUI.verifyElementText(findTestObject('Akademik/Jadwal Ujian Masuk/Page_SISTEM INFORMASI AKADEMIK/p_0 Filter yang diterapkan'), 
    '0 Filter yang diterapkan')

WebUI.closeBrowser()

