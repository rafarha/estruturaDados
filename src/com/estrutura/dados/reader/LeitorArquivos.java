package com.estrutura.dados.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LeitorArquivos {

    public void efetuarLeituraArquivoTXT() throws FileNotFoundException {
	Scanner in = new Scanner(new FileReader("resources/arquivoTeste.txt"));
	while (in.hasNextLine()) {
	    String line = in.nextLine();
	    System.out.println(line);
	}
    }
}
