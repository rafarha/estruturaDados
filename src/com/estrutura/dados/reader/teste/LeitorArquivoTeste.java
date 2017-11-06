package com.estrutura.dados.reader.teste;

import com.estrutura.dados.reader.LeitorArquivos;

import java.io.FileNotFoundException;

public class LeitorArquivoTeste {

    public static void main(String[] arg) {
	LeitorArquivos leitorArquivos = new LeitorArquivos();
	try {
	    leitorArquivos.efetuarLeituraArquivoTXT();
	} catch (FileNotFoundException e) {
	    e.printStackTrace();
	}

	System.out.println("este");

    }
}
