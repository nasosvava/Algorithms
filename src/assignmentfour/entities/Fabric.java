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
public enum Fabric {
    WOOL, COTTON, POLYESTER, RAYON, LINEN, CASHMERE, SILK;

    public static Fabric randomFabric() {

        int program = new Random().nextInt(
                Fabric.values().length);

        return Fabric.values()[program];
    }

}
