package exercicio03.questao01;

public class VendaAnual implements Venda{

	private String TipoVenda;
	
	public VendaAnual(){
		this.TipoVenda = "Anual";
	}
	
	public void executarVenda(){
		System.out.println("Executa op��o de compra com " + this.TipoVenda);
	}
}
