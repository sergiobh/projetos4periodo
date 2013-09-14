package exercicio02.questao01;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Editor Editor = new Editor(new Html());
		Editor.abrirArquivo();
		Editor.salvarArquivo();
		
		Editor.settipoArquivo(new Txt());
		Editor.abrirArquivo();
		Editor.salvarArquivo();

		Editor.settipoArquivo(new Xml());
		Editor.abrirArquivo();
		Editor.salvarArquivo();		
	}

}
