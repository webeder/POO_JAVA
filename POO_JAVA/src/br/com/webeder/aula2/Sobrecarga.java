/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.webeder.aula2;

/**
 *
 * @author RO
 */
public class Sobrecarga {
    
    
private double valor;

    public Sobrecarga() {
    }


    // TEMOS O MESMO NOME PARA ABOS OS MÉTODOS 
    double somar (double vlr1,double vrl2){
        
        return this.valor =  vlr1 + vrl2;
     
}
     // TEMOS O MESMO NOME PARA ABOS OS MÉTODOS 
        double somar (double vlr1,double vrl2, double vlr3){
        
        return this.valor = vlr1 + vrl2 - vlr3;
       
}
  
}