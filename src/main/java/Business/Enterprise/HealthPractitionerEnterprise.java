/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author natnichalerd
 */
public class HealthPractitionerEnterprise extends Enterprise {
    
    public HealthPractitionerEnterprise(String name){
        super(name,EnterpriseType.HealthPractitioner);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
