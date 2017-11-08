package com.estrutura.dados.jogos;

import com.estrutura.dados.fileReader.LeitorArquivos;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContadorNumerosSorteados {

    LeitorArquivos leitorArquivos = new LeitorArquivos();

    public void contabilizarNumerosPorConcurso(String pNomeArquivo) {
	try {
	    List<String> linhasArquivo = leitorArquivos.efetuarLeituraArquivoTXT(pNomeArquivo);
	    if (linhasArquivo.size() > 0) {
		Map<String, Integer> mapRepeticoesNumeros = new HashMap<String, Integer>();
		for (int i = 0; i < linhasArquivo.size(); i++) {
		    String[] linha = linhasArquivo.get(i).split("\\|");
		    int count = 0;
		    while (count < linha.length) {
			if (mapRepeticoesNumeros.containsKey(linha[count])) {
			    mapRepeticoesNumeros.put(linha[count], mapRepeticoesNumeros.get(linha[count]) + 1);
			} else {
			    mapRepeticoesNumeros.put(linha[count], 1);
			}
			count++;
		    }
		}
		System.out.println(mapRepeticoesNumeros.toString());
	    }
	} catch (FileNotFoundException e) {
	    System.out.println("Não foi possivel efetuar a leitura do arquivo: " + e.getMessage());
	}
    }
}
