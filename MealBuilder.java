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
public interface MealBuilder {

    public void addSandwich(String sandwich);

    public void addSides(String sides);

    public void addDrink(String drink);

    public void addOffer(String offer);

    public void setPrice(double price);

    public Meal getMeal();

}
