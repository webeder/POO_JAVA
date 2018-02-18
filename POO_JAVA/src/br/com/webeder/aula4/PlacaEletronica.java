/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.webeder.aula4;

/**
 *
 * @author RO
 */
public class PlacaEletronica extends Circuito{
     private boolean ligado;
     

//construtor 
    public PlacaEletronica(boolean ligado) {
        this.ligado = ligado;
      
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
 // não tem getLigado e sim isLigado 
        public boolean isLigado() {
        return ligado;
    }
    
 
}
