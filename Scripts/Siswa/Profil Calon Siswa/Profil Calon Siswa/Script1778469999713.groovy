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

WebUI.click(findTestObject('Portal Badiklat/Page_Pusdiklat Badiklat/h5_Pengelolaan Siswa'))

WebUI.switchToWindowTitle('SISTEM INFORMASI SISWA')

WebUI.click(findTestObject('Pengelolaan Siswa/Sidebar/span_Profil Calon Siswa'))

WebUI.waitForElementVisible(findTestObject('Pengelolaan Siswa/Generate Akun/Page_SISTEM INFORMASI SISWA/h2_Dashboard siswa'), 
    5)

WebUI.verifyElementText(findTestObject('Pengelolaan Siswa/Generate Akun/Page_SISTEM INFORMASI SISWA/h2_Dashboard siswa'), 
    'PROFIL CALON SISWA')

WebUI.setText(findTestObject('Pengelolaan Siswa/Calon Siswa/Page_SISTEM INFORMASI SISWA/searchbar calon siswa'), generate)

WebUI.delay(2)

WebUI.click(findTestObject('Pengelolaan Siswa/Calon Siswa/Page_SISTEM INFORMASI SISWA/edit'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Pengelolaan Siswa/Calon Siswa/Page_SISTEM INFORMASI SISWA/input_Nama Pengguna_username'), 
    5)

WebUI.setText(findTestObject('Pengelolaan Siswa/Calon Siswa/Page_SISTEM INFORMASI SISWA/input_Nama Pengguna_username'), 
    usernameSiswa)

WebUI.setText(findTestObject('Pengelolaan Siswa/Calon Siswa/Page_SISTEM INFORMASI SISWA/input_Email_email'), email)

WebUI.setText(findTestObject('Pengelolaan Siswa/Calon Siswa/Page_SISTEM INFORMASI SISWA/input_Nama_name'), namaSiswa)

WebUI.setText(findTestObject('Pengelolaan Siswa/Calon Siswa/Page_SISTEM INFORMASI SISWA/input_Nomor Telepon Kantor_phoneWork'), 
    '082154357894')

WebUI.waitForElementClickable(findTestObject('Pengelolaan Siswa/Calon Siswa/Page_SISTEM INFORMASI SISWA/button_Select item kategori'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Pengelolaan Siswa/Calon Siswa/Page_SISTEM INFORMASI SISWA/button_Select item kategori'))

WebUI.click(findTestObject('Pengelolaan Siswa/Calon Siswa/Page_SISTEM INFORMASI SISWA/div_TNI'))

WebUI.setText(findTestObject('Pengelolaan Siswa/Calon Siswa/Page_SISTEM INFORMASI SISWA/input_Nomor Telepon Rumah_phoneHome'), 
    '082154698723')

WebUI.waitForElementClickable(findTestObject('Pengelolaan Siswa/Calon Siswa/Page_SISTEM INFORMASI SISWA/button_Select item_pangkat'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Pengelolaan Siswa/Calon Siswa/Page_SISTEM INFORMASI SISWA/button_Select item_pangkat'))

WebUI.click(findTestObject('Pengelolaan Siswa/Calon Siswa/Page_SISTEM INFORMASI SISWA/span_Letnan Satu (Lettu)'))

WebUI.waitForElementClickable(findTestObject('Pengelolaan Siswa/Calon Siswa/Page_SISTEM INFORMASI SISWA/span_Select item bahasa'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Pengelolaan Siswa/Calon Siswa/Page_SISTEM INFORMASI SISWA/span_Select item bahasa'))

WebUI.setText(findTestObject('Pengelolaan Siswa/Calon Siswa/Page_SISTEM INFORMASI SISWA/combobox bahasa'), bahasa)

WebUI.sendKeys(findTestObject('Pengelolaan Siswa/Calon Siswa/Page_SISTEM INFORMASI SISWA/combobox bahasa'), Keys.chord(Keys.ENTER))

WebUI.waitForElementClickable(findTestObject('Pengelolaan Siswa/Calon Siswa/Page_SISTEM INFORMASI SISWA/span_Select item kursus'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Pengelolaan Siswa/Calon Siswa/Page_SISTEM INFORMASI SISWA/span_Select item kursus'))

WebUI.setText(findTestObject('Pengelolaan Siswa/Calon Siswa/Page_SISTEM INFORMASI SISWA/combobox kursus'), kursus)

WebUI.sendKeys(findTestObject('Pengelolaan Siswa/Calon Siswa/Page_SISTEM INFORMASI SISWA/combobox kursus'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Pengelolaan Siswa/Calon Siswa/Page_SISTEM INFORMASI SISWA/label_AL'))

WebUI.setText(findTestObject('Pengelolaan Siswa/Calon Siswa/Page_SISTEM INFORMASI SISWA/input_NRPNomor Induk_nrp'), nrp)

WebUI.setText(findTestObject('Pengelolaan Siswa/Calon Siswa/Page_SISTEM INFORMASI SISWA/input_Instansi_institution'), 'Bahasa')

WebUI.setText(findTestObject('Pengelolaan Siswa/Calon Siswa/Page_SISTEM INFORMASI SISWA/input_Posisi_position'), 'Pembina')

WebUI.setText(findTestObject('Pengelolaan Siswa/Calon Siswa/Page_SISTEM INFORMASI SISWA/input_Nomor Telepon_phoneCall'), 
    '085421565478')

WebUI.setText(findTestObject('Pengelolaan Siswa/Calon Siswa/Page_SISTEM INFORMASI SISWA/input_Unit Kerja_workUnit'), 'Kemhan')

WebUI.click(findTestObject('Pengelolaan Siswa/Calon Siswa/Page_SISTEM INFORMASI SISWA/button_Simpan'))

WebUI.waitForElementVisible(findTestObject('General/Page_SISTEM INFORMASI AKADEMIK/toast'), 5)

WebUI.verifyElementText(findTestObject('General/Page_SISTEM INFORMASI AKADEMIK/toast'), 'Data berhasil diperbarui')

WebUI.closeBrowser()

