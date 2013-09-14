package exercicio01.questao01.TAD;

import java.util.Vector;

public class Fila {

	private Vector vetor = new Vector();
	
	public Fila() {
		
	}

    @SuppressWarnings("unchecked")
    public void enfileirar(Object element) {
        this.vetor.add(element);
    }

    public Object desenfileirar() {
        if (!eVazia()) {
            Object result = this.vetor.firstElement();
            this.vetor.removeElementAt(0);
            return result;
        } else {
            return null;
        }
    }
    
    public int obterTamanho() {
        return this.vetor.size();
    }

    public boolean eVazia() {
        return this.vetor.isEmpty();
    }
}
