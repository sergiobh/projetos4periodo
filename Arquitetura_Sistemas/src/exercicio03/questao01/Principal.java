package exercicio03.questao01;

public class Principal {

	public static void main(String[] args) {
		
		Principal principal = new Principal();
		principal.executa();
	}

	public void executa(){
		Carrinho carrinho = new Carrinho();
		carrinho.setCarrinho(new Internet(), new PgtoBoleto(), new VendaMensal());
		carrinho.finalizar();
		
		carrinho.setCarrinho(new TvACabo(), new PgtoCredito(), new VendaAnual());
		carrinho.finalizar();
		
		carrinho.setCarrinho(new Internet(), new PgtoPaypal(), new VendaTrimestral());
		carrinho.finalizar();
		
		carrinho.setCarrinho(new Internet(), new PgtoCredito(), new VendaAnual());
		carrinho.finalizar();
		
		carrinho.setCarrinho(new TvACabo(), new PgtoBoleto(), new VendaMensal());
		carrinho.finalizar();
	}
}