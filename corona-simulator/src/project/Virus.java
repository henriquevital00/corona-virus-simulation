/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author henri
 */
public class Virus {
    private int timeToDie = 0;

    public Virus(int timeToDie) {
        this.timeToDie = timeToDie;
    }

    public int getTimeToDie() {
        return timeToDie;
    }

    public void setTimeToDie(int timeToDie) {
        this.timeToDie = timeToDie;
    }
    
    public void updateTimeToDie(){
        this.timeToDie += 1;
    }
    
    
}
