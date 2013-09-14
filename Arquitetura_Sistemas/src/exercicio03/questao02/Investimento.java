package exercicio03.questao02;

public class Investimento implements IInvestimento {

	public Investimento() {
	}

	@Override
	public void fazerInvestimentoEmAcoes() {
		System.out.println("fazerInvestimentoEmAcoes");
	}

	@Override
	public void fazerInvestimentoNaPoupanca() {
		System.out.println("fazerInvestimentoNaPoupanca");
	}

	@Override
	public void fazerInvestimentoEmVGBL() {
		System.out.println("fazerInvestimentoEmVGBL");
	}

	@Override
	public void fazerFinancialmenteDeCarro() {
		System.out.println("fazerFinancialmenteDeCarro");
	}

	@Override
	public void fazerFinanciamenteImobiliario() {
		System.out.println("fazerFinanciamenteImobiliario");
	}

	@Override
	public void fazerPrevidenciaPrivada() {
		System.out.println("fazerPrevidenciaPrivada");
	}

	@Override
	public void fazerEmprestimo() {
		System.out.println("fazerEmprestimo");
	}

	@Override
	public void fazerInvestimentoEmCDB() {
		System.out.println("fazerInvestimentoEmCDB");
	}

	@Override
	public void fazerConsorcio() {
		System.out.println("fazerConsorcio");
	}
}
