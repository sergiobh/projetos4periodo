/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio02.questao03;

import java.util.ArrayList;

public class Amazon implements ControladorDeBusca {
    
    ArrayList resultado = new ArrayList();
	
     public ArrayList executarBusca(){
         //Pega os argumento e faz alguma busca no banco 
         //de dados

         this.resultado.add("Produto 1 - R$ 32.50");
         this.resultado.add("Produto 2 - R$ 51.00");
         this.resultado.add("Produto 3 - R$ 68.00");
         this.resultado.add("Produto 4 - R$ 14.00");
         
         return this.resultado;
     }
}
