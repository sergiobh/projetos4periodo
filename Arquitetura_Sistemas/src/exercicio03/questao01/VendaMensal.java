package exercicio03.questao01;

public class VendaMensal implements Venda{

	private String TipoVenda;
	
	public VendaMensal(){
		this.TipoVenda = "Mensal";
	}
	
	public void executarVenda(){
		System.out.println("Executa op��o de compra com " + this.TipoVenda);
	}
}
