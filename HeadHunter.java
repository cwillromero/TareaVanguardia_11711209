/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareavanguardia_11711209;

import java.util.ArrayList;
import tareavanguardia_11711209.Observer;

/**
 *
 * @author Usuario
 */
public class HeadHunter implements Subject {

    private ArrayList<String> jobs;
    private ArrayList<Observer> userList;

    HeadHunter() {
        this.jobs = new ArrayList();
        this.userList = new ArrayList();
    }

    @Override
    public void registerObserver(Observer obs) {
        this.userList.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        this.userList.remove(obs);
    }

    @Override
    public void notifyAllObserver() {
        for (Observer obs : userList) {
            obs.update(this);
        }
    }

    public void addJob(String Job) {
        this.jobs.add(Job);
    }

    public ArrayList<String> getJobs() {
        return jobs;
    }

    @Override
    public String toString() {
        return "jobs=" + jobs.toString();
    }

}
