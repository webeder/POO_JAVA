/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.webeder.aula6;

/**
 *
 * @author epquadros
 */
public class CustomizandoMSG extends Exception{
    
    private int a;
    private int b;
    
     public CustomizandoMSG(int a , int b) {
      super();
      
      this.a = a;
      this.b = b;
              
     
     }

    @Override
    public String toString() {
       
         return "Resultado de "+ a +"/"+ b + " não é um inteiro!";
       // return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
     
     
 
    
}
