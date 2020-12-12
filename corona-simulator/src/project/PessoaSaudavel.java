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
public class PessoaSaudavel extends Pessoa{
    
    public PessoaSaudavel(int cor, int[][] map) {
        super(cor, map);
    }

    public PessoaSaudavel(int x, int y, int cor) {
        super(x, y, cor);
    }   
}
