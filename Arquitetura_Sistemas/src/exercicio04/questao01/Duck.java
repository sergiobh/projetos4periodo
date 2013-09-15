package exercicio04.questao01;

public abstract class Duck {

	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck() {

	}

	public void setFlyBehavior(FlyBehavior flyBehavior){
		this.flyBehavior = flyBehavior;
	}
	
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
		
	public void performFly(){
		flyBehavior.fly();
	}
	
	public void perfomQuack(){
		quackBehavior.quack();
	}
}
