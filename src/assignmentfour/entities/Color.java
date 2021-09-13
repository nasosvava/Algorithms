/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentfour.entities;

import java.util.Random;

/**
 *
 * @author George
 */
public enum Color {

    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET;



    public static Color randomColor() {

        int temp = new Random().nextInt(
                Color.values().length);

        return Color.values()[temp];
    }


}
