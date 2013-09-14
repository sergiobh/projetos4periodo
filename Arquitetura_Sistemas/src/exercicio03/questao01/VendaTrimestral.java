package exercicio03.questao01;

public class VendaTrimestral implements Venda{

	private String TipoVenda;
	
	public VendaTrimestral(){
		this.TipoVenda = "Trimestral";
	}
	
	public void executarVenda(){
		System.out.println("Executa opção de compra com " + this.TipoVenda);
	}
}
