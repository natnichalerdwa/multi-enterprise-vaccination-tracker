/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import Business.WorkQueue.DoctorWorkQueue;
import Business.WorkQueue.InsuranceWorkQueue;
import Business.WorkQueue.LabWorkQueue;
import Business.WorkQueue.PharmaWorkQueue;
import Business.WorkQueue.VaccineWorkQueue;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author raunak
 */
public class UserAccount {
    
    private String username;
    private String password;
    private Employee employee;
    private Role role;
    private WorkQueue workQueue;
    private LabWorkQueue labQueue;
    private VaccineWorkQueue vaccineQueue;
    private PharmaWorkQueue pharmaWorkQueue;
    private InsuranceWorkQueue insuranceWorkQueue;
    private DoctorWorkQueue doctorWorkQueue;

    public UserAccount() {
        workQueue = new WorkQueue();
        labQueue = new LabWorkQueue();
        vaccineQueue = new VaccineWorkQueue();
        pharmaWorkQueue = new PharmaWorkQueue();
        insuranceWorkQueue = new InsuranceWorkQueue();
        doctorWorkQueue = new DoctorWorkQueue();
    }
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public LabWorkQueue getLabQueue() {
        return labQueue;
    }

    public VaccineWorkQueue getVaccineQueue() {
        return vaccineQueue;
    }

    public PharmaWorkQueue getPharmaWorkQueue() {
        return pharmaWorkQueue;
    }

    public InsuranceWorkQueue getInsuranceWorkQueue() {
        return insuranceWorkQueue;
    }

    public DoctorWorkQueue getDoctorWorkQueue() {
        return doctorWorkQueue;
    }
    
    
    

    
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}