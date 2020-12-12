/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author henri
 */
public class Mundo {
    private ArrayList<PessoaSaudavel> health;
    private ArrayList<PessoaDoente> sick;
    private ArrayList<Hospital> hospitals;
    public Virus virus;
    private static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    private static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    private static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    private static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    private static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    private static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    private static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    private static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    private static final String ANSI_MAGENTA_BACKGROUND =  "\u001b[45m";
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public int[][] map = {
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
    };
    public int[][] worldMap = new int[30][60];
    

    
    
    public void createMap(){
        for (int i=0; i< map.length; i++){
            worldMap[i] = map[i].clone();
        }
    }
    
    public void createHospital(){
        hospitals = generateHospitalObjects(hospitals);
        for (int i=0; i<hospitals.size(); i++){
            map[hospitals.get(i).getX()][hospitals.get(i).getY()] = hospitals.get(i).getCor();
        }
    }
    
    public Boolean checkHospital(int x, int y){
        for (int i=0; i<hospitals.size(); i++){
            if (x == hospitals.get(i).getX() && y == hospitals.get(i).getY()){
                return true;
            }
        }
        return false;
    }

    public ArrayList<Hospital> generateHospitalObjects(ArrayList<Hospital> array){
        
        for(int i =7, j=23; i <= 11 && j<=27; i++, j++){
            for (int y1=7, y2=46, y3=24; y1 <=11 && y2 <=50 && y3<=28; y1++, y2++, y3++){
                array.add(new Hospital(i, y1, 2));
                array.add(new Hospital(i, y2, 3));
                array.add(new Hospital(j, y3, 4));
            }
        }
        
        for(int i=0; i<array.size(); i++){
            int x = array.get(i).getX();
            int y = array.get(i).getY();
            if( ((x >=8 && x <=10 && (y==9 || y==48)) || (x == 9 && (y == 8 || y == 10 || y == 47 || y ==49))) || ((x >=24 && x <=26 && (y==26))|| x==25 && (y == 25 || y == 27) ) ){
                array.get(i).setCor(7);
            }
        }
        return array;
    }

    public void setPeople(int healthPeople, int sickPeople){
        for (int i=0; i<healthPeople; i++){
            health.add(new PessoaSaudavel(5, map));
            worldMap[health.get(i).getX()][health.get(i).getY()] = health.get(i).getCor();
        }
        for (int i=0; i<sickPeople; i++){
            virus = new Virus(0);
            sick.add(new PessoaDoente(6, map, virus));
            worldMap[sick.get(i).getX()][sick.get(i).getY()] = sick.get(i).getCor();
        }
    }
    
    public void changePosition(){
        createMap();
        for (int i=0; i<health.size(); i++){
            int x = health.get(i).getX();
            int y = health.get(i).getY();
            int vetor[] = health.get(i).mover(x, y);
            health.get(i).setX(vetor[0]);
            health.get(i).setY(vetor[1]);
            worldMap[health.get(i).getX()][health.get(i).getY()] = 5;
        }
        for (int i=0; i<sick.size(); i++){
            int x = sick.get(i).getX();
            int y = sick.get(i).getY();
            int vetor[] = sick.get(i).mover(x, y);
            sick.get(i).setX(vetor[0]);
            sick.get(i).setY(vetor[1]);
            worldMap[sick.get(i).getX()][sick.get(i).getY()] = 6;
        }
    }

    public void colision(){
        for (int i=0; i < sick.size(); i++){
            int xSick = sick.get(i).getX();
            int ySick = sick.get(i).getY();
            for (int j=0; j < health.size(); j++){
                int xHealth = health.get(j).getX();
                int yHealth = health.get(j).getY();
                if (xSick == xHealth && ySick == yHealth){
                    virus = new Virus(0);
                    sick.add(new PessoaDoente(xHealth, yHealth, 6, virus));
                    worldMap[xHealth][yHealth] = 6;
                    health.remove(j);
                }
            }
            if ( checkHospital(xSick, ySick) == true ){
                health.add(new PessoaSaudavel(xSick, ySick, 5));
                sick.remove(i);
                worldMap[xSick][ySick] = 5;
            }
        }
    }
    
