/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentfour.algo;

import assignmentfour.entities.TShirt;
import assignmentfour.utils.SortUtils;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Nasos
 */
public class BubbleSort {
    
    public List<TShirt> sortTShirtArrayList(List<TShirt> tshirt,
            Comparator<TShirt> comparator, int asc){
        
        
        SortUtils allTshirts = new SortUtils();
        boolean isSorted; 

        for(int pass = 0; pass<tshirt.size(); pass++){
            isSorted = true; 

               for(int j=1; j< (tshirt.size() - pass); j++){
                    if(asc==1){
                             if(
                                 comparator.compare(
                                     tshirt.get(j-1), 
                                     tshirt.get(j)
                                 )>0
                                )                                 
                             {                                
                                 allTshirts.swapTShirtArrayList(tshirt, j, j-1);                                  
                                 isSorted = false; 
                             }
                    }else{ 
                             if(
                                 comparator.compare(
                                     tshirt.get(j-1), 
                                     tshirt.get(j)
                                 )<0
                                )
                             {                                 
                                 allTshirts.swapTShirtArrayList(tshirt, j, j-1); 
                                 
                                 isSorted = false; 
                             }
                    }
                }
              if (isSorted)      
                  break;
        }
        return tshirt; 
    }
    

}
