/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.webeder.aula2;

/**
 *
 * @author Webeder // HERANÇA 
 */
public class Pessoa {
    
  private String nome;
  private int idade;  

    // construtor vazio 
    public Pessoa() {
    }
    // construtor com métodos obriga na a já passar os argumentos 
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
   
    
}
