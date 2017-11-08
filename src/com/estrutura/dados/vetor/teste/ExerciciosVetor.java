package com.estrutura.dados.vetor.teste;

import com.estrutura.dados.domain.Contato;
import com.estrutura.dados.vetor.VetorGenerico;

import java.util.ArrayList;
import java.util.List;

public class ExerciciosVetor {

    public static void main(String[] arg) {
	VetorGenerico<Contato> vetorGenerico = new VetorGenerico<Contato>(20);
	for (int i = 0; i < 30; i++) {
	    Contato contato = new Contato("Rafael" + i, "19-99887-2756" + i, i + "rafael@email.com");
	    vetorGenerico.adiciona(contato);
	}
	System.out.println(vetorGenerico.toString());
	List<Contato> contatoList = new ArrayList<Contato>();
    }
}
