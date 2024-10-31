/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Patient;

import java.util.ArrayList;

/**
 *
 * @author natnichalerd
 */
public class PatientDirectory {
    
    private ArrayList<Patient> patientList;
    
    public PatientDirectory() {
        patientList = new ArrayList();
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }
    
    public Patient createNewPatient(String firstName, String lastName) {
        Patient patient = new Patient();
        patient.setFirstName(firstName);
        patient.setLastName(lastName);
        patientList.add(patient);
        return patient;
    }
    
    public void deletePatient(Patient patient) {
        patientList.remove(patient);
    }
}
