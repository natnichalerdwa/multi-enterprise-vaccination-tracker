/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author natnichalerd
 */
public class VaccineWorkQueue extends WorkQueue {
    
    private ArrayList<VaccineWorkRequest> vaccineWorkRequestList;
    
    public VaccineWorkQueue() {
        vaccineWorkRequestList = new ArrayList();
    }

    public ArrayList<VaccineWorkRequest> getVaccineWorkRequestList() {
        return vaccineWorkRequestList;
    }
    
    
}
