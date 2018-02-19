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
public class Errosthrow {
    
    
    public static void main(String[] args) {
      
           int [] a = {1,2,33,4,66};
        int [] b = {1,0,45,55}; 
        
        
        
    for (int i=0; i<a.length; i++ ){
        try{
            System.out.println("A "+a[i]+ "/ B " + b[i] + " = " +(a[i]/b[i]));  
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ERROS!! "+e);  
        }catch(Throwable e1){
            System.out.println("ERROS 2 !! "+e1);  
        }
      
        
    }    
        /*
       for (int i=0; i<a.length; i++ ){
        try{
            System.out.println("A "+a[i]+ "/ B " + b[i] + " = " +(a[i]/b[i]));  
        }catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("ERROS!! "+e);  
        } 
        }
      */
        
    }    
 
        
        
        
    }
      
     

