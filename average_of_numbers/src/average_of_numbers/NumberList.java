/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package average_of_numbers;

import java.util.ArrayList;

/**
 *
 * @author nicod
 */
public class NumberList {

    private ArrayList numbers;
    
    public NumberList() {
        numbers = new ArrayList();
    }
    
    public void add(int number) {
        numbers.add(number);
    }
    
    public double average() {
        return sum() / numbers.size();
    }
    
    public double sum() {
        double sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += (int)(numbers.get(i));
        }
        return sum;
    }
    
}
