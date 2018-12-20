package com.estrutura.dados.sort;

import java.util.ArrayList;

public class SortAlgorithms {

    public static void main(String arg[]) {
	int[] arrayParaOrdenar = { 3, 5, 1, 2, 4 };
	ArrayList<Integer> array = new ArrayList<Integer>();
	System.out.println("Resultado Ordenação BubbleSort: " + toString(bubbleSort(arrayParaOrdenar)));
	System.out.println("Resultado Ordenação SelectionSort: " + toString(selectionSort(arrayParaOrdenar)));
	System.out.println("Resultado Ordenação InsertSort: " + toString(insertionSort(arrayParaOrdenar)));

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

    static int[] quickSort(int[] pArray) {
	return null;
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
