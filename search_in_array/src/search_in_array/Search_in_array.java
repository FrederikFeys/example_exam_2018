/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search_in_array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nicod
 */
public class Search_in_array {

    public static void main(String[] args) {     
        
        ArrayList<Product> products = new ArrayList();
        
        Product chips = new Product(123, "A bag of doritos chips");
        chips.addTag("chips");
        chips.addTag("doritos");
        chips.addTag("cheese");
        products.add(chips);
        
        Product cola = new Product(231, "A bottle of cola");
        cola.addTag("cola");
        cola.addTag("drink");
        cola.addTag("soda");
        products.add(cola);
        
        Scanner console = new Scanner(System.in);
        
        System.out.print("What tag would you like to look for: ");
        String tag = console.nextLine();
        
        boolean found = false;
        for (Product product : products) {
            if (product.hasTag(tag)) {
                found = true;
                System.out.println(product.getDescription() + " has a tag " + tag);
            }
        }
        
        if (!found) {
            System.out.println("No products with tag " + tag);
        }

    }
    
}
