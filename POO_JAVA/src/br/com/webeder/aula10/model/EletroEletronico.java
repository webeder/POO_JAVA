package br.com.webeder.aula10.model;

public class EletroEletronico {
	protected float preco;
	private String nome;
	private int voltagem;
	private int watts;
	private boolean bivolt;
	private Modelo modelo; //objeto 
	private TipoEletroEletronico tipoEletroEletronico; //objto 

	/**
	 * @param preco
	 * @param nome
	 * @param voltagem
	 * @param watts
	 * @param bivolt
	 * @param modelo
	 */
	public EletroEletronico(float preco, String nome, int voltagem, int watts,
			boolean bivolt, Modelo modelo) {
		super();
		this.preco = preco;
		this.nome = nome;
		this.voltagem = voltagem;
		this.watts = watts;
		this.bivolt = bivolt;
		this.modelo = modelo;
	}

	
	public EletroEletronico() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the preco
	 */
	public float getPreco() {
		return preco;
	}

	/**
	 * @param preco
	 *            the preco to set
	 */
	public void setPreco(float preco) {
		this.preco = preco;
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
	 * @return the voltagem
	 */
	public int getVoltagem() {
		return voltagem;
	}

	/**
	 * @param voltagem
	 *            the voltagem to set
	 */
	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}

	/**
	 * @return the watts
	 */
	public int getWatts() {
		return watts;
	}

	/**
	 * @param watts
	 *            the watts to set
	 */
	public void setWatts(int watts) {
		this.watts = watts;
	}

	/**
	 * @return the bivolt
	 */
	public boolean isBivolt() {
		return bivolt;
	}

	/**
	 * @param bivolt
	 *            the bivolt to set
	 */
	public void setBivolt(boolean bivolt) {
		this.bivolt = bivolt;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}


	public TipoEletroEletronico getTipoEletroEletronico() {
		return tipoEletroEletronico;
	}


	public void setTipoEletroEletronico(TipoEletroEletronico tipoEletroEletronico) {
		this.tipoEletroEletronico = tipoEletroEletronico;
	}

}
