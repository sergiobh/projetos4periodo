package exercicio03.questao02;

public class Seguro implements ISeguro {

	public Seguro() {
		
	}

	@Override
	public void fazerSeguroDeVida() {
		System.out.println("fazerSeguroDeVida");
	}

	@Override
	public void fazerSeguroDeAutomovel() {
		System.out.println("fazerSeguroDeAutomovel");
	}

	@Override
	public void fazerSeguroResidencial() {
		System.out.println("fazerSeguroResidencial");
	}

	@Override
	public void fazerSeguroEstudantil() {
		System.out.println("fazerSeguroEstudantil");
	}

}
