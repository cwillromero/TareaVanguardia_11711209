/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareavanguardia_11711209;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class SandwichMealBuilder implements MealBuilder {

    Meal meal = new Meal();

    @Override
    public void addSandwich(String sandwich) {
        meal.sandwich = sandwich;
    }

    @Override
    public void addSides(String sides) {
        meal.sideOrder = sides;
    }

    @Override
    public void addDrink(String drink) {
        meal.drink = drink;
    }

    @Override
    public void addOffer(String offer) {
        meal.offer = offer;
    }

    @Override
    public void setPrice(double price) {
        meal.price = price;
    }

    @Override
    public Meal getMeal() {
        return meal;
    }

}
