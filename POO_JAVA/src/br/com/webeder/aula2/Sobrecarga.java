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
    // TEMOS O MESMO NOME PARA ABOS OS MÉTODOS 
    double somar (double vlr1,double vrl2){
        
        double res = vlr1 + vrl2;
        
        return res;
}
     // TEMOS O MESMO NOME PARA ABOS OS MÉTODOS 
        double somar (double vlr1,double vrl2, double vlr3){
        
        double res = vlr1 + vrl2 - vlr3;
        
        return res;
}
    
    public static void main(String[] args) {
        
System.out.println("=================================================");
System.out.println("SOBRECARGA DE MÉTODOS");        
System.out.println("=================================================");     
        
        Sobrecarga s = new Sobrecarga();
        
   double res =  s.somar(10, 10,10);
        
        System.out.println(res);
       
    }
    
}
