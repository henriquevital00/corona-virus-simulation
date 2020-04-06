/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetodanilo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author henri
 */
public class ProjetoDanilo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int time=0;
        Virus virus = new Virus(0);
        
        Mundo mundo = new Mundo();
        mundo.createMap();
        mundo.setPeople(10, 5);
        while(true) {
            time++;
            mundo.desenhaMundo(time);
            mundo.changePosition();
            mundo.colision();
            //mundo.checkIfDie();
            try {
                Thread.currentThread().sleep(1000); // 1 segundo
            } catch (InterruptedException ex) {
                Logger.getLogger(ProjetoDanilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
