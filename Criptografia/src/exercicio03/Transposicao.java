package exercicio03;

import java.util.ArrayList;

public class Transposicao {

	public String Frase;
	public char[] Criptografar;
	public String Criptografado;
	public String DeCriptografado;
	
	public Transposicao() {
		this.Frase = "SERGIOmacedoDAsilvaSANTOS";
		this.Criptografado = "";
		this.DeCriptografado = "";
		
		int Qtd = this.Frase.length();
		
		if(Qtd % 2 != 0){
			Qtd++;
			this.Frase +="!";
		}
		
		Criptografar = new char[Qtd];
	}

	public static void main(String[] args) {
		Transposicao transposicao = new Transposicao();
		transposicao.getCriptografia();
		transposicao.imprimeCriptografado();
		
		transposicao.decriptografar();
		transposicao.imprimeDeCriptografado();
	}

	public void getCriptografia(){
		
		for(int i=0;i < Frase.length();i++){
			this.Criptografar[i] = Frase.charAt(i);
		}
		
		this.getCriptografado();
	}
	
	public void getCriptografado(){
		this.Criptografado = "";
		
		for(int i=0;i < this.Criptografar.length;i += 2){
			this.Criptografado += this.Criptografar[i];
			
			//System.out.println(this.Criptografar[i]);
		}
		
		for(int i=1;i < this.Criptografar.length;i += 2){
			this.Criptografado += this.Criptografar[i];
			
			//System.out.println(this.Criptografar[i]);
		}
	}
	
	public void imprimeCriptografado(){
		System.out.println("Valor Criptografado: " + this.Criptografado);
	}
	
	public void imprimeDeCriptografado(){
		System.out.println("Valor Decriptografado: " + this.DeCriptografado);
	}
	
	public void decriptografar(){
		String Primeira, Segunda;
		
		int Meio = (this.Criptografado.length() / 2);
		
		Primeira = this.Criptografado.substring(0, Meio);
		Segunda = this.Criptografado.substring(Meio);
		
		for(int i=0;i<Meio;i++){
			this.DeCriptografado += Primeira.charAt(i)+""+Segunda.charAt(i);
		}

		this.DeCriptografado = this.DeCriptografado.replaceAll("!", "");
	}
}