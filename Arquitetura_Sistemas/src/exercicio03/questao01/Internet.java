package exercicio03.questao01;

public class Internet implements TipoProduto{

    private String descricaoDoProduto;
    private String preco;
    private String velocidade;

    public Internet(){
    	this.descricaoDoProduto = "Internet";
    	this.preco = "75.00";
    	this.velocidade = "10"; 
    }
    
    public void imprimir() {
        System.out.println("Descrição do Produto: " + this.descricaoDoProduto);
        System.out.println("Valor do Produto: " + this.preco);
        System.out.println("Velocidade " + this.velocidade + " megabyte");
    }
}
