/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.webeder.aula2;

/**
 * HERANÇA E SUBESCRITA DE MÉTODO 
 * @author webeder
 */          // sub filho   //super pai  
public class Cliente extends Pessoa{

    private   int codigoCliente;
     String tudo; 

    public Cliente() {
      //vazio
    }

    public Cliente(int codigoCliente, String tudo, String nome, int idade) {
        super(nome, idade);
        this.codigoCliente = codigoCliente;
        this.tudo = tudo;
    }
    
    
    
    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
    /*A sobrescrita (ou override) está diretamente 
     * relacionada à orientação a objetos, mais 
    * especificamente com a herança. 
    */
    
/*  // na classe pessoa tem o médoto idade e
    na classe cliente subescreve o metodo descomente para testar */
    @Override
    public void setIdade(int idade) {
       int var = idade + 2;
        super.setIdade(var); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    @Override
    public int getIdade() {
        return super.getIdade(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNome() {
        return super.getNome(); //To change body of generated methods, choose Tools | Templates.
    }


    public String getTudo(){
         String viraNumero = Integer.toString(getIdade());      
        tudo = getNome() +" - "+ viraNumero;
      //tudo;
        return tudo.toUpperCase();
    }

    
 
  
    
}
