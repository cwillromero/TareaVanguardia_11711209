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
public class TareaVanguardia_11711209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("<<<<<<<<<<<<<Tarea - Carlos Wilfredo Romero Maradiaga>>>>>>>>>>>>>>");
        System.out.println("");
        System.out.println("-----------------------------Singleton-----------------------------");
        Singleton A = Singleton.getInstance();
        System.out.println(A.toString());
        System.out.println("");
        System.out.println("------------------------Factory: CarFactory------------------------");
        Car small = new CarFactory().buildCar(CarType.SMALL);
        Car sendan = new CarFactory().buildCar(CarType.SENDAN);
        Car luxury = new CarFactory().buildCar(CarType.LUXURY);
        System.out.println(small.getModel());
        System.out.println(sendan.getModel());
        System.out.println(luxury.getModel());
        System.out.println("");
        System.out.println("------------------Observer: JobSeeker y HeadHunter------------------");
        HeadHunter headHunter = new HeadHunter();
        JobSeeker jobSeeker = new JobSeeker("Carlos");
        headHunter.registerObserver(jobSeeker);
        headHunter.addJob("Plomería en calle La Alameda");
        headHunter.notifyAllObserver();
        System.out.println("");
        System.out.println("---------------------Builder: SanwichMealBulder---------------------");
        MealDirector mealDirector = new MealDirector();
        mealDirector.makeMeal(new SandwichMealBuilder());
        
    }
    
}
