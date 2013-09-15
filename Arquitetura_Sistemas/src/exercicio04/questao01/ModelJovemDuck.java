package exercicio04.questao01;

public class ModelJovemDuck extends Duck {

	public ModelJovemDuck() {
		this.flyBehavior = new FlyWithWings();
		this.quackBehavior = new Squesk();
	}

	public void display() {
		System.out.println("Eu sou um modelo Jovem de Pato!");	
		this.flyBehavior.fly();
		this.quackBehavior.quack();
	}
}
