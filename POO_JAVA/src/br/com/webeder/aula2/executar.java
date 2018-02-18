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
public class executar {
    
    public static void main(String[] args) {
       
           
System.out.println("=================================================");
System.out.println("SOBRECARGA DE MÉTODOS");        
System.out.println("=================================================");     
        
        Sobrecarga s = new Sobrecarga();
        
   double res =  s.somar(10, 10,10);

        System.out.println("resposta: "+res);
}

}