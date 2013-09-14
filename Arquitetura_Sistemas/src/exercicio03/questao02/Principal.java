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
		
		Seguro seguro = new Seguro();
	}

}
