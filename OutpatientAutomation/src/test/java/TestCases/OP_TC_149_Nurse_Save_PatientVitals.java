package testCases;

import org.testng.annotations.Test;

import opd_HP_Menus.NewDocument_Menu_Items;
import opd_authentication.Authentication;
import opd_new_documents_forms.Patient_Vitals_Form;
import opd_patient.NUR_View_Patient_list;
import opd_patient.SelectPatientOP;
import testBase.*;

public class OP_TC_149_Nurse_Save_PatientVitals extends HP_Test_Base

{

	@Test
	public void patient_vitals() {
		Authentication auth = new Authentication(driver);
		auth.login_HP("NUROPD01", "egy123");
	
		NUR_View_Patient_list view_list = new NUR_View_Patient_list(driver);
		view_list.list();
		
		SelectPatientOP find_patient = new SelectPatientOP(driver);
		find_patient.NUR_DOC_selectpatient();	
		
		NewDocument_Menu_Items select_item = new NewDocument_Menu_Items(driver);
		select_item.select_patient_vitals();

		Patient_Vitals_Form forms = new Patient_Vitals_Form(driver);
		forms.patient_vitals();
		forms.save_vitals();

	}

}
