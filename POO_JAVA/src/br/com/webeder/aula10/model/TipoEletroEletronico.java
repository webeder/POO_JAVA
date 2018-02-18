package br.com.webeder.aula10.model;

public enum TipoEletroEletronico { // enumerado 

	HOME(1f,1800f), WORK(1f,2400f), LAZER(1f,1000f);
	
	/**
	 * @param precoMinimo
	 * @param precoMximo
	 */
	private TipoEletroEletronico(float precoMinimo, float precoMximo) {
		this.precoMinimo = precoMinimo;
		this.precoMaximo = precoMximo;

	}
	private float precoMinimo;
	private float precoMaximo;
	/**
	 * @return the precoMinimo
	 */
	public float getPrecoMinimo() {
		return precoMinimo;
	}
	/**
	 * @param precoMinimo the precoMinimo to set
	 */
	public void setPrecoMinimo(float precoMinimo) {
		this.precoMinimo = precoMinimo;
	}
	/**
	 * @return the precoMximo
	 */
	public float getPrecoMaximo() {
		return precoMaximo;
	}
	/**
	 * @param precoMximo the precoMximo to set
	 */
	public void setPrecoMaximo(float precoMaximo) {
		this.precoMaximo = precoMaximo;
	}
	
	
}
