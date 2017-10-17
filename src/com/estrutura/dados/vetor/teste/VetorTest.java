package com.estrutura.dados.vetor.teste;

import com.estrutura.dados.vetor.Vetor;

public class VetorTest {

    public static void main(String[] args) {
	Vetor vetor = new Vetor(10);
	try {
	    vetor.adiciona("Elemento 1");
	    vetor.adiciona("Elemento 2");
	    vetor.adiciona("Elemento 3");
	    System.out.println(vetor.getTamanhoRealVetor());
	    System.out.println(vetor.toString());
	    System.out.println(vetor.buscarElementoVetorPorPosicao(0));
	    System.out.println(vetor.buscarElementoVetorPorConteudo("Elemento 2"));
	} catch (IndexOutOfBoundsException pE) {
	    pE.printStackTrace();
	}

    }
}
