/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

/**
 *
 * @author natnichalerd
 */
public class PharmaWorkRequest extends VaccineWorkRequest {
    
    // private String vaccineName;
    private String manufacturer;
    private int numberOfDoses;

//    public String getVaccineName() {
//        return vaccineName;
//    }
//
//    public void setVaccineName(String vaccineName) {
//        this.vaccineName = vaccineName;
//    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    

    public int getNumberOfDoses() {
        return numberOfDoses;
    }

    public void setNumberOfDoses(int numberOfDoses) {
        this.numberOfDoses = numberOfDoses;
    }
    
    
}
