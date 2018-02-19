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
public class MinhaException {
    
    public static void main(String[] args){
         
                  
        int [] a = {53,0,3,4};
        int [] b = {3,4,6}; 
        
        
        
        for (int i=0; i<a.length; i++ ){
        try{
            if (a[i] % 2 !=0 ){
              //antes  throw  new Exception("Divisão errada!");
             //depois 
             throw  new CustomizandoMSG(a[1], b[i]);
            }
            System.out.println("A "+a[i]+ "/" + b[i] + " = " +(a[i]/b[i]));  
        }catch(ArithmeticException | ArrayIndexOutOfBoundsException  | CustomizandoMSG e){
            
            System.out.println("ERROS!! "+e);  
            
        }
        /*catch(Exception e){
            System.out.println("ERROS!! "+e);  
        
        }*/
        
        //FONTE: https://www.youtube.com/watch?v=Xt0CpwJT5yY 
        
    }
    
    }
}