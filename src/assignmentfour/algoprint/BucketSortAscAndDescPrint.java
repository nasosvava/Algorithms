/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentfour.algoprint;

import assignmentfour.algo.BucketSortByColor;
import assignmentfour.algo.BucketSortByFabric;
import assignmentfour.algo.BucketSortBySize;
import assignmentfour.entities.TShirt;
import assignmentfour.utils.SortUtils;
import java.util.List;

/**
 *
 * @author Nasos
 */
public class BucketSortAscAndDescPrint {

    private static SortUtils util = new SortUtils();
    private static int tShirtNumber = 40;
    private static List<TShirt> tshirtList = util.createTShirts(tShirtNumber);

    public static void printAscByColor() {
        System.out.println("--Ascending By Color--");
        BucketSortByColor.sort(tshirtList, true);
        util.printTshirts(tshirtList);
    }

    public static void printDescByColor() {
        System.out.println("--Descending By Color--");
        BucketSortByColor.sort(tshirtList, false);
        util.printTshirts(tshirtList);
    }

    public static void printAscBySize() {
        System.out.println("--Ascending By Size--");
        BucketSortBySize.sort(tshirtList, true);
        util.printTshirts(tshirtList);
    }

    public static void printDescBySize() {
        System.out.println("--Descending By Size--");
        BucketSortBySize.sort(tshirtList, false);
        util.printTshirts(tshirtList);
    }

    public static void printAscByFabric() {
        System.out.println("--Ascending By Fabric--");
        BucketSortByFabric.sort(tshirtList, true);
        util.printTshirts(tshirtList);
    }

    public static void printDescByFabric() {
        System.out.println("--Descending By Fabric--");
        BucketSortByFabric.sort(tshirtList, false);
        util.printTshirts(tshirtList);
    }

    public static void printAscByFabricSizeColor() {
        System.out.println("--Ascending By Fabric Size Color--");
        BucketSortByFabric.sort(tshirtList, true);
        BucketSortBySize.sort(tshirtList, true);
        BucketSortByColor.sort(tshirtList, true);
        util.printTshirts(tshirtList);
    }

    public static void printDescByFabricSizeColor() {
        System.out.println("--Descending By Fabric Size Color--");
        BucketSortByFabric.sort(tshirtList, false);
        BucketSortBySize.sort(tshirtList, false);
        BucketSortByColor.sort(tshirtList, false);
        util.printTshirts(tshirtList);
    }

}
