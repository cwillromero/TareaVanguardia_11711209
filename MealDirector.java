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
public class MealDirector {

    public MealDirector() {
    }

    public void makeMeal(MealBuilder mealBuilder) {
        mealBuilder.addSandwich("Peruano");
        mealBuilder.addDrink("Pepsi");
        mealBuilder.addOffer("15%");
        mealBuilder.addSides("Nachos");
        mealBuilder.setPrice(98.25);
        System.out.println(mealBuilder.getMeal().toString());
    }
}
