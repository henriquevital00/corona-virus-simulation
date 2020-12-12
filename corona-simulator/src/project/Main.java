/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

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
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter with the number of health people: ");
        int healthPeople = in.nextInt();
        System.out.print("\nEnter with the number of sick people: ");
        int sickPeople = in.nextInt(); 
        System.out.println("");
        
        Virus virus = new Virus(0);
        Mundo mundo = new Mundo();
        mundo.createHospital();
        mundo.createMap();
        mundo.setPeople(healthPeople, sickPeople);
        while(true) {
            mundo.desenhaMundo(time);
            mundo.changePosition();
            mundo.colision();
            mundo.updateMorte();
            mundo.checkIfDie();
            time++;
            if (mundo.getHealthPeople() == 0){
                System.out.println("Finishing Simulation...");
                System.out.println("All health people was infected");
            }
            else if (mundo.getSickPeople() == 0){
                System.out.println("Finishing Simulation...");
                System.out.println("All health sick was heal");
            }
            else if (mundo.getHealthPeople() + mundo.getSickPeople() == 0){
                System.out.println("Finishing Simulation...");
                System.out.println("All people died");
            }
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
