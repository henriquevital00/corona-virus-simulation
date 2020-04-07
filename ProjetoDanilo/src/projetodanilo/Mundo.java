/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetodanilo;

import java.util.ArrayList;
import java.util.Collections;
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
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final int[][] mapa = {
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,3,3,3,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,2,2,0,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,0,3,3,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,2,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,0,0,0,3,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,2,2,0,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,0,3,3,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,3,3,3,0,0,0,0,0,0,0,0,1},
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
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,4,4,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,4,0,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,0,0,0,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,4,0,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,4,4,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
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
        for (int i = 0; i < mapa.length; i++) {
            for (int j=0; j < mapa[i].length; j++){
                switch (mapa[i][j]) {
                    case 2:
                        hospitais.add(new Hospital(i, j, 2));
                        break;
                    case 3:
                        hospitais.add(new Hospital(i, j, 3));
                        break;
                    case 4:
                        hospitais.add(new Hospital(i, j, 4));
                        break;
                    default:
                        break;
                }
            }
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

    public void setPeople(int saudavel, int doente){
        for (int i=0; i<saudavel; i++){
            saudaveis.add(new PessoaSaudavel(5));
            worldMap[saudaveis.get(i).getX()][saudaveis.get(i).getY()] = saudaveis.get(i).getCor();
        }
        for (int i=0; i<doente; i++){
            virus = new Virus(0);
            doentes.add(new PessoaDoente(6, virus));
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
        System.out.println("Tempo de Simulação: " + time);
        System.out.println("Saudaveis: " + saudaveis.size());
        System.out.println("Doentes: " + doentes.size());
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
                if (worldMap[i][j] == 0) {
                    System.out.printf(ANSI_WHITE_BACKGROUND + " ");
                }
                if (worldMap[i][j] == 1) {
                    System.out.printf(ANSI_WHITE_BACKGROUND + " ");
                }
                if (worldMap[i][j] == 2) {
                    System.out.printf(ANSI_RED_BACKGROUND + " ");
                }
                if (worldMap[i][j] == 3) {
                    System.out.printf(ANSI_GREEN_BACKGROUND + " ");
                }
                if (worldMap[i][j] == 4) {
                    System.out.printf(ANSI_YELLOW_BACKGROUND + " ");
                }
                if (worldMap[i][j] == 5) {
                    System.out.printf(ANSI_BLUE_BACKGROUND + " ");
                }
                if (worldMap[i][j] == 6) {
                    System.out.printf(ANSI_PURPLE_BACKGROUND + " ");
                }
            }
            System.out.println("");
        }
    }
}

