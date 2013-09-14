package exercicio03.questao02;

public interface IConta {

	public abstract void sacar(double valor);

	public abstract void imprimirSaldo();

	public abstract void transferirDinheiro();

	public abstract void pagarConta();

	public abstract void abrirConta();

	public abstract void fazerPlanoDeCaptalizacao();

	public abstract void imprimirExtrato();

	public abstract void fecharConta();

	public abstract void imprimirFolhaDeChque();

	public abstract void fazerPedidoDeCartaoDeCredito();

	public abstract void depositar(double valor);

}