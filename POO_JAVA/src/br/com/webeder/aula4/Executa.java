/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.webeder.aula4;

/**
 *
 * @author RO
 */
public class Executa {
    
    public static void main(String[] args) {
        
System.out.println("=================================================");
System.out.println("INTERFACE");        
System.out.println("=================================================");          
        
        Radio r = new Radio();
        //  r.desligar();
        r.ligar();
       
        System.out.println("RESPOSTA DO MÉTODO DA INTERFACE"); 
        System.out.println(r.isLigado() ? "ligado." : "desligado.");
       
              System.out.println("Letra 'µ' da tabela ascii : "+Radio.A_AGUDO_UPPER_CASE );
              
            
        
        r.voltagem(10);
         r.valume(40);
         System.out.println("Voltagem: "+r.getVoltagem());
    }
    
}
