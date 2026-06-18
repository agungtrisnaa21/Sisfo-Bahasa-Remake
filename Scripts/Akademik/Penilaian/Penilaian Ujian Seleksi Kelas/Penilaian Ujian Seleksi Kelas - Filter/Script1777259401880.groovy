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

WebUI.click(findTestObject('Akademik/Sidebar/Page_SISTEM INFORMASI AKADEMIK/span_Penilaian'))

WebUI.click(findTestObject('Akademik/Sidebar/Page_SISTEM INFORMASI AKADEMIK/span_Penilaian Ujian Seleksi Kelas'))

WebUI.verifyElementText(findTestObject('Akademik/Penilaian/Ujian Seleksi Kelas/Page_SISTEM INFORMASI AKADEMIK/h2_Penilaian Ujian Seleksi Kelas'), 
    'PENILAIAN UJIAN SELEKSI KELAS')

WebUI.click(findTestObject('Akademik/Penilaian/Ujian Masuk/Page_SISTEM INFORMASI AKADEMIK/button_Filter0'))

WebUI.click(findTestObject('Akademik/Penilaian/Ujian Masuk/Page_SISTEM INFORMASI AKADEMIK/span_Pilih Tanggal'))

WebUI.click(findTestObject('Akademik/Penilaian/Ujian Masuk/Page_SISTEM INFORMASI AKADEMIK/button_today'))

WebUI.verifyElementText(findTestObject('Akademik/Penilaian/Ujian Masuk/Page_SISTEM INFORMASI AKADEMIK/p_1 Filter yang diterapkan'), 
    '1 Filter yang diterapkan')

WebUI.click(findTestObject('Akademik/Penilaian/Ujian Masuk/Page_SISTEM INFORMASI AKADEMIK/button_Hapus Filter'))

WebUI.click(findTestObject('Akademik/Penilaian/Ujian Masuk/Page_SISTEM INFORMASI AKADEMIK/button_Filter0'))

WebUI.verifyElementText(findTestObject('Akademik/Penilaian/Ujian Masuk/Page_SISTEM INFORMASI AKADEMIK/p_0 Filter yang diterapkan'), 
    '0 Filter yang diterapkan')

WebUI.closeBrowser()

