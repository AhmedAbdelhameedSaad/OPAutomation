package testCases;

import org.testng.annotations.Test;

import opd_HP_Menus.NewDocument_Menu_Items;
import opd_authentication.Authentication;
import opd_new_documents_forms.During_Dialysis_Form;
import opd_new_documents_forms.Nurse_Submit_Allergy_Form;
import opd_new_documents_forms.Patient_Vitals_Form;
import opd_patient.NUR_View_Patient_list;
import opd_patient.Physician_Nurse_SearchFor_Patient;
import opd_patient.SelectPatientOP;
import testBase.*;

public class OP_TC_171_Nurse_Submit_During_Dialysis_Form extends HP_Test_Base

{

	@Test
	public void patient_vitals() {
		
		Authentication auth = new Authentication(driver);
		auth.login_HP("NURS2", "egy123"); 
	
		
		Physician_Nurse_SearchFor_Patient search = new 	Physician_Nurse_SearchFor_Patient(driver);
		search.search_by_Name("Ahmed Mustafa");
		
		NewDocument_Menu_Items select_item = new NewDocument_Menu_Items(driver);
		select_item.select_During_Dialysis();

		
		During_Dialysis_Form dial = new During_Dialysis_Form(driver);
		dial.nurse_fill_during_dialysis_form();
		dial.click_on_Submit_button();
		
	}

}
