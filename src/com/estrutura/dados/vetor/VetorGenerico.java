package com.estrutura.dados.vetor;

public class VetorGenerico<T> {
    private T[] elementos;

    private int tamanhoRealVetor;

    public VetorGenerico(int pCapacidade) {
	this.elementos = (T[]) new Object[pCapacidade];
	this.tamanhoRealVetor = 0;
    }

    public void adiciona(T pElemento) throws IndexOutOfBoundsException {
	aumentaCapacidadeVetor();
	if (tamanhoRealVetor < this.elementos.length) {
	    this.elementos[tamanhoRealVetor] = pElemento;
	    tamanhoRealVetor++;
	} else {
	    throw new IndexOutOfBoundsException("Não foi possivel adicionar o " + pElemento + ", pois o vetor está cheio");
	}

    }

    public void adicionaNaPosicao(int pPosicao, T pElemento) {
	aumentaCapacidadeVetor();
	verificaSePosicaoExiste(pPosicao);
	for (int i = this.tamanhoRealVetor; i > pPosicao; i--) {
	    this.elementos[i] = this.elementos[i - 1];
	}
	this.elementos[pPosicao] = pElemento;
	this.tamanhoRealVetor++;
    }

    public int buscarElementoVetorPorConteudo(T pElemento) {
	for (int i = 0; i < getTamanhoRealVetor(); i++) {
	    if (this.elementos[i].equals(pElemento)) {
		return i;
	    }
	}

	return -1;
    }

    public Object buscarElementoVetorPorPosicao(int pPosicao) throws IllegalArgumentException {
	verificaSePosicaoExiste(pPosicao);
	return this.elementos[pPosicao];
    }

    public int getTamanhoRealVetor() {
	return this.tamanhoRealVetor;
    }

    public void removerElementoNaPosicao(int pPosicao) {
	verificaSePosicaoExiste(pPosicao);
	for (int i = pPosicao; i < tamanhoRealVetor; i++) {
	    elementos[i] = elementos[i + 1];
	}
	tamanhoRealVetor--;
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

    private void aumentaCapacidadeVetor() {
	if (this.tamanhoRealVetor == this.elementos.length) {
	    T[] elementosNovos = (T[]) new Object[elementos.length * 2];
	    for (int i = 0; i < elementos.length; i++) {
		elementosNovos[i] = elementos[i];
	    }
	    elementos = elementosNovos;
	}
    }

    private void verificaSePosicaoExiste(final int pPosicao) {
	if (!(pPosicao >= 0 && pPosicao < this.getTamanhoRealVetor())) {
	    throw new IllegalArgumentException("A posiçao " + pPosicao + " não existe do vetor");
	}
    }
}
