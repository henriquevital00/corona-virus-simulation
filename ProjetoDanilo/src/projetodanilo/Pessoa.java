/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetodanilo;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author henri
 */
public abstract class Pessoa {
    private int x, y, cor;

    public Pessoa(int cor) {
        this.x = ThreadLocalRandom.current().nextInt(0, 30);
        this.y = ThreadLocalRandom.current().nextInt(0, 60);
        this.cor = cor;
    }

    public Pessoa(int x, int y, int cor) {
        this.x = x;
        this.y = y;
        this.cor = cor;
    }
    
    
    
    
    public abstract int[] mover(int x, int y);

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
