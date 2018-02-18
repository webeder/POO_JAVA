/**
 * 
 */
package br.com.webeder.aula10.apl;

import br.com.webeder.aula10.model.Desktop;
import br.com.webeder.aula10.model.EletroEletronico;
import br.com.webeder.aula10.model.Marca;
import br.com.webeder.aula10.model.Modelo;
import br.com.webeder.aula10.model.TipoEletroEletronico;
import br.com.webeder.aula10.model.Tv;
import com.webeder.aula10.model.unsage.Radio; // serve para testarmos o erro 

/**
 * @author instrutor
 *
 */
public class aplicacao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
            
          System.out.println("=================================================");
          System.out.println("EXEMPLO COMPLETO DOS EXERCÍCIOS");        
          System.out.println("=================================================");   
            
            
            
		// passa direto os argumentos para o construtor da marca
		Marca mar = new Marca("Sony","Zona Franca");
		// passa o objeto direto para o construtor
		Modelo m = new Modelo("Bravia",mar);
		
		EletroEletronico ele = new EletroEletronico(120.50f,"Qualquer",120,35,false,m);
		//System.out.println(ele.getModelo().getMarca().getFabricante());
       //acessa fazendo o get em eletronico + get na marca e get do atributo nome          
		System.out.println("Marca: "+ele.getModelo().getMarca().getNome());

		Tv tv1 = new Tv(120.50f,"BRZ11",120,35,false,m,50f);
		
		System.out.println("TV Preço: "+tv1.getPreco());
		System.out.println("TV fabricante: "+tv1.getModelo().getMarca().getFabricante());
		
		Desktop pc = new Desktop(1500f, "Cassio-Linux", 120, 20, true, m, "I7", true, "Varias");
		pc.setTipoEletroEletronico(TipoEletroEletronico.HOME);
		
		pc.calculaPrecoDesktop();
		
		System.out.println(pc.getPreco() + " Esse pre�o � maior o menor que o Pre�o m�ximo "
		+ pc.getTipoEletroEletronico().getPrecoMaximo());
		
		
		char[] c ={'C','�','s','s','i','o'};
		String s = new String(c);
		
		System.out.println(s);
		
		Radio r = new Radio();
	
	}

}
