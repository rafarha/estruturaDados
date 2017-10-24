package com.estrutura.dados.vetor.teste;

import com.estrutura.dados.vetor.Vetor;

public class VetorAula09Test {

    public static void main(String[] args) {
	Vetor vetor = new Vetor(10);

	vetor.adiciona("B");
	vetor.adiciona("G");
	vetor.adiciona("D");
	vetor.adiciona("E");
	vetor.adiciona("F");
	System.out.println("Removendo a posição 1");
	System.out.println(vetor);
	vetor.removerElementoNaPosicao(1);
	System.out.println(vetor);
	System.out.println("Removendo o elemento E");
	vetor.removerElementoNaPosicao(vetor.buscarElementoVetorPorConteudo("E"));
	System.out.println(vetor);
	System.out.println("Removendo o elemento Z");
	vetor.removerElementoNaPosicao(vetor.buscarElementoVetorPorConteudo("Z"));
	System.out.println(vetor);

    }
}
