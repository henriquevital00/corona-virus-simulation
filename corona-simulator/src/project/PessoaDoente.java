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
public class PessoaDoente extends Pessoa{
    public Virus virus;
    
    public PessoaDoente(int cor, int[][] map, Virus virus) {
        super(cor, map);
        this.virus = virus;
    }

    public PessoaDoente(int x, int y, int cor, Virus virus) {
        super(x, y, cor);
        this.virus = virus;
    }
    
    public void updateTimeToDie(){
        virus.updateTimeToDie();
    }
    
    public int getTimeToDie(){
        return virus.getTimeToDie();
    }
}
