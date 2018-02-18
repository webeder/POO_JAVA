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
public class Cao extends Mamifero implements Veterinario{

    public Cao() {
    }
    
    private String raça;
    private Tamanho tamanho; 

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public String getRaça() {
        return raça;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    @Override
    public void setEmiteSom(String emiteSom) {
        super.setEmiteSom(emiteSom); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getEmiteSom() {
        return super.getEmiteSom(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNome() {
        return super.getNome(); //To change body of generated methods, choose Tools | Templates.
    }


   

   
    
}
