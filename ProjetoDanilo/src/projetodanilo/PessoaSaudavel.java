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
public class PessoaSaudavel extends Pessoa{
    
    public PessoaSaudavel(int cor) {
        super(cor);
    }

    public PessoaSaudavel(int x, int y, int cor) {
        super(x, y, cor);
    }   
    
    
    @Override
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
        array[1] += y + array[1];
        return checkMoviment(array);
    }
    
    public int[] checkMoviment(int[] array){
        if (array[0] < 0){
            array[0] = 29;
        }
        else if (array[0] > 29){
            array[0] = 0;
        }
        else if (array[1] < 0){
            array[1] = 59;
        }
        else if (array[1] > 59){
            array[1] = 0;
        }
        return array;
    }
}
