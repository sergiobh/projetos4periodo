package exercicio03.questao01;

public class Carrinho {

	TipoPagamento tipoPagamento;
	TipoProduto tipoProduto;
	Venda venda;
	
	public void setCarrinho(TipoProduto tipoProduto, TipoPagamento tipoPagamento, Venda venda){
		this.tipoProduto = tipoProduto;
		this.tipoPagamento = tipoPagamento;
		this.venda = venda;
	}
	
	public void finalizar(){
		this.tipoProduto.imprimir();
		this.tipoPagamento.executarVenda();
		this.venda.executarVenda();		
		System.out.println("");
	}
}
