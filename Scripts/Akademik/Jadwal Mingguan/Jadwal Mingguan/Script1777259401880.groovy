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

WebUI.click(findTestObject('Akademik/Jadwal Mingguan/Page_SISTEM INFORMASI AKADEMIK/button_Tambah'))

WebUI.click(findTestObject('Akademik/Jadwal Mingguan/Page_SISTEM INFORMASI AKADEMIK/span_Kursus - Angkatan'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Akademik/Jadwal Mingguan/Page_SISTEM INFORMASI AKADEMIK/combobox kursusa'), kursus)

WebUI.sendKeys(findTestObject('Akademik/Jadwal Mingguan/Page_SISTEM INFORMASI AKADEMIK/combobox kursusa'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Akademik/Jadwal Mingguan/Page_SISTEM INFORMASI AKADEMIK/span_Tanggal'))

WebUI.click(findTestObject('Akademik/Jadwal Mingguan/Page_SISTEM INFORMASI AKADEMIK/button_today'))

WebUI.click(findTestObject('Akademik/Jadwal Mingguan/Page_SISTEM INFORMASI AKADEMIK/span_Kelas'))

WebUI.setText(findTestObject('Akademik/Jadwal Mingguan/Page_SISTEM INFORMASI AKADEMIK/combobox kelass'), kelas)

WebUI.sendKeys(findTestObject('Akademik/Jadwal Mingguan/Page_SISTEM INFORMASI AKADEMIK/combobox kelass'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Akademik/Jadwal Mingguan/Page_SISTEM INFORMASI AKADEMIK/span_Tipe Jadwal'))

WebUI.setText(findTestObject('Akademik/Jadwal Mingguan/Page_SISTEM INFORMASI AKADEMIK/combobox tipej'), 'Ujian')

WebUI.sendKeys(findTestObject('Akademik/Jadwal Mingguan/Page_SISTEM INFORMASI AKADEMIK/combobox tipej'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Akademik/Jadwal Mingguan/Page_SISTEM INFORMASI AKADEMIK/input_Minggu ke-_week'), '2')

WebUI.setText(findTestObject('Akademik/Jadwal Mingguan/Page_SISTEM INFORMASI AKADEMIK/textarea_Deskripsi_description'), 
    'ini adalah deskripsi jadwal mingguan ujian')

WebUI.click(findTestObject('Akademik/Jadwal Mingguan/Page_SISTEM INFORMASI AKADEMIK/button_Tambah sesi'))

WebUI.click(findTestObject('Akademik/Jadwal Mingguan/Page_SISTEM INFORMASI AKADEMIK/span_Jam Mulai Kelas'))

WebUI.click(findTestObject('Akademik/Jadwal Mingguan/Page_SISTEM INFORMASI AKADEMIK/div_1'))

WebUI.click(findTestObject('Akademik/Jadwal Mingguan/Page_SISTEM INFORMASI AKADEMIK/span_Jam Berakhir Kelas'))

WebUI.click(findTestObject('Akademik/Jadwal Mingguan/Page_SISTEM INFORMASI AKADEMIK/div_2'))

WebUI.setText(findTestObject('Akademik/Jadwal Mingguan/Page_SISTEM INFORMASI AKADEMIK/input__session-startTime'), startTime)

WebUI.setText(findTestObject('Akademik/Jadwal Mingguan/Page_SISTEM INFORMASI AKADEMIK/input__session-endTime'), endTime)

WebUI.click(findTestObject('Akademik/Jadwal Mingguan/Page_SISTEM INFORMASI AKADEMIK/span_Subjek'))

WebUI.setText(findTestObject('Akademik/Jadwal Mingguan/Page_SISTEM INFORMASI AKADEMIK/combobox subjek'), subjek)

WebUI.sendKeys(findTestObject('Akademik/Jadwal Mingguan/Page_SISTEM INFORMASI AKADEMIK/combobox subjek'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Akademik/Jadwal Mingguan/Page_SISTEM INFORMASI AKADEMIK/span_Widyaiswara'))

WebUI.setText(findTestObject('Akademik/Jadwal Mingguan/Page_SISTEM INFORMASI AKADEMIK/combobox wi'), 'asep')

WebUI.sendKeys(findTestObject('Akademik/Jadwal Mingguan/Page_SISTEM INFORMASI AKADEMIK/combobox wi'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Akademik/Jadwal Mingguan/Page_SISTEM INFORMASI AKADEMIK/input__session-room'), 'Ruangan Ujian')

WebUI.setText(findTestObject('Akademik/Jadwal Mingguan/Page_SISTEM INFORMASI AKADEMIK/textarea_Deskripsi_session-description'), 
    'Ini adalah deskripsi jadwal mingguan ujian')

WebUI.click(findTestObject('Akademik/Jadwal Mingguan/Page_SISTEM INFORMASI AKADEMIK/button_Simpan'))

WebUI.click(findTestObject('Akademik/Jadwal Mingguan/Page_SISTEM INFORMASI AKADEMIK/button_Simpan_1'))

WebUI.waitForElementVisible(findTestObject('General/Page_SISTEM INFORMASI AKADEMIK/toast'), 5)

WebUI.verifyElementText(findTestObject('General/Page_SISTEM INFORMASI AKADEMIK/toast'), 'Berhasil Membuat Data Baru')

WebUI.closeBrowser()

