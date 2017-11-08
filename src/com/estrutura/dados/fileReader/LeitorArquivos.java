package com.estrutura.dados.fileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeitorArquivos {

    public LeitorArquivos() {
    }

    public List<String> efetuarLeituraArquivoTXT(String pNomeArquivo) throws FileNotFoundException {
	Scanner in = new Scanner(new FileReader(pNomeArquivo));
	List<String> linhasArquivo = new ArrayList<String>();
	while (in.hasNextLine()) {

	    String line = in.nextLine();
	    linhasArquivo.add(line);
	}
	return linhasArquivo;
    }
}
