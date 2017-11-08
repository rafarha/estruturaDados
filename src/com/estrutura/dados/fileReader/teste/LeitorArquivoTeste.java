package com.estrutura.dados.fileReader.teste;

import com.estrutura.dados.fileReader.LeitorArquivos;

import java.io.FileNotFoundException;

public class LeitorArquivoTeste {

    public static final String nomeArquivo = "resources/lotoFascil.txt";

    public static void main(String[] arg) {
	LeitorArquivos leitorArquivos = new LeitorArquivos();
	try {
	    leitorArquivos.efetuarLeituraArquivoTXT(nomeArquivo);
	} catch (FileNotFoundException e) {
	    e.printStackTrace();
	}

	System.out.println("este");

    }
}
