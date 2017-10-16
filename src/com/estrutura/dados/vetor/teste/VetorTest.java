package com.estrutura.dados.vetor.teste;

import com.estrutura.dados.vetor.Vetor;

public class VetorTest {

    public static void main(String[] args) {
	Vetor vetor = new Vetor(2);
	try {
	    vetor.adiciona("Elemento 1");
	    vetor.adiciona("Elemento 2");
	    vetor.adiciona("Elemento 3");
	} catch (IndexOutOfBoundsException e) {
	    e.printStackTrace();
	}

    }
}
