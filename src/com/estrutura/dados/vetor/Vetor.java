package com.estrutura.dados.vetor;

public class Vetor {
    private String[] elementos;

    private int tamanhoRealVetor;

    public Vetor(int pCapacidade) {
	this.elementos = new String[pCapacidade];
	this.tamanhoRealVetor = 0;
    }

    //    public void adiciona(String pElemento) {
    //	for (int i = 0; i < this.elementos.length; i++) {
    //	    if (this.elementos[i] == null) {
    //		this.elementos[i] = pElemento;
    //		break;
    //	    }
    //	}
    //    }

    public void adiciona(String pElemento) throws IndexOutOfBoundsException {
	if (tamanhoRealVetor < this.elementos.length) {
	    this.elementos[tamanhoRealVetor] = pElemento;
	    tamanhoRealVetor++;
	} else {
	    throw new IndexOutOfBoundsException("Não foi possivel adicionar o " + pElemento + ", pois o vetor está cheio");
	}

    }
}
