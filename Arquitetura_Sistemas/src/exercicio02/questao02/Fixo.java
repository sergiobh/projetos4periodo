package exercicio02.questao02;

public class Fixo implements TelefoneFixo{

	public Fixo() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void volumeExcuta() {
		// TODO Auto-generated method stub
		System.out.println("Função alterar Volume da Escuta");
	}
	
	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		System.out.println("Função Tocar");
	}
	
	@Override
	public void realizarChamada() {
		// TODO Auto-generated method stub
		System.out.println("Função Realizar Chamada");
	}
}