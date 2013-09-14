/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio02.questao03;

import java.util.ArrayList;
/**
 *
 * @author edgardcardoso
 */
public class Americanas implements ControladorDeBusca {
    
    ArrayList resultado = new ArrayList();
    
    
     public ArrayList executarBusca(){
         //Pega os argumento e faz alguma busca no banco 
         //de dados
    	 this.resultado.add("Produto 1 - R$ 33.00");
    	 this.resultado.add("Produto 2 - R$ 55.00");
    	 this.resultado.add("Produto 3 - R$ 66.00");
    	 this.resultado.add("Produto 4 - R$ 11.00");
         
         return this.resultado;
     }
    
}
