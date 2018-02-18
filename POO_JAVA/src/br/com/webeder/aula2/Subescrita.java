/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.webeder.aula2;

/**
 *
 * @author webeder
 */
public class Subescrita {
     public static void main(String[] args) {
        
System.out.println("=================================================");
System.out.println("SUBESCRITA DE MÉTODOS");        
System.out.println("================================================="); 

         //aqui eu passo os valores direto no construtor 
         Cliente cli = new Cliente(23, "", "Rosalia", 10);
         
         System.out.println("tudo: "+cli.getTudo());
         
        
           Cliente c = new Cliente();
           c.setCodigoCliente(2299); 
           c.setNome("webeder");
           c.setIdade(10);
System.out.println(""+ c.getCodigoCliente());
         
         System.out.println(""+ c.getTudo()); 
         
      //   c.codigoCliente = 2299;
         // aqui ele subescreve o método nome 
        // c.nome = "Rosalia";
         
   
         
       ////  System.out.println(""+c.nome);
      //    System.out.println("\n"+c.getTudo());
    }
    
}
// fonte de referencia:  https://www.youtube.com/watch?v=aRxwfC5LkyU 
