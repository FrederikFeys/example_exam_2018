/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adding_constructor_to_user;

import java.util.Scanner;

/**
 *
 * @author nicod
 */
public class Adding_constructor_to_user {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Please enter your firstname: ");
        String first = console.nextLine();
        
        System.out.print("Please enter your lastname: ");
        String last = console.nextLine();

        // Create user
        User user = new User(first, last);

        System.out.println("Welcome " + user.getFirstName() + " " + user.getLastName());
        
    }
    
}
