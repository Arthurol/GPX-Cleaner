/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GPXCleaner.Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author labccet
 */
public class Trilha {

    private String nome;
    private final List<Segmento> segmentos;
    
    public Trilha(String nome){
        this.nome = nome;
        this.segmentos = new ArrayList<Segmento>();
    }
    
    public Trilha(){
        this("");
    }
    
    public void adicionaSegmento(Segmento segmento){
        this.segmentos.add(segmento);
    }
    
    public Segmento adicionaSegmento(){
        Segmento segmento = new Segmento();
        segmentos.add(segmento);
        return segmento;
    }
    
    public Segmento pegaSegmentoIndice(int indice){
        return segmentos.get(indice);
    }
    
    public void removeSegmento(int indice){
        segmentos.remove(indice);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int contaSegmentos(){
        return segmentos.size();
    }
    
    public Iterable<Segmento> getSegmentos(){
        return segmentos;
    } 
}
