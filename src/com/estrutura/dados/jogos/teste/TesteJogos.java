package com.estrutura.dados.jogos.teste;

import com.estrutura.dados.jogos.ContadorNumerosSorteados;

public class TesteJogos {

    public static final String nomeArquivoLotoFacilFull = "resources/lotoFacil.txt";

    public static final String nomeArquivoMegaFull = "resources/megaSena.txt";

    public static void main(String[] args) {
	Character jogo = 'M';

	ContadorNumerosSorteados contadorNumerosSorteados = new ContadorNumerosSorteados();
	switch (jogo) {
	    case 'L':
		contadorNumerosSorteados.contabilizarNumerosPorConcurso(nomeArquivoLotoFacilFull);
		break;
	    case 'M':
		contadorNumerosSorteados.contabilizarNumerosPorConcurso(nomeArquivoMegaFull);
		break;
	}

    }
}
