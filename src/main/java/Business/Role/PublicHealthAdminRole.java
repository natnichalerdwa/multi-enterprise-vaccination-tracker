/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.InsuranceOrganization;
import Business.Organization.Organization;
import Business.Organization.PublicHealthOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.InsuranceProviderRole.InsuranceProviderWorkAreaJPanel;
import ui.PublicHealthAdminRole.PublicHealthAdminWorkAreaJPanel;

/**
 *
 * @author natnichalerd
 */
public class PublicHealthAdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PublicHealthAdminWorkAreaJPanel(userProcessContainer, account, (PublicHealthOrganization) organization, enterprise);
    }
    
}
