/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Patient.PatientDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.DoctorWorkQueue;
import Business.WorkQueue.InsuranceWorkQueue;
import Business.WorkQueue.LabWorkQueue;
import Business.WorkQueue.PharmaWorkQueue;
import Business.WorkQueue.VaccineWorkQueue;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private PatientDirectory patientDirectory;
    private int organizationID;
    private static int counter=0;
    private LabWorkQueue labWorkQueue;
    private VaccineWorkQueue vaccineWorkQueue;
    private PharmaWorkQueue pharmaWorkQueue;
    private InsuranceWorkQueue insuranceWorkQueue;
    private DoctorWorkQueue doctorWorkQueue;
    
    public enum Type{
        Admin("Admin Organization"), 
        Doctor("Doctor Organization"), 
        Lab("Lab Organization"),
        Patient("Patient Organization"),
        Nurse("Nurse Organization"),
        Pharmaceutical("Pharmaceutical Organization"),
        InsuranceProvider("Insurance Organization"),
        PublicHealthAdmin("Public Health Organization");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        labWorkQueue = new LabWorkQueue();
        vaccineWorkQueue = new VaccineWorkQueue();
        pharmaWorkQueue = new PharmaWorkQueue();
        insuranceWorkQueue = new InsuranceWorkQueue();
        doctorWorkQueue = new DoctorWorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        patientDirectory = new PatientDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }
    
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public LabWorkQueue getLabWorkQueue() {
        return labWorkQueue;
    }

    public void setLabWorkQueue(LabWorkQueue labWorkQueue) {
        this.labWorkQueue = labWorkQueue;
    }

    public VaccineWorkQueue getVaccineWorkQueue() {
        return vaccineWorkQueue;
    }

    public void setVaccineWorkQueue(VaccineWorkQueue vaccineWorkQueue) {
        this.vaccineWorkQueue = vaccineWorkQueue;
    }

    public PharmaWorkQueue getPharmaWorkQueue() {
        return pharmaWorkQueue;
    }

    public void setPharmaWorkQueue(PharmaWorkQueue pharmaWorkQueue) {
        this.pharmaWorkQueue = pharmaWorkQueue;
    }

    public InsuranceWorkQueue getInsuranceWorkQueue() {
        return insuranceWorkQueue;
    }

    public void setInsuranceWorkQueue(InsuranceWorkQueue insuranceWorkQueue) {
        this.insuranceWorkQueue = insuranceWorkQueue;
    }

    public DoctorWorkQueue getDoctorWorkQueue() {
        return doctorWorkQueue;
    }

    public void setDoctorWorkQueue(DoctorWorkQueue doctorWorkQueue) {
        this.doctorWorkQueue = doctorWorkQueue;
    }
    
    
    
    

    @Override
    public String toString() {
        return name;
    }
    
    
}
