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

WebUI.click(findTestObject('Akademik/Sidebar/Page_SISTEM INFORMASI AKADEMIK/span_Jadwal Mingguan'))

WebUI.waitForElementVisible(findTestObject('Akademik/Dashboard/Page_SISTEM INFORMASI AKADEMIK/h2_Dashboard'), 5)

WebUI.verifyElementText(findTestObject('Akademik/Dashboard/Page_SISTEM INFORMASI AKADEMIK/h2_Dashboard'), 'JADWAL MINGGUAN')

WebUI.click(findTestObject('Akademik/Jadwal Mingguan/Page_SISTEM INFORMASI AKADEMIK/button_Filter0'))

WebUI.click(findTestObject('Akademik/Jadwal Mingguan/Page_SISTEM INFORMASI AKADEMIK/filter_Kursus - Angkatan'))

WebUI.setText(findTestObject('Akademik/Jadwal Mingguan/Page_SISTEM INFORMASI AKADEMIK/combobox kursus-angkatan'), kursus)

WebUI.sendKeys(findTestObject('Akademik/Jadwal Mingguan/Page_SISTEM INFORMASI AKADEMIK/combobox kursus-angkatan'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Akademik/Jadwal Mingguan/Page_SISTEM INFORMASI AKADEMIK/filter_Kelas'))

WebUI.setText(findTestObject('Akademik/Jadwal Mingguan/Page_SISTEM INFORMASI AKADEMIK/combobox kelas'), kelas)

WebUI.sendKeys(findTestObject('Akademik/Jadwal Mingguan/Page_SISTEM INFORMASI AKADEMIK/combobox kelas'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Akademik/Jadwal Mingguan/Page_SISTEM INFORMASI AKADEMIK/filter_Tipe Jadwal'))

WebUI.setText(findTestObject('Akademik/Jadwal Mingguan/Page_SISTEM INFORMASI AKADEMIK/combobox tipej'), 'Ujian')

WebUI.sendKeys(findTestObject('Akademik/Jadwal Mingguan/Page_SISTEM INFORMASI AKADEMIK/combobox tipej'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Akademik/Jadwal Mingguan/Page_SISTEM INFORMASI AKADEMIK/filter_Tanggal'))

WebUI.click(findTestObject('Akademik/Jadwal Mingguan/Page_SISTEM INFORMASI AKADEMIK/button_today'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Akademik/Jadwal Mingguan/Page_SISTEM INFORMASI AKADEMIK/p_0 Filter yang diterapkan'), 
    '4 Filter yang diterapkan')

WebUI.click(findTestObject('Akademik/Jadwal Mingguan/Page_SISTEM INFORMASI AKADEMIK/button_Hapus Filter'))

WebUI.click(findTestObject('Akademik/Jadwal Mingguan/Page_SISTEM INFORMASI AKADEMIK/button_Filter0'))

WebUI.waitForElementVisible(findTestObject('Akademik/Jadwal Mingguan/Page_SISTEM INFORMASI AKADEMIK/p_0 Filter yang diterapkan'), 
    5)

WebUI.verifyElementText(findTestObject('Akademik/Jadwal Mingguan/Page_SISTEM INFORMASI AKADEMIK/p_0 Filter yang diterapkan'), 
    '0 Filter yang diterapkan')

WebUI.closeBrowser()

