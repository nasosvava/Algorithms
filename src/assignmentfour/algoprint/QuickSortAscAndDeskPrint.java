/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentfour.algoprint;

import assignmentfour.algo.QuickShort;
import assignmentfour.entities.TShirt;
import assignmentfour.entitiescomp.ColorComparator;
import assignmentfour.entitiescomp.FabricComparator;
import assignmentfour.entitiescomp.SizeComparator;
import assignmentfour.utils.SortUtils;
import assignmentfour.entitiescomp.TShirtChainedComparator;
import java.util.List;

/**
 *
 * @author Nasos
 */
public class QuickSortAscAndDeskPrint {

    private static SortUtils util = new SortUtils();
    private static int tShirtNumber = 40;
    private static List<TShirt> tshirtList = util.createTShirts(tShirtNumber);

    public static  void printQuickSortAscWithColor() {
        System.out.println("--Asc with Color--");
        QuickShort.quickSort(tshirtList, 0, tshirtList.size() - 1, new ColorComparator(), true);
        System.out.println("\n");
        util.printTshirts(tshirtList);

    }

    public static void printQuickSortDescWithColor() {
        System.out.println("--Asc with Color--");
        QuickShort.quickSort(tshirtList, 0, tshirtList.size() - 1, new ColorComparator(), false);
        System.out.println("\n");
        util.printTshirts(tshirtList);

    }

    public static void printQuickSortAscWithSize() {
        System.out.println("--Asc with Size--");
        QuickShort.quickSort(tshirtList, 0, tshirtList.size() - 1, new SizeComparator(), true);
        System.out.println("\n");
        util.printTshirts(tshirtList);

    }

    public static void printQuickSortDescWithSize() {
        System.out.println("--Asc with Size--");
        QuickShort.quickSort(tshirtList, 0, tshirtList.size() - 1, new SizeComparator(), false);
        System.out.println("\n");
        util.printTshirts(tshirtList);
    }

    public static void printQuickSortAscWithFabric() {
        System.out.println("--Asc with Size--");
        QuickShort.quickSort(tshirtList, 0, tshirtList.size() - 1, new FabricComparator(), true);
        System.out.println("\n");
        util.printTshirts(tshirtList);

    }

    public static void printQuickSortDescWithFabric() {
        System.out.println("--Asc with Size--");
        QuickShort.quickSort(tshirtList, 0, tshirtList.size() - 1, new FabricComparator(), false);
        System.out.println("\n");
        util.printTshirts(tshirtList);
    }

    public static void printQuickSortSizeColorFabricAsc() {
        System.out.println("--Asc with Size--");
        QuickShort.quickSort(tshirtList, 0, tshirtList.size() - 1, new TShirtChainedComparator(new FabricComparator(), new ColorComparator(),
                new SizeComparator()), true);
        System.out.println("\n");
        util.printTshirts(tshirtList);
    }

    public static void printQuickSortSizeColorFabricDesc() {
        System.out.println("--Asc with Size--");
        QuickShort.quickSort(tshirtList, 0, tshirtList.size() - 1, new TShirtChainedComparator(new FabricComparator(), new ColorComparator(),
                new SizeComparator()), false);
        System.out.println("\n");
        util.printTshirts(tshirtList);
    }

}
