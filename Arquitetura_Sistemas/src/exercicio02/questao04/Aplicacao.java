package exercicio02.questao04;

public class Aplicacao {
	
	Command obj;
	
	public void setAplicacao(Command command){
		this.obj = command;
	}
	
	public void executar(){
		this.obj.executar();
	}
}
