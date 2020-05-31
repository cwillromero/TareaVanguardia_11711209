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
public class JobSeeker implements Observer {

    String name;

    public JobSeeker(String name) {
        this.name = name;
    }

    @Override
    public void update(Subject subject) {
        System.out.println(name + " ha sido notificado: " + subject);
    }

}
