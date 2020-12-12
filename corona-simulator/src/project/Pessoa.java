/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author henri
 */
public abstract class Pessoa {
    private int x, y, cor;

    public Pessoa(int cor, int[][] map) {
        this.x = ThreadLocalRandom.current().nextInt(1, 29);
        this.y = ThreadLocalRandom.current().nextInt(1, 59);
        this.cor = cor;
        
        while(map[x][y] >= 1 && map[x][y] <= 4){
            System.out.println("X: " + this.x + " Y: " + this.y);
            System.out.println("Mapa: " + map[x][y]);
            this.x = ThreadLocalRandom.current().nextInt(1, 29);
            this.y = ThreadLocalRandom.current().nextInt(1, 59);
        }
    }

    public Pessoa(int x, int y, int cor) {
        this.x = x;
        this.y = y;
        this.cor = cor;
    }
    
    public int[] mover(int x, int y) {
        
        int randomXY = ThreadLocalRandom.current().nextInt(1, 5);
        int array[] = new int[2];
        switch(randomXY){
            case 1:
                array[0] += 1;
                array[1] = 0;
                break;
            case 2:
                array[0] -= 1;
                array[1] = 0;
                break;
            case 3:
                array[0] = 0;
                array[1] += 1;
                break;
            case 4:
                array[0] = 0;
                array[1] -= 1;
                break;
        }
        array[0] = x + array[0];
        array[1] = y + array[1];
        return checkMoviment(array);
    }
    
    public int[] checkMoviment(int[] array){
        if (array[0] < 1){
            array[0] = 28;
        }
        else if (array[0] > 28){
            array[0] = 1;
        }
        else if (array[1] < 1){
            array[1] = 58;
        }
        else if (array[1] > 58){
            array[1] = 1;
        }
        return array;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getCor() {
        return cor;
    }

    public void setCor(int cor) {
        this.cor = cor;
    }
    
    
}
