/**
 * 
 */
package br.com.webeder.aula10.model;

/**
 * @author instrutor
 * 
 */
public class Computador extends EletroEletronico {
	private String processador;
	private boolean hd;

	public Computador() {
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
	 */
	public Computador(float preco, String nome, int voltagem, int watts,
			boolean bivolt, Modelo modelo, String processador, boolean hd) {
		super(preco, nome, voltagem, watts, bivolt, modelo);
		this.processador = processador;
		this.hd = hd;
	}


	/**
	 * @return the processador
	 */
	public String getProcessador() {
		return processador;
	}

	/**
	 * @param processador
	 *            the processador to set
	 */
	public void setProcessador(String processador) {
		this.processador = processador;
	}

	/**
	 * @return the hd
	 */
	public boolean isHd() {
		return hd;
	}

	/**
	 * @param hd
	 *            the hd to set
	 */
	public void setHd(boolean hd) {
		this.hd = hd;
	}

}
