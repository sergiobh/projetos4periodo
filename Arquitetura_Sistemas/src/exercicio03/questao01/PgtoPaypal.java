package exercicio03.questao01;

public class PgtoPaypal implements TipoPagamento {

	private String FormaPgto;
	
	public PgtoPaypal(){
		this.FormaPgto = "Paypal";
	}
	
	public void executarVenda(){
		System.out.println("Executa pagamento com " + this.FormaPgto);
	}
}
