package exercicio01.questao01.TAD;

public class Principal {

	public Principal() {
		
	}

	public static void main(String[] args) {
		
		System.out.println("Pilha");
		
		Pilha pilha = new Pilha();
		System.out.println(pilha.obterTamanho());
		
		pilha.empilhar("eu");
		System.out.println(pilha.obterTamanho());
		
		pilha.desempilhar();
		System.out.println(pilha.obterTamanho());
		
		pilha.empilhar("eu");
		System.out.println(pilha.obterTamanho());
		
		pilha.eVazia();
		System.out.println(pilha.obterTamanho());
		

		System.out.println("Fila");
		
		Fila fila = new Fila();
		System.out.println(fila.obterTamanho());
		
		fila.enfileirar("eu");
		System.out.println(fila.obterTamanho());
		
		fila.desenfileirar();
		System.out.println(fila.obterTamanho());
		
		fila.enfileirar("eu");
		System.out.println(fila.obterTamanho());
		
		fila.eVazia();
		System.out.println(fila.obterTamanho());
	}
}
