/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package average_of_numbers;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nicod
 */
public class Average_of_numbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random generator = new Random();
        
        NumberList someNumbers = new NumberList();
        
        System.out.print("How many numbers to generate? ");
        int count = Integer.parseInt(console.nextLine());
        
        for (int i = 0; i < count; i++) {
            someNumbers.add(generator.nextInt());
        }
        
        System.out.println("Average = " + someNumbers.average());
        System.out.println("Sum = " + someNumbers.sum());
    }
    
}
