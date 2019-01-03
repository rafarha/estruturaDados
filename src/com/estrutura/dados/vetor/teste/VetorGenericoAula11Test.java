package com.estrutura.dados.vetor.teste;

import com.estrutura.dados.domain.Contato;
import com.estrutura.dados.vetor.VetorGenerico;

public class VetorGenericoAula11Test {

    public static void main(String[] args) {
	VetorGenerico<Contato> vetorGenerico = new VetorGenerico<Contato>(5);

	Contato c1 = new Contato("Rafael", "19-99887-2756", "rafael@email.com");
	Contato c2 = new Contato("Henrique", "19-99887-3738", "Henrique@email.com");
	Contato c3 = new Contato("Alves", "19-99887-9978", "Alves@email.com");

	Contato c4 = new Contato("Henrique", "19-99887-3738", "Henrique@email.com");

	vetorGenerico.adiciona(c1);
	vetorGenerico.adiciona(c2);
	vetorGenerico.adiciona(c3);

	System.out.println(vetorGenerico);

	System.out.println("Bucar no vetor o seguinte contato: " + c4);
	int posicao = vetorGenerico.buscarElementoVetorPorConteudo(c4);
	if (posicao > -1) {
	    System.out.println("Contato encontrado na posição: " + posicao);
	} else {
	    System.out.println("Contato não cadastrao no vetor");
	}
	System.out.println(vetorGenerico.contem(c4));
//	System.out.println("Ultimo indice é: " + vetorGenerico.ultimoIndice());
	System.out.println(vetorGenerico);
	vetorGenerico.removerPorElemento(c2);

    }
}
