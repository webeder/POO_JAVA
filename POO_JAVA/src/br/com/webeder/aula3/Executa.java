/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.webeder.aula3;

/**
 *
 * @author RO
 */
public class Executa {
 
    
    public static void main(String[] args) {
        

System.out.println("=================================================");
System.out.println("HERANÇA, INTERFACE CONSTANTE,CLASSE ENUM ");        
System.out.println("=================================================");        
         Cao cc = new Cao();
         cc.setNome("Doki");
         cc.setEmiteSom("Latir");
         cc.setRaça("Maltes");
        
         // PERCORRE OS VALORES DO ENUM 
         System.out.println("Opção do tamanho do cão? \n ");
         for(Tamanho op : Tamanho.values()){
		System.out.print(op + " = " + op.getValorOpcao()+ ", ");
	}
         
       cc.setTamanho(Tamanho.MEDIO);
    
       
                
         System.out.println("\n \n Som do cão: "+cc.getEmiteSom());
         System.out.println("Nome do cão: "+cc.getNome());
         System.out.println("\n \n Site do veterinario: \n"+cc.site_veterinario);

        
        
        
    }
    
   
    
    
    
    
}
