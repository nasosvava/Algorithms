/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentfour.utils;

import assignmentfour.entities.TShirt;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nasos
 */
public class SortUtils {
    
    public List<TShirt> swapTShirtArrayList(List<TShirt> list,
            int x, int y){
        
        TShirt buffer; 
        
        buffer = list.get(y);
        list.set(y, list.get(x));
        list.set(x, buffer);
        
        return list; 
    }  
    
    public void printTshirts(List<TShirt> list){
        for (TShirt tShirt : list) {
            System.out.println(tShirt.toString());
        }
    }
    
    public List<TShirt> createTShirts(int num){
        List<TShirt> list = new ArrayList();
        TshirtGenerator newTshirts = new TshirtGenerator();
        list = newTshirts.getTShirts(num);
        return list;
    }
    
 
}
