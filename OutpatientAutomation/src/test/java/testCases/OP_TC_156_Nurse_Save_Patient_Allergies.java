package testCases;

import org.testng.annotations.Test;

import opd_HP_Menus.NewDocument_Menu_Items;
import opd_authentication.Authentication;
import opd_new_documents_forms.Nurse_Submit_Allergy_Form;
import opd_new_documents_forms.Patient_Vitals_Form;
import opd_patient.NUR_View_Patient_list;
import opd_patient.Physician_Nurse_SearchFor_Patient;
import opd_patient.SelectPatientOP;
import testBase.*;

public class OP_TC_156_Nurse_Save_Patient_Allergies extends HP_Test_Base

{

	@Test
	public void patient_vitals() {
		Authentication auth = new Authentication(driver);
		auth.login_HP("NUROPD01", "egy123");
	
		
		Physician_Nurse_SearchFor_Patient search = new 	Physician_Nurse_SearchFor_Patient(driver);
		search.search_by_Name_first_doctor("Mohamed Ouda");
		
		NewDocument_Menu_Items select_item = new NewDocument_Menu_Items(driver);
		select_item.select_Allergy_Form();

		
		Nurse_Submit_Allergy_Form form = new Nurse_Submit_Allergy_Form(driver);
		form.nurse_fill_allergy_form();
		form.save_allergy(); 
		
	}

}
