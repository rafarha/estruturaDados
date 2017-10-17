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

    public void adicionaNaPosicao(int pPosicao, String pElemento) {
	verificaSePosicaoExiste(pPosicao);
	for (int i = this.tamanhoRealVetor; i > pPosicao; i--) {
	    this.elementos[i] = this.elementos[i - 1];
	}
	this.elementos[pPosicao] = pElemento;
	this.tamanhoRealVetor++;
    }

    public int buscarElementoVetorPorConteudo(String pElemento) {
	for (int i = 0; i < getTamanhoRealVetor(); i++) {
	    if (this.elementos[i].equals(pElemento)) {
		return i;
	    }
	}

	return -1;
    }

    public String buscarElementoVetorPorPosicao(int pPosicao) throws IllegalArgumentException {
	verificaSePosicaoExiste(pPosicao);
	return this.elementos[pPosicao];
    }

    public int getTamanhoRealVetor() {
	return this.tamanhoRealVetor;
    }

    @Override public String toString() {
	StringBuilder s = new StringBuilder();
	s.append("[");

	for (int i = 0; i <= getTamanhoRealVetor() - 1; i++) {
	    s.append(this.elementos[i]);
	    if (i == getTamanhoRealVetor() - 1) {
		s.append("]");
		break;
	    }
	    s.append(",");
	}
	return s.toString();
    }

    private void verificaSePosicaoExiste(final int pPosicao) {
	if (!(pPosicao >= 0 && pPosicao < this.getTamanhoRealVetor())) {
	    throw new IllegalArgumentException("A posiçao " + pPosicao + " não existe do vetor");
	}
    }
}
