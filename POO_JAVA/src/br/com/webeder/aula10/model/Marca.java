package br.com.webeder.aula10.model;

public class Marca {
	private String nome;
	private String fabricante;

	public Marca() {
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @param nome
	 * @param fabricante
	 */
	public Marca(String nome, String fabricante) {
            /* O super é utilizado para acessar o construtor da classe pai. 
            Se vc tem uma classe "Carro" por exemplo, que herda da classe "Veiculo",
            e quer acessar o construtor da classe Veiculo dentro da classe Carro, vc usa o super(); 
            (Obrigatóriamente a classe
            Veiculo deve ter um construtor sem argumentos, caso não, deve-se passar super(arg1, arg2,..., argN)*/
            
	        super();
		this.nome = nome;
		this.fabricante = fabricante;
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

	/**
	 * @return the fabricante
	 */
	public String getFabricante() {
		return fabricante;
	}

	/**
	 * @param fabricante
	 *            the fabricante to set
	 */
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

}
