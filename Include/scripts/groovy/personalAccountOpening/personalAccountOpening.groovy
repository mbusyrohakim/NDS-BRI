package personalAccountOpening
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

class personalAccountOpening {

	@Given('user pilih kewarganegaraan')
	def user_pilih_kewarganegaraan() {
		WebUI.click(findTestObject('Object Repository/Personal_Open_Account/Page_Personal_Account_Opening_Form1/Option_Kewarganegaraan'))
	}
	
	@When('user pilih WNI')
	def user_pilih_WNI() {
		WebUI.click(findTestObject('Object Repository/Personal_Open_Account/Page_Personal_Account_Opening_Form1/Option_WNI'))
	}

	@Then("user pilih jenis identitas utama")
	def user_pilih_jenis_identitas_utama() {
		WebUI.click(findTestObject('Object Repository/Personal_Open_Account/Page_Personal_Account_Opening_Form1/Option_Jenis_Identitas_Utama'))
	}
	
	@And("user pilih KTP")
	def user_pilih_KTP(){
		WebUI.click(findTestObject('Object Repository/Personal_Open_Account/Page_Personal_Account_Opening_Form1/Option_Kartu_Tanda_Penduduk'))
	}
	
	@And("user input nomor identitas utama")
	def user_input_nomor_identitas_utama() {
		WebUI.setText(findTestObject('Object Repository/Personal_Open_Account/Page_Personal_Account_Opening_Form1/Input_Jenis_Identitas_Utama'), '3275096610010019')
	}


}