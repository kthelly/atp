package listaVetores;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * Faça um Programa que leia dois vetores com 25 elementos cada. Gere um
		 * terceiro vetor de 50 elementos, cujos valores deverão ser compostos pelos
		 * elementos intercalados dos dois outros vetores.
		 */

		// Declaração de variaveis.
		int[] vetorX = new int[25];
		int[] vetorY = new int[25];
		int[] vetorIntercalado = new int[50];
		int contadorX=0;
		int contadorY=0;

		// Entrada de dados vetorX.
		System.out.println("Digite os números do primeiro vetor: ");

		// Processamento. Temos uma repetição for para armazenar os números do vetor X.
		for (int i = 0; i < vetorX.length; i++) {
			System.out.print("->");
			vetorX[i] = sc.nextInt();
		}
		// Entrada de dados vetorY.
		System.out.println("Digite os números do segundo vetor: ");

		// Processamento. Temos uma repetição for para armazenar os números do vetor Y.
		for (int j = 0; j < vetorY.length; j++) {
			System.out.print("->");
			vetorY[j] = sc.nextInt();
		}

		/*
		 * Processamento. Temos uma repetição for para armazenar os números do vetor
		 * resultante intercalando o numeros dos vetores X e Y. 
		 */
		for (int i = 0; i < vetorIntercalado.length; i++) {
			if (i % 2 == 0) {
				vetorIntercalado[i] = vetorX[contadorX];
				contadorX++;
			} else {
				vetorIntercalado[i] = vetorY[contadorY];
				contadorY++;
			}
		}
			
			// Saída de dados.
			System.out.println("O vetor resultante é: ");
			for (int i = 0; i < vetorIntercalado.length; i++) {
				System.out.print(vetorIntercalado[i] + ", ");
			}
			sc.close();
		}
	}


