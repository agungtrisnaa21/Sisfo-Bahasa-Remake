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

WebUI.click(findTestObject('Portal Badiklat/Page_Pusdiklat Badiklat/a_Dasbor'))

WebUI.click(findTestObject('Portal Badiklat/Page_Dasbor  Pusdiklat Badiklat/a_Manajemen Akun'))

WebUI.click(findTestObject('Portal Badiklat/Page_Dasbor  Pusdiklat Badiklat/a_Akun'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Portal Badiklat/Page_Dasbor  Pusdiklat Badiklat/a_Pengelolaan Informasi Akun'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Portal Badiklat/Page_Pengelolaan Informasi Akun  Pusdiklat Badiklat/Searchbar akun'), usernameSiswa)

WebUI.delay(2)

WebUI.click(findTestObject('Portal Badiklat/Page_Pengelolaan Informasi Akun  Pusdiklat Badiklat/delete'))

WebUI.click(findTestObject('Portal Badiklat/Page_Pengelolaan Informasi Akun  Pusdiklat Badiklat/button_Hapus'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Portal Badiklat/Page_Pengelolaan Informasi Akun  Pusdiklat Badiklat/div_Item DihapusItem telah berhasil dihapus'), 
    5)

WebUI.verifyElementVisible(findTestObject('Portal Badiklat/Page_Pengelolaan Informasi Akun  Pusdiklat Badiklat/div_Item DihapusItem telah berhasil dihapus'), 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.closeBrowser()

