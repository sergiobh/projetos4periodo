package exercicio04.questao01;

public class FlyNoWay implements FlyBehavior {

	public FlyNoWay() {

	}

	@Override
	public void fly() {
		System.out.println("Não faça nada, não pode voar!");
	}

}
