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
public interface comandos {
    
  // vantagem que obriga a implementar os métodos servindo de modelo para ser usado na classe 
  // comum sendo usado com contante   
    
    public abstract void ligar();
    public abstract void desligar();
    public abstract void voltagem(int x);

    /**
     *
     * @param x int valor do volume
     * @return 
     */
   // public abstract int valume(int x); 
}


/// fonte: https://www.youtube.com/watch?v=-dL8beD12ZI