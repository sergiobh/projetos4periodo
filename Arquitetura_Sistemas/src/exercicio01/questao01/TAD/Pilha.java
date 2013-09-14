package exercicio01.questao01.TAD;

import java.util.Vector;

public class Pilha{

	private Vector vetor = new Vector();
	
	public Pilha(){

	}

    @SuppressWarnings("unchecked")
    public void empilhar(Object element) {
        this.vetor.insertElementAt(element, 0);
    }

    public Object desempilhar() {
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
