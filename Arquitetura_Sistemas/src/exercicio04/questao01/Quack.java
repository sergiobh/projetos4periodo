package exercicio04.questao01;

public class Quack implements QuackBehavior {

	public Quack() {
		
	}

	@Override
	public void quack() {
		System.out.println("Implementa o pato grasnando: quack!");
	}

}
