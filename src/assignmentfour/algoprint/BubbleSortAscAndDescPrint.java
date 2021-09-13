/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentfour.algoprint;

import assignmentfour.algo.BubbleSort;
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
public class BubbleSortAscAndDescPrint {

    private static SortUtils util = new SortUtils();
    private static int tShirtNumber = 40;
    private static List<TShirt> tshirtList = util.createTShirts(tShirtNumber);
    private static BubbleSort myBubbleSort = new BubbleSort();

    public static void printBubbleSortAscBySize() {
        System.out.println("--Ascending By Size--");
        myBubbleSort.sortTShirtArrayList(tshirtList, new SizeComparator(), 1);
        util.printTshirts(tshirtList);
    }

    public static void printBubbleShortDescBySize() {
        System.out.println("--Descending By Size--");
        myBubbleSort.sortTShirtArrayList(tshirtList, new SizeComparator(), -1);
        util.printTshirts(tshirtList);
    }

    public static void printBubbleShortAscByColor() {
        System.out.println("--Ascending By Color--");
        myBubbleSort.sortTShirtArrayList(tshirtList, new ColorComparator(), 1);
        util.printTshirts(tshirtList);
    }

    public static void printBubbleShortDescByColor() {
        System.out.println("--Descending By Color--");
        myBubbleSort.sortTShirtArrayList(tshirtList, new ColorComparator(), -1);
        util.printTshirts(tshirtList);
    }

    public static void printBubbleShortAscByFabric() {
        System.out.println("--Ascending By Fabric--");
        myBubbleSort.sortTShirtArrayList(tshirtList, new FabricComparator(), 1);
        util.printTshirts(tshirtList);
    }

    public static void printBubbleShortDescByFabric() {
        System.out.println("--Descending By Fabric--");
        myBubbleSort.sortTShirtArrayList(tshirtList, new FabricComparator(), -1);
        util.printTshirts(tshirtList);
    }

    public static void printBubbleShortAscByFabricSizeColor() {
        System.out.println("--Size and Color and Fabric in Ascending--");
        myBubbleSort.sortTShirtArrayList(tshirtList, new TShirtChainedComparator(new FabricComparator(), new ColorComparator(),
                new SizeComparator()), 1);
        util.printTshirts(tshirtList);
    }
    
        public static void printBubbleShortDescByFabricSizeColor() {
        System.out.println("--Size and Color and Fabric in Ascending--");
        myBubbleSort.sortTShirtArrayList(tshirtList, new TShirtChainedComparator(new FabricComparator(), new ColorComparator(),
                new SizeComparator()), -1);
        util.printTshirts(tshirtList);
    }
}
