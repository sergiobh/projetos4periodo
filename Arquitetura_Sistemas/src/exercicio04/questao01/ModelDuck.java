package exercicio04.questao01;

public class ModelDuck extends Duck {

	public ModelDuck() {
		this.flyBehavior = new FlyNoWay();
		this.quackBehavior = new Quack();
	}

	public void display() {
		System.out.println("Eu sou um modelo de Pato!");	
		this.flyBehavior.fly();
		this.quackBehavior.quack();
	}
}
