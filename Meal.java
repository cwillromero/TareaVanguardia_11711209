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
class Meal {

    public String sandwich;
    public String sideOrder;
    public String drink;
    public String offer;
    public double price;

    public Meal() {
    }

    @Override
    public String toString() {
        return "Order: " + sandwich + ", " + sideOrder + ", " + drink + ", " + offer + ", " + price;
    }

}
