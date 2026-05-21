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

WebUI.click(findTestObject('Akademik/Kelas/Page_SISTEM INFORMASI AKADEMIK/a_Tambah'))

WebUI.click(findTestObject('Akademik/Kelas/Page_SISTEM INFORMASI AKADEMIK/span_Kursus - Angkatan'))

WebUI.setText(findTestObject('Akademik/Kelas/Page_SISTEM INFORMASI AKADEMIK/combobox kursusa'), kursus)

WebUI.sendKeys(findTestObject('Akademik/Kelas/Page_SISTEM INFORMASI AKADEMIK/combobox kursusa'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Akademik/Kelas/Page_SISTEM INFORMASI AKADEMIK/span_Class Master'))

WebUI.setText(findTestObject('Akademik/Kelas/Page_SISTEM INFORMASI AKADEMIK/combobox classm'), 'jajang')

WebUI.sendKeys(findTestObject('Akademik/Kelas/Page_SISTEM INFORMASI AKADEMIK/combobox classm'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Akademik/Kelas/Page_SISTEM INFORMASI AKADEMIK/input_Kelas_name'), kelas)

WebUI.setText(findTestObject('Akademik/Kelas/Page_SISTEM INFORMASI AKADEMIK/input_Nilai Minimal_minimalScore'), '70')

WebUI.setText(findTestObject('Akademik/Kelas/Page_SISTEM INFORMASI AKADEMIK/input_Kapasitas Maksimal Siswa_maxStudent'), 
    '5')

WebUI.click(findTestObject('Akademik/Kelas/Page_SISTEM INFORMASI AKADEMIK/button_Add WIpeng'))

WebUI.click(findTestObject('Akademik/Kelas/Page_SISTEM INFORMASI AKADEMIK/span_Nama Lengkap WI penguji'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Akademik/Kelas/Page_SISTEM INFORMASI AKADEMIK/combobox wipeng'), 'asep')

WebUI.sendKeys(findTestObject('Akademik/Kelas/Page_SISTEM INFORMASI AKADEMIK/combobox wipeng'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Akademik/Kelas/Page_SISTEM INFORMASI AKADEMIK/button_Simpan'))

WebUI.waitForElementVisible(findTestObject('General/Page_SISTEM INFORMASI AKADEMIK/toast'), 5)

WebUI.verifyElementText(findTestObject('General/Page_SISTEM INFORMASI AKADEMIK/toast'), 'Berhasil Membuat Data Baru')

WebUI.closeBrowser()

