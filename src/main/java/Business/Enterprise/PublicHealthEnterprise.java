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
public class PublicHealthEnterprise extends Enterprise {
    
    public PublicHealthEnterprise(String name){
        super(name,EnterpriseType.PublicHealth);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
