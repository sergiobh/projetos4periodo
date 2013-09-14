package exercicio01;

public class exec2 {

	String _mensagem_original;
	String _mensagem_cifrada;
	String _mensagem_decifrada;
	String _alfabeto;
	
	public exec2() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exec2 exec2 	= new exec2();
		exec2.geraCripto();		
	}

	public void geraCripto(){
		this._mensagem_original 	= "sergio";
		
		this._alfabeto				= "abcdefghijklmnopqrstuvwxyz";
		
		// Cifra
		this._mensagem_cifrada		= this.getCifra(this._mensagem_original, this._alfabeto);
		System.out.println("Exec1 -> Mensagem cifrada: " + this._mensagem_cifrada);
		
		// Decifra -> mesma tecnica = metade do alfabeto
		this._mensagem_decifrada	= this.getCifra(this._mensagem_cifrada, this._alfabeto);
		System.out.println("Exec1 -> Mensagem decifrada: " + this._mensagem_decifrada);
	}
	
	public String getCifra(String _mensagem_original, String _alfabeto){
		int indice_letra;
		String mensagem = "";
		
		//percorra o meu texto claro
		for(int i=0; i < _mensagem_original.length();i++){
			for(int j=0; j < _alfabeto.length(); j++){				
				//compara a letra do texto claro com as letras do alfabeto
				if(_mensagem_original.charAt(i) == _alfabeto.charAt(j)){
					indice_letra = (j + 13) % 26;
					mensagem +=  _alfabeto.charAt(indice_letra);
					break;
				}		
			}
		}
		return mensagem;
	}	
}
