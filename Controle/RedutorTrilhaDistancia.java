/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GPXCleaner.Controle;
import GPXCleaner.Modelo.Trilha;
import GPXCleaner.Modelo.Segmento;
import GPXCleaner.Modelo.Ponto;
import java.util.List;
/**
 *
 * @author Arthur
 */
public class RedutorTrilhaDistancia {
    public Trilha executa(Trilha trilha, double distanciaMaxima){
       
       Trilha trilhaUnica = juntaSegmentosTrilha(trilha);
      
        calculaErroRemocaoPontos(trilha);
        
        //Selecione o ponto com	a menor distância de remoção
        
        //Enquanto a distância de remoção do ponto for menor do que a distância máxima que foi recebida como parâmetro,	…	
        //Remova o ponto
        //Se o ponto anterior a ele não for o extremo da trilha, recalcule sua	distância de remoção	
        //Se o	ponto posterior	a ele não for o	extremo	da trilha, recalcule sua distância de remoção
        //Volte	para o passo 3
        return null;
    }
    private Trilha juntaSegmentosTrilha(Trilha trilha){
        Trilha novaTrilha = new Trilha();
        Segmento novoSegmento = new Segmento();
        for (Segmento segmento : trilha.getSegmentos()){
            for (Ponto ponto : segmento.getPontos()){
                novoSegmento.adicionarPonto(ponto);
            }
        }
        novaTrilha.adicionaSegmento(novoSegmento);
        return novaTrilha;
        /*while(!trilha.segmentos.isEmpty()){
        novoSegmento.adicionaPonto(trilha.segmentos.);
        
        }*/
    }
    
    /*
     Calcula o erro de remoção de cada ponto  da trilha recebida
     */
    private void calculaErroRemocaoPontos(Trilha trilhaUnica){ 
       Segmento segmento = trilhaUnica.pegaSegmentoIndice(0);
       int quantidadePontos = segmento.contaPontos();
       
               
       for(int i = 1; i < quantidadePontos - 1; i++){
            Ponto pontoAnterior = segmento .pegaPontoIndice(i - 1);
            Ponto pontoAtual = segmento .pegaPontoIndice(i);
            Ponto pontoPosterior = segmento .pegaPontoIndice(i + 1);
            
            double erro = calculaErroRemocao(pontoAnterior, pontoAtual, pontoPosterior);
            pontoAtual.setErroRemocao(erro);
       }
       
    }
    
    private double calculaErroRemocao(Ponto anterior, Ponto atual, Ponto posterior){
        return 0.0;
    }
}
