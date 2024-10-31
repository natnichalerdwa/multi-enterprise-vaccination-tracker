/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Patient;

/**
 *
 * @author natnichalerd
 */
public class Patient {
    
    private String firstName;
    private String lastName;
    private String fullName;
    private int id;
    private static int count = 1;
    
    public Patient() {
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
