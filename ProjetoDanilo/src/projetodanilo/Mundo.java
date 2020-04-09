/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetodanilo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author henri
 */
public class Mundo {
    private ArrayList<PessoaSaudavel> saudaveis;
    private ArrayList<PessoaDoente> doentes;
    private ArrayList<Hospital> hospitais;
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
    public int[][] mapa = {
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
        for (int i=0; i< mapa.length; i++){
            worldMap[i] = mapa[i].clone();
        }
    }
    
    public void createHospital(){
        hospitais = generateHospitalObjects(hospitais);
        for (int i=0; i<hospitais.size(); i++){
            mapa[hospitais.get(i).getX()][hospitais.get(i).getY()] = hospitais.get(i).getCor();
        }
    }
    
    public Boolean checkHospital(int x, int y){
        for (int i=0; i<hospitais.size(); i++){
            if (x == hospitais.get(i).getX() && y == hospitais.get(i).getY()){
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

    public void setPeople(int saudavel, int doente){
        for (int i=0; i<saudavel; i++){
            saudaveis.add(new PessoaSaudavel(5, mapa));
            worldMap[saudaveis.get(i).getX()][saudaveis.get(i).getY()] = saudaveis.get(i).getCor();
        }
        for (int i=0; i<doente; i++){
            virus = new Virus(0);
            doentes.add(new PessoaDoente(6, mapa, virus));
            worldMap[doentes.get(i).getX()][doentes.get(i).getY()] = doentes.get(i).getCor();
        }
    }
    
    public void changePosition(){
        createMap();
        for (int i=0; i<saudaveis.size(); i++){
            int x = saudaveis.get(i).getX();
            int y = saudaveis.get(i).getY();
            int vetor[] = saudaveis.get(i).mover(x, y);
            saudaveis.get(i).setX(vetor[0]);
            saudaveis.get(i).setY(vetor[1]);
            worldMap[saudaveis.get(i).getX()][saudaveis.get(i).getY()] = 5;
        }
        for (int i=0; i<doentes.size(); i++){
            int x = doentes.get(i).getX();
            int y = doentes.get(i).getY();
            int vetor[] = doentes.get(i).mover(x, y);
            doentes.get(i).setX(vetor[0]);
            doentes.get(i).setY(vetor[1]);
            worldMap[doentes.get(i).getX()][doentes.get(i).getY()] = 6;
        }
    }

    public void colision(){
        for (int i=0; i < doentes.size(); i++){
            int xDoente = doentes.get(i).getX();
            int yDoente = doentes.get(i).getY();
            for (int j=0; j < saudaveis.size(); j++){
                int xSaudavel = saudaveis.get(j).getX();
                int ySaudavel = saudaveis.get(j).getY();
                if (xDoente == xSaudavel && yDoente == ySaudavel){
                    virus = new Virus(0);
                    doentes.add(new PessoaDoente(xSaudavel, ySaudavel, 6, virus));
                    worldMap[xSaudavel][ySaudavel] = 6;
                    saudaveis.remove(j);
                }
            }
            if ( checkHospital(xDoente, yDoente) == true ){
                saudaveis.add(new PessoaSaudavel(xDoente, yDoente, 5));
                doentes.remove(i);
                worldMap[xDoente][yDoente] = 5;
            }
        }
    }
    
    public Mundo() {
        this.saudaveis = new ArrayList<>();
        this.doentes =  new ArrayList<>();
        this.hospitais =  new ArrayList<>();
    }    
    
    public void printInformations(int time){
        int total = saudaveis.size() + doentes.size();
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
        System.out.println("\t\tTempo de Simulação: " + time);
        System.out.printf(ANSI_BLUE_BACKGROUND + " " + ANSI_RESET + ANSI_BLUE + " Saudáveis: " + saudaveis.size() + ANSI_RESET);
        System.out.println("                " + ANSI_PURPLE_BACKGROUND + " " + ANSI_RESET + ANSI_PURPLE + "Doentes: " + doentes.size() + ANSI_RESET);
        System.out.println("Total de pesssoas: " + total);
    }
    
    public void updateMorte(){
        for (int i=0; i < doentes.size(); i++){
            doentes.get(i).virus.updateTimeToDie();
        }
    }
    
    public void checkIfDie(){
        Iterator<PessoaDoente> itr = doentes.iterator();
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

