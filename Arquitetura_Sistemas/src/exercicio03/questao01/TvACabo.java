package exercicio03.questao01;

public class TvACabo implements TipoProduto{

    private String descricaoDoProduto;
    private String preco;
    private String quantidadeDeCanais;

    public TvACabo(){
    	this.descricaoDoProduto = "TV a Cabo";
    	this.preco = "50.00";
    	this.quantidadeDeCanais = "20"; 
    }
    
    public void imprimir() {
        System.out.println("Descrição do Produto: " + this.descricaoDoProduto);
        System.out.println("Valor do Produto: " + this.preco);
        System.out.println("Quantidade de Canais " + this.quantidadeDeCanais);
    }
}
