/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.webeder.aula5;

/**
 *
 * @author epquadros
 */
public class ErrosFinally2 {
     public static void main(String[] args) {
                
        int [] a = {1,0,3,4};
        int [] b = {1,2,0}; 
        
        
        
    for (int i=0; i<a.length; i++ ){
        try{
            System.out.println("A "+a[i]+ "/ B " + b[i] + " = " +(a[i]/b[i])); 
          //  System.exit(0);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ERROS!! "+e);  
           // System.exit(0);  // interrompe o codigo e não chega no finally 
        }catch(ArithmeticException e1){
            System.out.println("ERROS 2 !! "+e1.getMessage());  
            e1.getStackTrace();
          //  System.exit(0);
        }
       
        finally{
          System.out.println("Sempre vai ser impresso!");  
        }
       
        
        
    }  
  
}
}