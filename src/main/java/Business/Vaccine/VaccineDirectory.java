/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Vaccine;

import java.util.ArrayList;

/**
 *
 * @author natnichalerd
 */
public class VaccineDirectory {
    
    private ArrayList<Vaccine> vaccineList;
    
    public VaccineDirectory() {
        vaccineList = new ArrayList();
    }

    public ArrayList<Vaccine> getVaccineList() {
        return vaccineList;
    }
    
    // methods
    
    public Vaccine createNewVaccine(String name) {
        Vaccine vaccine = new Vaccine();
        vaccineList.add(vaccine);
        return vaccine;
    }
}
