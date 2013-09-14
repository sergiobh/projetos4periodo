package exercicio02.questao02;

public class Principal {

	public Principal() {

	}

	public static void main(String[] args) {
		Fixo Fixo = new Fixo();
		
		Celular Celular = new Celular();
		
		Fixo.realizarChamada();
		Fixo.tocar();
		Fixo.volumeExcuta();

		Celular.ativarBlueTooth();
		Celular.ativarFilmadora();
		Celular.conectarWiFi();
		Celular.discagemPorVoz();
		Celular.EDGE();
		Celular.flash();
		Celular.GPRS();
		Celular.realizarChamada();
		Celular.resolucao();
		Celular.secretariaEletronica();
		Celular.tirarFoto();
		Celular.tocar();
		Celular.USB();
		Celular.videoChamada();
		Celular.volumeExcuta();
		Celular.volumeVoz();
	}
}