    public Mundo() {
        this.health = new ArrayList<>();
        this.sick =  new ArrayList<>();
        this.hospitals =  new ArrayList<>();
    }    
    
    public void printInformations(int time){
        int total = health.size() + sick.size();
        System.out.println("===================================================================================================================");
        System.out.println(ANSI_RESET + ANSI_GREEN + " .d8888b.  .d88888b. 8888888b.  .d88888b. 888b    888       d8888888     88888888888888888b. 888     888 .d8888b.  ");
        System.out.println(ANSI_GREEN + "d88P  Y88bd88P\" \"Y88b888   Y88bd88P\" \"Y88b8888b   888      d88888888     888  888  888   Y88b888     888d88P  Y88b ");
        System.out.println(ANSI_GREEN + "888    888888     888888    888888     88888888b  888     d88P888888     888  888  888    888888     888Y88b.      ");
        System.out.println(ANSI_GREEN + "888       888     888888   d88P888     888888Y88b 888    d88P 888Y88b   d88P  888  888   d88P888     888 \"Y888b.   ");
        System.out.println(ANSI_GREEN + "888       888     8888888888P\" 888     888888 Y88b888   d88P  888 Y88b d88P   888  8888888P\" 888     888    \"Y88b. ");
        System.out.println(ANSI_GREEN + "888    888888     888888 T88b  888     888888  Y88888  d88P   888  Y88o88P    888  888 T88b  888     888      \"888 ");
        System.out.println(ANSI_GREEN + "Y88b  d88PY88b. .d88P888  T88b Y88b. .d88P888   Y8888 d8888888888   Y888P     888  888  T88b Y88b. .d88PY88b  d88P ");
        System.out.println(ANSI_GREEN + " \"Y8888P\"  \"Y88888P\" 888   T88b \"Y88888P\" 888    Y888d88P     888    Y8P    8888888888   T88b \"Y88888P\"  \"Y8888P\"  " + ANSI_RESET);
        System.out.println("===================================================================================================================");
        System.out.println("\t\tSimulation time: " + time);
        System.out.printf(ANSI_BLUE_BACKGROUND + " " + ANSI_RESET + ANSI_BLUE + " Health: " + health.size() + ANSI_RESET);
        System.out.println("                " + ANSI_PURPLE_BACKGROUND + " " + ANSI_RESET + ANSI_PURPLE + "Sick: " + sick.size() + ANSI_RESET);
        System.out.println("Total people: " + total);
    }
    
    public int getHealthPeople(){
        return health.size();
    }
    
    public int getSickPeople(){
        return sick.size();
    }
    
    public void updateMorte(){
        for (int i=0; i < sick.size(); i++){
            sick.get(i).virus.updateTimeToDie();
        }
    }
    
    public void checkIfDie(){
        Iterator<PessoaDoente> itr = sick.iterator();
        while (itr.hasNext()) {
            PessoaDoente obj = itr.next();
            if (obj.getTimeToDie() == 30) {
                itr.remove();
            }
        }
    }
    
    public void desenhaMundo(int time){
        printInformations(time);
        for (int i=0; i< worldMap.length; i++) {
            for (int j = 0; j < worldMap[i].length; j++) {
                switch (worldMap[i][j]) {
                    case 0:
                        System.out.printf(ANSI_WHITE_BACKGROUND + " ");
                        break;
                    case 1:
                        System.out.printf(ANSI_CYAN_BACKGROUND + " ");
                        break;
                    case 2:
                        System.out.printf(ANSI_RED_BACKGROUND + " ");
                        break;
                    case 3:
                        System.out.printf(ANSI_GREEN_BACKGROUND + " ");
                        break;
                    case 4:
                        System.out.printf(ANSI_YELLOW_BACKGROUND + " ");
                        break;
                    case 5:
                        System.out.printf(ANSI_BLUE_BACKGROUND + " ");
                        break;
                    case 6:
                        System.out.printf(ANSI_PURPLE_BACKGROUND + " ");
                        break;
                    default:
                        System.out.printf(ANSI_MAGENTA_BACKGROUND + " ");
                        break;
                }
            }
            System.out.println("");
        }
    }
}

