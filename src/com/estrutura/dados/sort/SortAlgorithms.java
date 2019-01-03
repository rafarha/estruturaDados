package com.estrutura.dados.sort;

import java.util.ArrayList;

public class SortAlgorithms {

    public static void main(String arg[]) {
	int[] arrayParaOrdenar = { 8, 2, 1, 10, 9, 11, 0 };
	ArrayList<Integer> array = new ArrayList<Integer>();
	//	System.out.println("Resultado Ordenação BubbleSort: " + toString(bubbleSort(arrayParaOrdenar)));
	//	System.out.println("Resultado Ordenação SelectionSort: " + toString(selectionSort(arrayParaOrdenar)));
	//	System.out.println("Resultado Ordenação InsertSort: " + toString(insertionSort(arrayParaOrdenar)));
	System.out.println("Resultado Ordenação QuicktSort: " + toString(
			quickSort(arrayParaOrdenar, 0, arrayParaOrdenar.length - 1)));

    }

    private static int separador(final int[] pArray, final int pEsq, final int pDir) {
	int i = pEsq;
	int j = pDir;
	int pivo = pArray[pEsq];
	while (i <= j) {
	    //Encontrar o indice da esquerda que será trocado com o indice da direita
	    if (pArray[i] <= pivo) {
		i++;
		//Encontrar o indice da direita que será trocado com o indice da esquerda;
	    } else if (pArray[j] > pivo) {
		j--;
	    } else if (i <= j) {
		trocar(pArray, i, j);
		//incrementar i e decrementar j
		i++;
		j--;
	    }
	}
	//reposiciono o PIVO
	trocar(pArray, pEsq, j);
	return j;
    }

    private static void trocar(final int[] pArray, final int pEsq, final int pJ) {
	int aux = pArray[pJ];
	pArray[pJ] = pArray[pEsq];
	pArray[pEsq] = aux;
    }

    static int[] bubbleSort(int[] pArray) {
	int[] arrayRetorno = pArray.clone();
	boolean isOrdenado = true;
	int i = 0;
	while (i < arrayRetorno.length) {
	    if (i + 1 == arrayRetorno.length) {
		if (!isOrdenado) {
		    i = 0;
		    isOrdenado = true;
		} else {
		    break;
		}
	    } else {
		if (arrayRetorno[i] > arrayRetorno[i + 1]) {
		    int aux = arrayRetorno[i];
		    arrayRetorno[i] = arrayRetorno[i + 1];
		    arrayRetorno[i + 1] = aux;
		    isOrdenado = false;
		}
		i = i + 1;
	    }
	}
	return arrayRetorno;
    }

    static int[] insertionSort(int[] pArray) {
	int[] array = pArray.clone();
	for (int i = 1; i < array.length; i++) {
	    int ponteiroArray = array[i];
	    int j = i - 1;
	    while (j >= 0 && array[j] > ponteiroArray) {
		array[j + 1] = array[j];
		array[j] = ponteiroArray;
		j--;
	    }
	}
	return array;

    }

    static int[] quickSort(int[] pArray, int esq, int dir) {
	int[] array = pArray.clone();
	if (esq < dir) {
	    int indicePivo = separador(array, esq, dir);
	    quickSort(array, indicePivo+1, dir);
	    quickSort(array, esq, indicePivo-1);
	}

	return array;
    }

    static int[] selectionSort(int[] pArray) {
	int[] arrayRetorno = pArray.clone();
	int tamanhoArray = arrayRetorno.length - 1;
	for (int i = 0; i <= tamanhoArray; i++) {
	    for (int j = i; j <= tamanhoArray; j++) {
		if (arrayRetorno[i] > arrayRetorno[j]) {
		    int aux = arrayRetorno[i];
		    arrayRetorno[i] = arrayRetorno[j];
		    arrayRetorno[j] = aux;
		}
	    }
	}
	return arrayRetorno;
    }

    static String toString(int[] pArray) {
	StringBuilder str = new StringBuilder();
	for (int i = 0; i < pArray.length; i++) {
	    if (i + 1 == pArray.length) {
		str.append(pArray[i]);
	    } else {
		str.append(pArray[i] + ",");
	    }
	}
	return str.toString();
    }
}
