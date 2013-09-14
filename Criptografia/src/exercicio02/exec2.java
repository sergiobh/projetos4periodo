package exercicio02;

public class exec2 {

	String _mensagem_original;
	String _mensagem_cifrada;
	String _mensagem_decifrada;
	String _alfabeto;
	String _chave;
	String[] _chave_array;
	int PosChave;
	
	public exec2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exec2 exec1 	= new exec2();
		exec1.geraCripto();
	}

	public void geraCripto(){
		this._mensagem_original 	= "sendmoremoney";
		
		this._chave					= "9 0 1 7 23 15 21 14 11 11 2 8 9";
		this._chave_array 			= this._chave.split(" ");
		
		this._alfabeto				= "abcdefghijklmnopqrstuvwxyz";
		
		this._mensagem_cifrada		= this.getCifra();
		System.out.println("Exec1 -> Mensagem cifrada: " + this._mensagem_cifrada);
		
		this._mensagem_decifrada	= this.setCifra();
		System.out.println("Exec1 -> Mensagem decifrada: " + this._mensagem_decifrada);
	}
	
	public String getCifra(){
		int indice_letra;
		String mensagem = "";
		this.PosChave	= -1;
		char letra;
		
		//percorra o meu texto claro
		for(int i=0; i < this._mensagem_original.length();i++){
			letra = this._mensagem_original.charAt(i);
	
			indice_letra = (this.getPosicaoAlfabeto(letra) + this.getChave()) % 26;
			mensagem +=  this._alfabeto.charAt(indice_letra);
		}
		return mensagem;
	}

	public String setCifra(){
		int indice_letra;
		String mensagem = "";
		this.PosChave				= -1;
		char letra;
		
		//percorra o meu texto claro
		for(int i=0; i < this._mensagem_cifrada.length();i++){		
			letra = this._mensagem_cifrada.charAt(i);
			
			indice_letra = (this.getPosicaoAlfabeto(letra) - this.getChave() + 26) % 26;
			mensagem +=  this._alfabeto.charAt(indice_letra);
		}
		return mensagem;
	}
	
	public int getPosicaoAlfabeto(char Letra){
		return this._alfabeto.indexOf(Letra);
	}
	
	public int getChave(){

		//int Posicao = 0;
		this.PosChave		= (this.PosChave+1) % this._chave_array.length;
		
		//for(int j=0; j < this._alfabeto.length(); j++){
			//if(Integer.parseInt(this._chave_array[this.PosChave]) == this._alfabeto.charAt(j)){
				
				//Posicao 	= j;
				//break;
			//}
		//}	
		return Integer.parseInt(this._chave_array[this.PosChave]);
	}
}
