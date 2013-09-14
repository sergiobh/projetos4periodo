package exercicio03.questao02;

public class Conta implements IConta {

	public Conta() {

	}

	@Override
	public void sacar(double valor) {
		System.out.println("sacar");
	}

	@Override
	public void imprimirSaldo() {
		System.out.println("imprimirSaldo");
	}

	@Override
	public void transferirDinheiro() {
		System.out.println("transferirDinheiro");
	}

	@Override
	public void pagarConta() {
		System.out.println("pagarConta");
	}

	@Override
	public void abrirConta() {
		System.out.println("abrirConta");
	}

	@Override
	public void fazerPlanoDeCaptalizacao() {
		System.out.println("fazerPlanoDeCaptalizacao");
	}

	@Override
	public void imprimirExtrato() {
		// TODO Auto-generated method stub

	}

	@Override
	public void fecharConta() {
		// TODO Auto-generated method stub

	}

	@Override
	public void imprimirFolhaDeChque() {
		// TODO Auto-generated method stub

	}

	@Override
	public void fazerPedidoDeCartaoDeCredito() {
		// TODO Auto-generated method stub

	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub

	}

}
