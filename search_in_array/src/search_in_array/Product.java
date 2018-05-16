/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search_in_array;

import java.util.ArrayList;

/**
 *
 * @author nicod
 */
public class Product {
    private int id;
    private String description;
    private ArrayList<String> tags;
    
    public Product(int id, String description) {
        this.id = id;
        this.description = description;
        tags = new ArrayList();
    }
    
    public String getDescription(){
        return description;
    }
    
    public void addTag(String tag) {
        tags.add(tag);
    }
    
    public boolean hasTag(String tag) {
        for (int i = 0; i < tags.size(); i++) {
            if (tags.get(i).equals(tag)) {
                return true;
            }
        }
        return false;
    }
}
