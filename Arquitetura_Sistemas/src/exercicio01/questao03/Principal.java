package exercicio01.questao03;

public class Principal {

	public Principal() {

	}

	public static void main(String[] args) {
		Character personagem;
		
		personagem = new King();
		personagem.setWeapon(new BowAndArrowBehavior());
		personagem.figth();
		
		personagem.setWeapon(new SwordBehavior());
		personagem.figth();	
		
		personagem = new Queen();
		personagem.setWeapon(new KnifeBehavior());
		personagem.figth();
		
		personagem = new Troll();
		personagem.setWeapon(new AxeBehavior());
		personagem.figth();
	}
}
