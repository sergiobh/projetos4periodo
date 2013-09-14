package exercicio02.questao03;

import java.util.ArrayList;

public class Principal {

	public ArrayList resultado = new ArrayList();
	
	public Principal() {
		
	}

	public static void main(String[] args) {
		Principal principal = new Principal();
		principal.executa();
	}
	
	public void executa(){
		Amazon amazon = new Amazon();
		Americanas americanas = new Americanas();
		Submarino submarino = new Submarino();

		this.resultado.add(amazon.executarBusca());
		this.resultado.add(americanas.executarBusca());
		this.resultado.add(submarino.executarBusca());
		
		this.exibeArray();
	}
	
    public void exibeArray(){
		for (int i = 0; i < this.resultado.size(); i++) {
			System.out.println(this.resultado.get(i));
		}
	}
}
