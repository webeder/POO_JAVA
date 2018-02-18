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
public class Radio extends PlacaEletronica implements comandos,CaracteresEspeciaisAscII{

    public Radio() {
        super(false);
    }

   
    
    // tem que implementar o metodo do construtor 
    public Radio(boolean ligado) {
        super(ligado);
    }

     /* implementação dos métodos abstratos */
    @Override
    public void desligar() {
        super.setLigado(false);
  
    }
    @Override
   public void ligar() {
        super.setLigado(true);

    }
   
/*
 A DIFERENÇA DO MÉDOTO VOLUME PARA O VOLTAGEM É QUE VOLTAGEM É UMA INTERFACE QUE POR USA VEZ SET NA CLASSE PAI O VALOR 
 JÁ O VALUME É UM MÉTODO LOCAL QUE NÃO ACESSA A CLASSE POIS É SOMEMENTE PARA A CLASSE RADIO  
   
 */   
   
   
    @Override
   public void voltagem(int x) {
        super.setVoltagem(x);

    }
public void valume(int x) {
    
System.out.println("Volume: "+x); 
     //   return x * 5;

    }
}

   

    



    
