package exercicio01;

public class exec3 {

	String _mensagem_original;
	String _mensagem_cifrada;
	String _mensagem_decifrada;
	int _chave;
	
	public exec3() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exec3 exec3 	= new exec3();
		exec3.geraCripto();
	}

	public void geraCripto(){
		this._chave					= 47;
		
		this._mensagem_original 	= "sergio";
		
		this._mensagem_cifrada		= this.getCifra();
		System.out.println("Exec1 -> Mensagem cifrada: " + this._mensagem_cifrada);
		
		this._mensagem_decifrada	= this.setCifra();
		System.out.println("Exec1 -> Mensagem decifrada: " + this._mensagem_decifrada);
	}
	
	public String getCifra(){
		int novo_valor_ascii;
		int valor_ascii;
		String mensagem = "";
		
		//percorra o meu texto claro
		for(int i=0; i < this._mensagem_original.length();i++){
			valor_ascii = (int)this._mensagem_original.charAt(i);
			if(valor_ascii >= 33 && valor_ascii <= 126){
				valor_ascii -= 33;

				novo_valor_ascii = (valor_ascii + this._chave) % 94;
				mensagem +=  (char)(novo_valor_ascii+33);	
			}
			else{
				mensagem += this._mensagem_original.charAt(i);
			}
		}		
		return mensagem;
	}	
	
	public String setCifra(){
		int novo_valor_ascii;
		int valor_ascii;
		char valor_char;
		String mensagem = "";
		
		//percorra o meu texto claro
		for(int i=0; i < this._mensagem_cifrada.length();i++){				
			//valor_ascii = (int)this._mensagem_cifrada.charAt(i);
			valor_char = this._mensagem_cifrada.charAt(i);
			
			valor_ascii = (int)valor_char;
			
			//valor_ascii -= 33;
			
			novo_valor_ascii = (valor_ascii + this._chave) % 126;
			mensagem +=  (char)(novo_valor_ascii);
		}		
		return mensagem;
	}
}