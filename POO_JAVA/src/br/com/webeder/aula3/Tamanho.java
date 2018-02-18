/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.webeder.aula3;

/**
 * @author Webeder
 * @link http://www.webeder.com.br 
 *@version 7.1.20
 *Testes de classes
 */  

	public enum Tamanho {

GRANDE(1), MEDIO(2),PEQUENO(3);

/**
 * quanto mais itens internos nas constantes mais constantes definidas teremos
 * Ele consegue pegar o valor na variavel pois o "final int valor" é a referencia do valor exemplo INATIVO(0) 
 */
private final int tamanho; 

Tamanho(int valorOpcao){  // nome da classe vai aqui 
	tamanho = valorOpcao; 
	} 
public int getValorOpcao(){
	   return tamanho;
	  }

}
