/*
 * TEMOS QUE CONSUMIR UM WEBSERVICES REST QUE OS DEVOLVE UM ARRAY SUPONDO QUE JÁ TEMOS QUANTAS POSIÇOES 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.webeder.aula7;

/**
 *
 * @author WEBEDER 
 */
public class Executa {
    
    
    public static void main(String[] args) {
        
        DiasSemana d = new DiasSemana();
     //   System.out.println(  d.getLetra());
        
        int countexiste = 2;
        
         String[] colunas = new String[8];

                    switch (countexiste) {
                        case 1:
                            colunas[0] = "N"; // NÃO CONSTA 
                            colunas[1] = "A"; // DOMINGO
                            colunas[2] = "A"; // SEGUNDA 
                            colunas[3] = "A"; // TERÇA  
                            colunas[4] = "A"; // QUARTA 
                            colunas[5] = "A"; // QUINTA
                            colunas[6] = "A"; // SEXTA 
                            colunas[7] = "A"; // SABADO
                            break;
                        case 2:
                            colunas[0] = "N";
                            colunas[1] = "A";
                            colunas[2] = "B";
                            colunas[3] = "A";
                            colunas[4] = "B";
                            colunas[5] = "A";
                            colunas[6] = "B";
                            colunas[7] = "A";
                            break;
                        case 3:
                            colunas[0] = "A";
                            colunas[1] = "B";
                            colunas[2] = "C";
                            colunas[3] = "A";
                            colunas[4] = "B";
                            colunas[5] = "C";
                            colunas[6] = "A";
                            break;
                        case 4:
                            colunas[0] = "A";
                            colunas[1] = "B";
                            colunas[2] = "C";
                            colunas[3] = "D";
                            colunas[4] = "A";
                            colunas[5] = "B";
                            colunas[6] = "C";
                            break;
                        case 5:
                            colunas[0] = "A";
                            colunas[1] = "B";
                            colunas[2] = "C";
                            colunas[3] = "D";
                            colunas[4] = "E";
                            colunas[5] = "A";
                            colunas[6] = "B";
                            break;
                        case 6:
                            colunas[0] = "A";
                            colunas[1] = "B";
                            colunas[2] = "C";
                            colunas[3] = "D";
                            colunas[4] = "E";
                            colunas[5] = "F";
                            colunas[6] = "D";
                            break;
                        case 7:
                            colunas[0] = "A";
                            colunas[1] = "B";
                            colunas[2] = "C";
                            colunas[3] = "D";
                            colunas[4] = "E";
                            colunas[5] = "F";
                            colunas[6] = "G";
                            break;

                    }

                  
                String ABC = colunas[d.getLetra()];
                System.out.println("HOJE O TREINO É: "+ABC);  
                    
                
                /******************************************************/
                /*OUTRA FORMA SERIA FAZER UM LAÇO PARA PERCORRER OS VALORES MAS NESSE CASO NÃO A MAIS NECESSIDADE! */
                
                  /*  for (int i=1; i<colunas.length;i++){
                         String ABC = colunas[i];
                       
                        if (ABC.equals(dd.getLetra())){
                      System.out.println("HOJE O TREINO É: "+ABC);  
                        }
                        
                    }*/
                    
                  //  for (String vv : colunas) {

                    //    if (2 == d.getLetra()) {
                   //  String  ABC = vv;
                             
                      //  }
                   /// }
        
        
        
    }
    
}
