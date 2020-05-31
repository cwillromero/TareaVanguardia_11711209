/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareavanguardia_11711209;

/**
 *
 * @author Usuario
 */
public class Singleton {

    private static volatile Singleton instance = new Singleton();
    // private constructor

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return "Soy un Singleton.";
    }
}
