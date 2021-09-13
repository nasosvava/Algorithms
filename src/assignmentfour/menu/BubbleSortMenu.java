/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentfour.menu;

import assignmentfour.algoprint.BubbleSortAscAndDescPrint;
import assignmentfour.utils.Validation;

/**
 *
 * @author Nasos
 */
public class BubbleSortMenu {

    public static void printBubbleSortOptions() {
        boolean quit = true;
        while (quit) {
            System.out.println("Bubble Sort Options");
            System.out.println("Press 1 For Asc and Desc By Size");
            System.out.println("Press 2 For Asc and Desc By Color");
            System.out.println("Press 3 For Asc and Desc By Fabric ");
            System.out.println("Press 4 For Asc and Desc By Size Color Fabric");
            System.out.println("Press 0 For Exit");
            int x = Validation.checkingIntegers(0, 4);
            switch (x) {
                case 1:
                    printBubbleSortDescOrAscBySize();
                    break;
                case 2:
                    printBubbleSortDescOrAscByColor();
                    break;
                case 3:
                    printBubbleSortDescOrAscByFabric();
                case 4:
                    printBubbleSortDescOrAscByFabricSizeColor();
                case 0:
                    quit = false;
            }
        }
    }

    private static void printBubbleSortDescOrAscBySize() {
        boolean quit = true;
        while (quit) {
            System.out.println("Press 1 For  Ascending ");
            System.out.println("Press 2 For  Descending");
            boolean choice = Validation.optionsTrueOrFalse();
            if (choice) {
                BubbleSortAscAndDescPrint.printBubbleSortAscBySize();
            } else {
                BubbleSortAscAndDescPrint.printBubbleShortDescBySize();
            }
        }
    }

    private static void printBubbleSortDescOrAscByColor() {
        boolean quit = true;
        while (quit) {
            System.out.println("Press 1 For  Ascending ");
            System.out.println("Press 2 For  Descending");
            boolean choice = Validation.optionsTrueOrFalse();
            if (choice) {
                BubbleSortAscAndDescPrint.printBubbleShortAscByColor();
            } else {
                BubbleSortAscAndDescPrint.printBubbleShortDescByColor();
            }
        }
    }

    private static void printBubbleSortDescOrAscByFabric() {
        boolean quit = true;
        while (quit) {
            System.out.println("Press 1 For  Ascending ");
            System.out.println("Press 2 For  Descending");
            boolean choice = Validation.optionsTrueOrFalse();
            if (choice) {
                BubbleSortAscAndDescPrint.printBubbleShortAscByFabric();
            } else {
                BubbleSortAscAndDescPrint.printBubbleShortDescByFabric();
            }
        }
    }

    private static void printBubbleSortDescOrAscByFabricSizeColor() {
        boolean quit = true;
        while (quit) {
            System.out.println("Press 1 For  Ascending ");
            System.out.println("Press 2 For  Descending");
            boolean choice = Validation.optionsTrueOrFalse();
            if (choice) {
                BubbleSortAscAndDescPrint.printBubbleShortAscByFabricSizeColor();
            } else {
                BubbleSortAscAndDescPrint.printBubbleShortDescByFabricSizeColor();
            }
        }
    }

}
