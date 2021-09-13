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
public enum Size {
    XS, S, M, L, XL, XXL, XXXL;



    public static Size randomSize() {

        int program = new Random().nextInt(
                Size.values().length);

        return Size.values()[program];
    }



}
