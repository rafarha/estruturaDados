package com.estrutura.dados.jogos.teste;

import com.estrutura.dados.jogos.ContadorNumerosSorteados;
import com.estrutura.dados.swing.MinhaJanela;

import java.util.Scanner;

public class TesteJogos {

    public static final String nomeArquivoLotoFacilFull = "resources/lotoFacil.txt";

    public static final String nomeArquivoMegaFull = "resources/megaSena.txt";

    public static void main(String[] args) throws Exception {
	Scanner scanner = new Scanner(System.in);
	MinhaJanela minhaJanela = new MinhaJanela();
	ContadorNumerosSorteados contadorNumerosSorteados = new ContadorNumerosSorteados();

	System.out.println("Digite uma Opção: ");
	System.out.println("M - Mega Sena ");
	System.out.println("L - Lotofácil ");
	System.out.println("0 - Sair do Programa");

	String entradaTeclado = "";
	while (entradaTeclado != "0") {
	    entradaTeclado = scanner.nextLine();
	    if (entradaTeclado.equalsIgnoreCase("M")) {
		contadorNumerosSorteados.contabilizarNumerosPorConcurso(nomeArquivoMegaFull);
	    } else if (entradaTeclado.equalsIgnoreCase("L")) {
		contadorNumerosSorteados.contabilizarNumerosPorConcurso(nomeArquivoLotoFacilFull);
	    } else if (entradaTeclado.equalsIgnoreCase("0")) {
		break;
	    } else {
		System.out.println("Valor Inválido: " + entradaTeclado);
		System.out.println("Digite um dos valores válidos: ");
		System.out.println("M - Mega Sena ");
		System.out.println("L - Lotofácil ");
		System.out.println("0 - Sair do Programa");
	    }
	}
	System.out.println("Programa encerrado pelo usuário");
    }
}
