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
public abstract class Car {

    CarType model = null;

    //constructor
    public Car(CarType model) {
        this.model = model;
    }

    protected abstract void construct();

    public CarType getModel() {
        return model;
    }

    public void setModel(CarType model) {
        this.model = model;
    }

}
