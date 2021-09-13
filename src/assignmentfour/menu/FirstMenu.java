/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentfour.menu;

import assignmentfour.utils.Validation;

/**
 *
 * @author Nasos
 */
public class FirstMenu {
    
    public static void optionsForAlgo(){
        boolean quit= true;
        while(quit){
            System.out.println("Choose the alrogrithm to use.");
            System.out.println("Press 1 For BubbleSort");
            System.out.println("Press 2 For QuickSort");
            System.out.println("Press 3 For BucketSort");
            System.out.println("Press 0 To Exit");
        int x = Validation.checkingIntegers(0, 3);
            switch(x){
                case 1:
                    BubbleSortMenu.printBubbleSortOptions();
                    break;
                case 2:
                    QuickSortMenu.printQuickSortOptions();
                    break;
                case 3:
                    BucketSortMenu.printBucketSortOptions();
                    break;
                case 0:
                    quit=false;
            }
        }
    }

}
