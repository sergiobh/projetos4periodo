package exercicio04.questao01;

public class MuteQuack implements QuackBehavior {

	public MuteQuack() {
		
	}

	@Override
	public void quack() {
		System.out.println("N�o fa�a nada, n�o pode grasnar!");
	}

}
