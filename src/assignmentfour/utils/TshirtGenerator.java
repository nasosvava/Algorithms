/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentfour.utils;

import assignmentfour.entities.Color;
import assignmentfour.entities.Fabric;
import assignmentfour.entities.Size;
import assignmentfour.entities.TShirt;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Nasos
 */
public class TshirtGenerator {

    public  List<TShirt> getTShirts(int num) {
        List<TShirt> tshirts = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            TShirt t = new TShirt(
                    "tshirt" + (i + 1), 
                    new Random().nextInt(5) + 20.0, 
                    Color.values()[new Random().nextInt(Color.values().length)],
                    Size.values()[new Random().nextInt(Size.values().length)],                     
                    Fabric.values()[new Random().nextInt(Fabric.values().length)]);
            tshirts.add(t);
        }
        return tshirts;
    }
    
    
}
