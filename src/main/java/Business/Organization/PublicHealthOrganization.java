/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.InsuranceProviderRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author natnichalerd
 */
public class PublicHealthOrganization extends Organization {
    
    public PublicHealthOrganization() {
        super(Organization.Type.PublicHealthAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new InsuranceProviderRole());
        return roles;
    }
}
