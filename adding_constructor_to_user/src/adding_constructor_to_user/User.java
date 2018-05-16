/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adding_constructor_to_user;

/**
 *
 * @author nicod
 */
public class User {
    private String firstname;
    private String lastname;
    
    public User(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
    
    public String getFirstName() {
        return firstname;
    }
    
    public String getLastName() {
        return lastname;
    }
}
