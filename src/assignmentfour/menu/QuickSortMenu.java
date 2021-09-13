/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentfour.menu;

import assignmentfour.algoprint.BubbleSortAscAndDescPrint;
import assignmentfour.algoprint.QuickSortAscAndDeskPrint;
import assignmentfour.utils.Validation;

/**
 *
 * @author Nasos
 */
public class QuickSortMenu {

    public static void printQuickSortOptions() {
        boolean quit = true;
        while (quit) {
            System.out.println("Quick Sort Options");
            System.out.println("Press 1 For Asc and Desc By Size");
            System.out.println("Press 2 For Asc and Desc By Color");
            System.out.println("Press 3 For Asc and Desc By Fabric ");
            System.out.println("Press 4 For Asc and Desc By Size Color Fabric");
            System.out.println("Press 0 For Exit");
            int x = Validation.checkingIntegers(0, 4);
            switch (x) {
                case 1:
                    printQuiqkSortDeskOrAskBySize();
                    break;
                case 2:
                    printQuiqkSortDeskOrAskByColor();
                    break;
                case 3:
                    printQuiqkSortDeskOrAskByFabric();
                case 4:
                    printQuiqkSortDeskOrAskBySizeColorFabric();
                case 0:
                    quit = false;
            }
        }
    }

    private static void printQuiqkSortDeskOrAskBySize() {
        boolean quit = true;
        while (quit) {
            System.out.println("Press 1 For  Ascending ");
            System.out.println("Press 2 For  Descending");
            boolean choice = Validation.optionsTrueOrFalse();
            if (choice) {
                QuickSortAscAndDeskPrint.printQuickSortAscWithSize();
            } else {
                QuickSortAscAndDeskPrint.printQuickSortDescWithSize();
            }
        }
    }

    private static void printQuiqkSortDeskOrAskByColor() {
        boolean quit = true;
        while (quit) {
            System.out.println("Press 1 For  Ascending ");
            System.out.println("Press 2 For  Descending");
            boolean choice = Validation.optionsTrueOrFalse();
            if (choice) {
                QuickSortAscAndDeskPrint.printQuickSortAscWithColor();
            } else {
                QuickSortAscAndDeskPrint.printQuickSortDescWithColor();
            }
        }
    }

    private static void printQuiqkSortDeskOrAskByFabric() {
        boolean quit = true;
        while (quit) {
            System.out.println("Press 1 For  Ascending ");
            System.out.println("Press 2 For  Descending");
            boolean choice = Validation.optionsTrueOrFalse();
            if (choice) {
                QuickSortAscAndDeskPrint.printQuickSortAscWithFabric();
            } else {
                QuickSortAscAndDeskPrint.printQuickSortDescWithFabric();
            }
        }
    }
    
        private static void printQuiqkSortDeskOrAskBySizeColorFabric() {
        boolean quit = true;
        while (quit) {
            System.out.println("Press 1 For  Ascending ");
            System.out.println("Press 2 For  Descending");
            boolean choice = Validation.optionsTrueOrFalse();
            if (choice) {
                QuickSortAscAndDeskPrint.printQuickSortSizeColorFabricAsc();
            } else {
                QuickSortAscAndDeskPrint.printQuickSortSizeColorFabricDesc();
            }
        }
    }

}
