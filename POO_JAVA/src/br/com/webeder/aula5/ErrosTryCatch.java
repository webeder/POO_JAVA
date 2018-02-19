/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.webeder.aula5;

/**
 *
 * @author webeder
 * try,catch , throw e finally treinamento 
 */
public class ErrosTryCatch {
    
    
    public static void main(String[] args) {
      
        try{
            int [] vetor = new int[4];
           
           vetor[5] = 2; 
    
          System.out.println("retorno: ");  
            
        }catch(ArrayIndexOutOfBoundsException e){
                     System.out.println("Aqui deu o erro!"+ e);  
         }
          
         System.out.println("Porem continua a mostrar o restante!");  
        
        
    }
    
 
    
    
    
}
