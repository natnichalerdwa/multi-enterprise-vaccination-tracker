/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

/**
 *
 * @author natnichalerd
 */
public class VaccineWorkRequest extends WorkRequest {
    
    private String vaccineRequestName;
    private double dosage;
    private String dosageUnit;

    public String getVaccineRequestName() {
        return vaccineRequestName;
    }

    public void setVaccineRequestName(String vaccineRequestName) {
        this.vaccineRequestName = vaccineRequestName;
    }

    public double getDosage() {
        return dosage;
    }

    public void setDosage(double dosage) {
        this.dosage = dosage;
    }

    public String getDosageUnit() {
        return dosageUnit;
    }

    public void setDosageUnit(String dosageUnit) {
        this.dosageUnit = dosageUnit;
    }
    
    
    
    
}
