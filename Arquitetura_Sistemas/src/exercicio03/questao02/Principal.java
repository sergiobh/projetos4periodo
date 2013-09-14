package exercicio03.questao02;

public class Principal {

	public Principal() {

	}

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.abrirConta();
		conta.abrirConta();
		conta.fazerPedidoDeCartaoDeCredito();
		conta.fazerPlanoDeCaptalizacao();
		conta.fecharConta();
		conta.imprimirExtrato();
		conta.imprimirFolhaDeChque();
		conta.imprimirSaldo();
		conta.pagarConta();
		conta.sacar(200);
		conta.transferirDinheiro();
		
		Investimento investimento = new Investimento();
		investimento.fazerConsorcio();
		investimento.fazerEmprestimo();
		investimento.fazerFinancialmenteDeCarro();
		investimento.fazerFinanciamenteImobiliario();
		investimento.fazerInvestimentoEmAcoes();
		investimento.fazerInvestimentoEmCDB();
		investimento.fazerInvestimentoEmVGBL();
		investimento.fazerInvestimentoNaPoupanca();
		investimento.fazerPrevidenciaPrivada();
		
		Seguro seguro = new Seguro();
		seguro.fazerSeguroDeAutomovel();
		seguro.fazerSeguroDeVida();
		seguro.fazerSeguroEstudantil();
		seguro.fazerSeguroResidencial();
	}

}
