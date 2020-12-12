/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author henri
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int time=0;
        Virus virus = new Virus(0);

        Mundo mundo = new Mundo();
        mundo.createHospital();
        mundo.createMap();
        mundo.setPeople(100, 1);
        while(true) {
            mundo.desenhaMundo(time);
            mundo.changePosition();
            mundo.colision();
            mundo.updateMorte();
            mundo.checkIfDie();
            time++;
            try {
                Thread.currentThread().sleep(1000); // 1 segundo
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
