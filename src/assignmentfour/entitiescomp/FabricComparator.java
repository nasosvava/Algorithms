/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentfour.entitiescomp;

import assignmentfour.entities.TShirt;
import java.util.Comparator;

/**
 *
 * @author Nasos
 */
public class FabricComparator implements Comparator<TShirt> {

    @Override
    public int compare(TShirt o1, TShirt o2) {
        return o1.getFabric().compareTo(o2.getFabric());
    }
    
}
