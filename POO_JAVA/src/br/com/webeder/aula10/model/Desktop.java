package br.com.webeder.aula10.model;

public class Desktop extends Computador {

	private String partes;

	public Desktop() {
	}
	
	/**
	 * @param preco
	 * @param nome
	 * @param voltagem
	 * @param watts
	 * @param bivolt
	 * @param modelo
	 * @param processador
	 * @param hd
	 * @param partes
	 */
	public Desktop(float preco, String nome, int voltagem, int watts,
			boolean bivolt, Modelo modelo, String processador, boolean hd,
			String partes) {
		super(preco, nome, voltagem, watts, bivolt, modelo, processador, hd);
		this.partes = partes;
	}

	public String getPartes() {
		return partes;
	}

	public void setPartes(String partes) {
		this.partes = partes;
	}

	public void calculaPrecoDesktop() {
		this.setPreco((this.getPreco() + 20 *1.6f));
	}
	
}
