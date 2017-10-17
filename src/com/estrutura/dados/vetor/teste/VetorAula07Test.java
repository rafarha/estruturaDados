package com.estrutura.dados.vetor.teste;

import com.estrutura.dados.vetor.Vetor;

public class VetorAula07Test {

    public static void main(String[] args) {
	Vetor vetor = new Vetor(10);

	vetor.adiciona("B");
	vetor.adiciona("C");
	vetor.adiciona("E");
	vetor.adiciona("F");
	vetor.adiciona("G");
	System.out.println(vetor);
	vetor.adicionaNaPosicao(0, "A");
	System.out.println(vetor);
	vetor.adicionaNaPosicao(3, "D");
	System.out.println(vetor);
	vetor.adicionaNaPosicao(7, "D");
	System.out.println(vetor);

    }
}
