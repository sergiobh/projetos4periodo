package exercicio02;

public class exec3 {

	String _mensagem_original;
	String _mensagem_cifrada;
	String _mensagem_decifrada;
	String _alfabeto;
	String _chave;
	int[] _chave_array;
	int PosChave;
	
	public exec3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exec3 exec1 	= new exec3();
		exec1.geraCripto();
	}

	public void geraCripto(){
		this._mensagem_original 	= "explanation";
		
		this._chave					= "leg";
		
		this._alfabeto				= "abcdefghijklmnopqrstuvwxyz";
		
		this._mensagem_cifrada		= this.getCifra();
		System.out.println("Exec1 -> Mensagem cifrada: " + this._mensagem_cifrada);
		
		this._mensagem_decifrada	= this.setCifra();
		System.out.println("Exec1 -> Mensagem decifrada: " + this._mensagem_decifrada);
	}
	
	public String getCifra(){
		int indice_letra;
		String mensagem = "";
		this.PosChave				= -1;
		
		//percorra o meu texto claro
		for(int i=0; i < this._mensagem_original.length();i++){
			for(int j=0; j < this._alfabeto.length(); j++){				
				//compara a letra do texto claro com as letras do alfabeto
				if(this._mensagem_original.charAt(i) == this._alfabeto.charAt(j)){
					indice_letra = (j + this.getChave()) % 26;
					mensagem +=  this._alfabeto.charAt(indice_letra);
					break;
				}
			}
		}
		return mensagem;
	}

	public String setCifra(){
		int indice_letra;
		String mensagem = "";
		this.PosChave				= -1;
		
		//percorra o meu texto claro
		for(int i=0; i < this._mensagem_cifrada.length();i++){
			for(int j=0; j < this._alfabeto.length(); j++){		
				
				//compara a letra do texto claro com as letras do alfabeto
				if(this._mensagem_cifrada.charAt(i) == this._alfabeto.charAt(j)){
					
					indice_letra = (26 + j - this.getChave() ) % 26;
					mensagem +=  this._alfabeto.charAt(indice_letra);
					break;
				}
			}
		}
		return mensagem;
	}
	
	public int getChave(){

		int Posicao = 0;
		this.PosChave		= (this.PosChave+1) % this._chave.length();
		
		for(int j=0; j < this._alfabeto.length(); j++){
			if(this._chave.charAt(this.PosChave) == this._alfabeto.charAt(j)){
				Posicao 	= j;
				break;
			}
		}	
		return Posicao;
	}
}
