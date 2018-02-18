package br.com.webeder.aula10.model;

public class Modelo {
	private String nome;
	private Marca marca; // é do tipo objeto 

	public Modelo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nome
	 * @param marca
	 */
	public Modelo(String nome, Marca marca) {
		super();
		this.nome = nome;
		this.marca = marca;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

}
