/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentfour.algo;

import assignmentfour.entities.Color;
import assignmentfour.entities.TShirt;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nasos
 */
public class BucketSortByColor {

   

    public static void sort(List<TShirt> list, boolean op) {

        List<List> buckets = new ArrayList<>();

        if (!list.isEmpty()) {

            for (int i = 0; i < Color.values().length; i++) {
                buckets.add(new ArrayList<TShirt>());
            }

            for (int i = 0; i < list.size(); i++) {
                int bucketNo = list.get(i).getSize().ordinal();
                buckets.get(bucketNo).add(list.get(i));
            }
            System.out.println("");
            if (op == true) {
                list.clear();
                for (int i = 0; i < buckets.size(); i++) {
                    list.addAll(buckets.get(i));

                }
            } else {
                list.clear();
                for (int i = (buckets.size() - 1); i >= 0; i--) {
                    list.addAll(buckets.get(i));
                }
            }
        }

    }
}
