/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author labccet
 */
public class Segmento {
    private final List<Ponto> pontos;
    
    public Segmento(){
        this.pontos = new ArrayList<Ponto>();
    }
    
    public void adicionarPonto(double latitude, double longitude, double elevacao, String tempo){
        pontos.add(new Ponto(latitude, longitude, elevacao, tempo));
    }
    
    public void adicionarPonto(Ponto ponto){
        pontos.add(ponto);
    }
    
    public int contapontos(int indice){
        return pontos.size();
    }
    
    public Ponto pegaPontoIndice(int indice){
        return pontos.get(indice);
    }
    
    public void removePonto(int indice){
        pontos.remove(indice);
    }
    
    public Iterable<Ponto> getPontos(){
        return pontos;
    }
}
