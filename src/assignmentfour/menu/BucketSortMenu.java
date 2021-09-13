/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentfour.menu;

import assignmentfour.algo.BucketSortByColor;
import assignmentfour.algoprint.BucketSortAscAndDescPrint;
import assignmentfour.utils.Validation;

/**
 *
 * @author Nasos
 */
public class BucketSortMenu {

    public static void printBucketSortOptions() {
        boolean quit = true;
        while (quit) {
            System.out.println("Bucket Sort Options");
            System.out.println("Press 1 For Asc and Desc By Size");
            System.out.println("Press 2 For Asc and Desc By Color");
            System.out.println("Press 3 For Asc and Desc By Fabric ");
            System.out.println("Press 4 For Asc and Desc By Size Color Fabric");
            System.out.println("Press 0 For Exit");

            int x = Validation.checkingIntegers(0, 4);
            switch (x) {
                case 1:
                    printBucketSortDescOrAscBySize();
                    break;
                case 2:
                    printBucketSortDescOrAscByColor();
                    break;
                case 3:
                    printBucketSortDescOrAscByFabric();
                case 4:
                    printBucketSortDescOrAscByFabricSizeColor();
                case 0:
                    quit = false;
            }
        }
    }

    private static void printBucketSortDescOrAscBySize() {
        boolean quit = true;
        while (quit) {
            System.out.println("Press 1 For  Ascending ");
            System.out.println("Press 2 For  Descending");
            boolean choice = Validation.optionsTrueOrFalse();
            if (choice) {
                BucketSortAscAndDescPrint.printAscBySize();
            } else {
                BucketSortAscAndDescPrint.printDescBySize();
            }
        }
    }

    private static void printBucketSortDescOrAscByColor() {
        boolean quit = true;
        while (quit) {
            System.out.println("Press 1 For  Ascending ");
            System.out.println("Press 2 For  Descending");
            boolean choice = Validation.optionsTrueOrFalse();
            if (choice) {
                BucketSortAscAndDescPrint.printAscByColor();
            } else {
                BucketSortAscAndDescPrint.printDescByColor();
            }
        }
    }

    private static void printBucketSortDescOrAscByFabric() {
        boolean quit = true;
        while (quit) {
            System.out.println("Press 1 For  Ascending ");
            System.out.println("Press 2 For  Descending");
            boolean choice = Validation.optionsTrueOrFalse();
            if (choice) {
                BucketSortAscAndDescPrint.printAscByFabric();
            } else {
                BucketSortAscAndDescPrint.printDescByFabric();
            }
        }
    }
    
        private static void printBucketSortDescOrAscByFabricSizeColor() {
        boolean quit = true;
        while (quit) {
            System.out.println("Press 1 For  Ascending ");
            System.out.println("Press 2 For  Descending");
            boolean choice = Validation.optionsTrueOrFalse();
            if (choice) {
                BucketSortAscAndDescPrint.printAscByFabricSizeColor();
            } else {
                BucketSortAscAndDescPrint.printDescByFabricSizeColor();
            }
        }
    }
}
