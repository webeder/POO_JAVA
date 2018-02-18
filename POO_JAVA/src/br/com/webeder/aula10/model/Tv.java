/**
 * 
 */
package br.com.webeder.aula10.model;

/**
 * @author instructor
 * 
 */
public class Tv extends EletroEletronico { //herança de eletronicos
	private float polegadas;

	public Tv() {
	}
	
	public Tv(float preco, String nome, int voltagem, int watts,
			boolean bivolt, Modelo modelo,float polegadas) {
            // set no construtor os atributos 
		super(preco, nome, voltagem, watts,bivolt, modelo);
		this.polegadas = polegadas;
	
	}
	public float getPolegadas() {
		return polegadas;
	}

	public void setPolegadas(float polegadas) {
		this.polegadas = polegadas;
	}
	
	public void setPreco(float preco) {
		this.preco = preco +(preco *0.20f);
	}

	public void calcularPreco(float preco) {
		super.setPreco((super.getPreco() *1.20f));
	}

	
}
