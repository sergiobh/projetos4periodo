package exercicio03.questao01;

public class PgtoCredito implements TipoPagamento {

	private String FormaPgto;
	
	public PgtoCredito(){
		this.FormaPgto = "Cr�dito";
	}
	
	public void executarVenda(){
		System.out.println("Executa pagamento com " + this.FormaPgto);
	}
}
