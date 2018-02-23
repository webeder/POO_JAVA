/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.webeder.aula9;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author epquadros
 */
public class lista {
 
    public static void main(String[] args) {
   // List<String> lista = new ArrayList<String>();
     List<Object> lista = new ArrayList<>(); //mais curto  COLOQUE OBJETO NO ARRAY 
  //  List lista = new ArrayList(); // Isso surge em Java 5 e posterior se você estiver usando coleções sem especificadores de tipo
  //  lista.add("Manoel");
  //  lista.add("Joaquim");
  //  lista.add("Maria");
  /* System.out.println("Dados do tamanho: "+  lista.size());
       System.out.println("Dados do arraylist: "+lista);
       
       for (int i = 0; i < lista.size(); i++) {
           System.out.println("Lista: "+  lista.get(i));
          // código não muito útil....
    }*/
   
 
    
    
     ContaCorrente c1 = new ContaCorrente();
     c1.setNome("Eder");
     c1.setValor(16);
     
     ContaCorrente c2 = new ContaCorrente();
     c2.setNome("Rosalia");
     c2.setValor(15);
     
     
   
    lista.add(c1);
    lista.add(c2);
   
      // System.out.println("Dados do tamanho: "+  lista.size());
      // System.out.println("Dados do arraylist: "+lista);
       
       for (int i = 0; i < lista.size(); i++) {
              /***********FAZ UM CAST CONVERSÃO O ARRAYLIST EM OBJETOS POSIÇÃO ****/
             ContaCorrente cc = (ContaCorrente) lista.get(i);
              System.out.println(cc.getNome());
              System.out.println(cc.getValor());
                   
            
// System.out.println("Lista: "+  lista.get(i)); // MODO SIMPLES SOMENTE PARA NOME 
          // código não muito útil....
    }
    }
}


/*Há ainda outros métodos, como remove() que recebe um objeto que se deseja remover da lista; e contains(), 
que recebe um objeto como argumento e devolve true ou false, indicando se o elemento está ou não na lista.
*
*Neste caso, o acesso através do método get(int) é muito rápido. Caso contrário, percorrer uma lista usando 
um for como esse que acabamos de ver, pode ser desastroso. Ao percorrermos uma lista, devemos usar sempre um 
Iterator ou enhanced for, como veremos.


fonte : https://www.caelum.com.br/apostila-java-orientacao-objetos/collections-framework/#ordenao-collectionssort

*/