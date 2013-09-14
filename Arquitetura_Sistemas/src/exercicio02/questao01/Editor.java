package exercicio02.questao01;

public class Editor{
    
    TipoArquivo tipoArquivo;
    
    // Construtor que recebe o tipo de arquivo de trabalho
    public Editor(TipoArquivo tipoArquivo){
        this.tipoArquivo = tipoArquivo;
    }
    
    public void settipoArquivo(TipoArquivo tipoArquivo){
    	this.tipoArquivo = tipoArquivo;
    }
    
    // Método para abrir o arquivo dependendo do seu tipo
    public void abrirArquivo(){
    	this.tipoArquivo.abrirArquivo();
    }
    
    // Método para salvar o arquivo dependendo do seu tipo
    public void salvarArquivo(){
            this.tipoArquivo.salvarArquivo();
    }
}
