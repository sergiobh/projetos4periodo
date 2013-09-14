package exercicio03.questao01;

public class PgtoBoleto implements TipoPagamento {

	private String FormaPgto;
	
	public PgtoBoleto(){
		this.FormaPgto = "Boleto";
	}
	
	public void executarVenda(){
		System.out.println("Executa pagamento com " + this.FormaPgto);
	}
}
