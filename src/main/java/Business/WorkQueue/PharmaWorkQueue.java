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
public class PharmaWorkQueue extends WorkQueue {
    
    private ArrayList<PharmaWorkRequest> pharmaWorkRequestList;
    
    public PharmaWorkQueue() {
        pharmaWorkRequestList = new ArrayList();
    }

    public ArrayList<PharmaWorkRequest> getPharmaWorkRequestList() {
        return pharmaWorkRequestList;
    }
    
    
}
