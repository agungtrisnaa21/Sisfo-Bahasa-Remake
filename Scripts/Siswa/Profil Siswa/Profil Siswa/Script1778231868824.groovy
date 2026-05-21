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

WebUI.click(findTestObject('Pengelolaan Siswa/Sidebar/span_Profil Siswa'))

WebUI.verifyElementText(findTestObject('Pengelolaan Siswa/Generate Akun/Page_SISTEM INFORMASI SISWA/h2_Dashboard siswa'), 
    'PROFIL SISWA')

WebUI.setText(findTestObject('Pengelolaan Siswa/Profil Siswa/Page_SISTEM INFORMASI SISWA/input_Filter_table-search'), namaSiswa)

WebUI.delay(1)

WebUI.click(findTestObject('Pengelolaan Siswa/Profil Siswa/Page_SISTEM INFORMASI SISWA/edit'))

WebUI.setText(findTestObject('Pengelolaan Siswa/Profil Siswa/Page_SISTEM INFORMASI SISWA/input_ID Siswa_union.studentId'), 
    idSiswa)

WebUI.setText(findTestObject('Pengelolaan Siswa/Profil Siswa/Page_SISTEM INFORMASI SISWA/input_Alamat Kantor_officeAddress.address'), 
    'Jl. Terus')

WebUI.setText(findTestObject('Pengelolaan Siswa/Profil Siswa/Page_SISTEM INFORMASI SISWA/input_Alamat Rumah_homeAddress.address'), 
    'Jl. Mulu')

WebUI.click(findTestObject('Pengelolaan Siswa/Profil Siswa/Page_SISTEM INFORMASI SISWA/label_Laki-laki'))

WebUI.click(findTestObject('Pengelolaan Siswa/Profil Siswa/Page_SISTEM INFORMASI SISWA/label_Islam'))

WebUI.click(findTestObject('Pengelolaan Siswa/Profil Siswa/Page_SISTEM INFORMASI SISWA/span_Pilih Tanggal lahir'))

WebUI.click(findTestObject('Pengelolaan Siswa/Profil Siswa/Page_SISTEM INFORMASI SISWA/button_today'))

WebUI.click(findTestObject('Pengelolaan Siswa/Profil Siswa/Page_SISTEM INFORMASI SISWA/span_Select item ruangan'))

WebUI.setText(findTestObject('Pengelolaan Siswa/Profil Siswa/Page_SISTEM INFORMASI SISWA/combobox mess'), 'mess')

WebUI.sendKeys(findTestObject('Pengelolaan Siswa/Profil Siswa/Page_SISTEM INFORMASI SISWA/combobox mess'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Pengelolaan Siswa/Profil Siswa/Page_SISTEM INFORMASI SISWA/input_Tempat Lahir_placeOfBirth'), 
    'Rumah Sakit')

WebUI.click(findTestObject('Pengelolaan Siswa/Profil Siswa/Page_SISTEM INFORMASI SISWA/label_S1'))

WebUI.setText(findTestObject('Pengelolaan Siswa/Profil Siswa/Page_SISTEM INFORMASI SISWA/input_Fakultas_union.higherEducation.faculty'), 
    'Fakultas Pertanian')

WebUI.setText(findTestObject('Pengelolaan Siswa/Profil Siswa/Page_SISTEM INFORMASI SISWA/input_Tahun Lulus_union.higherEducation.gra_21ca38'), 
    '2022')

WebUI.setText(findTestObject('Pengelolaan Siswa/Profil Siswa/Page_SISTEM INFORMASI SISWA/input_Jurusan_union.higherEducation.major'), 
    'Manajemen Informatika')

WebUI.setText(findTestObject('Pengelolaan Siswa/Profil Siswa/Page_SISTEM INFORMASI SISWA/input_Sekolah  Akademi  Universitas  Instit_7c2dd6'), 
    'STIE Nipunegoro')

WebUI.setText(findTestObject('Pengelolaan Siswa/Profil Siswa/Page_SISTEM INFORMASI SISWA/input_Kota_union.domicile.city'), 
    'Surakarta')

WebUI.setText(findTestObject('Pengelolaan Siswa/Profil Siswa/Page_SISTEM INFORMASI SISWA/input_Provinsi_union.domicile.province'), 
    'Jember Utara')

WebUI.setText(findTestObject('Pengelolaan Siswa/Profil Siswa/Page_SISTEM INFORMASI SISWA/input_Alasan mengambil kursus_union.courseReasons'), 
    'Karena ingin')

WebUI.click(findTestObject('Pengelolaan Siswa/Profil Siswa/Page_SISTEM INFORMASI SISWA/button_Simpan'))

WebUI.waitForElementVisible(findTestObject('General/Page_SISTEM INFORMASI AKADEMIK/toast'), 5)

WebUI.verifyElementText(findTestObject('General/Page_SISTEM INFORMASI AKADEMIK/toast'), 'Data Berhasil Diperbarui')

WebUI.closeBrowser()

