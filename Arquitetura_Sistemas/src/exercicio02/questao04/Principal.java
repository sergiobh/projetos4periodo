package exercicio02.questao04;

public class Principal {

	public Principal() {

	}

	public static void main(String[] args) {

		Aplicacao aplicacao = new Aplicacao();
		aplicacao.setAplicacao(new Editar());
		aplicacao.executar();
		
		aplicacao.setAplicacao(new Desfazer());
		aplicacao.executar();
	
		aplicacao.setAplicacao(new Refazer());
		aplicacao.executar();
	}

}
