package com.estrutura.dados.vetor.teste;

import com.estrutura.dados.domain.Contato;
import com.estrutura.dados.vetor.VetorObject;

public class VetorObjectAula10Test {

    public static void main(String[] args) {
	VetorObject vetorObject = new VetorObject(10);

	Contato c1 = new Contato("Rafael", "19-99887-2756", "rafael@email.com");
	Contato c2 = new Contato("Henrique", "19-99887-3738", "Henrique@email.com");
	Contato c3 = new Contato("Alves", "19-99887-9978", "Alves@email.com");

	Contato c4 = new Contato("Henrique", "19-99887-3738", "Henrique@email.com");

	vetorObject.adiciona(c1);
	vetorObject.adiciona(c2);
	vetorObject.adiciona(c3);

	System.out.println(vetorObject);

	System.out.println("Bucar no vetor o seguinte contato: " + c4);
	int posicao = vetorObject.buscarElementoVetorPorConteudo(c4);
	if (posicao > -1) {
	    System.out.println("Contato encontrado na posição: " + posicao);
	} else {
	    System.out.println("Contato não cadastrao no vetor");
	}

    }
}
