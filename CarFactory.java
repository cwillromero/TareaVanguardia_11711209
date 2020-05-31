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
public class CarFactory {

    public static Car buildCar(CarType model) {
        Car car = null;
        if (model == CarType.SMALL) {
            car = new SmallCar();
        }
        if (model == CarType.SENDAN) {
            car = new SendanCar();
        }
        if (model == CarType.LUXURY) {
            car = new LuxuryCar();
        }
        return car;

    }
}
