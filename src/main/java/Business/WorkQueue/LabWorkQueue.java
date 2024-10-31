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
public class LabWorkQueue extends WorkQueue {
    
    private ArrayList<LabTestWorkRequest> labWorkRequestList;
    
    public LabWorkQueue() {
        labWorkRequestList = new ArrayList();
    }

    public ArrayList<LabTestWorkRequest> getLabWorkRequestList() {
        return labWorkRequestList;
    }
    
    
}
