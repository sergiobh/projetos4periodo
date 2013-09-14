package exercicio01.questao02;

public class Principal {

	public Principal() {

	}

	public static void main(String[] args) {
		Compra compra = new Compra(new AVista());

		ItemDeCompra itemDeCompra = new ItemDeCompra();
		itemDeCompra.setProduto("Carro");
		itemDeCompra.setQuantidade(1);
		itemDeCompra.setValorUnitario(32000);
		
		System.out.println("Nome do produto: " + itemDeCompra.getProduto());
		System.out.println("Quantidade: " + itemDeCompra.getQuantidade());
		System.out.println("Valor unitário: " + itemDeCompra.getValorUnitario());
		
		compra.AdicionarItemNaCompra(itemDeCompra);
		System.out.println("Valor de Desconto: " + compra.ValorDoDesconto());
	}
}
