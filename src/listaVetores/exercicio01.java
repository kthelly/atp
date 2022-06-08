package listaVetores;

import java.util.Scanner;

public class exercicio01 {
	/*
	 * Faça um programa que preencha um vetor com oito números inteiros, calcule e
	 * mostre dois vetores resultantes. O primeiro vetor resultante deve conter os
	 * números positivos, o segundo deve conter os números negativos. Cada vetor
	 * resultante deve ter, no máximo, oito posições que poderão não ser
	 * completamente utilizadas.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Declaracao de variáveis
		int contadorPositivo = 0, contadorNegativo = 0;
		int[] vetor = new int[8];
		int[] vetorPositivo = new int[8];
		int[] vetorNegativo = new int[8];

		// Entrada de dados.
		System.out.println("Digite os números do vetor: ");

		/*
		 * Processamento. Temos uma repetição for para armazenar os números do vetor e
		 * separa-los entre positivos e negativos .
		 */
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("->");
			vetor[i] = sc.nextInt();

			if (vetor[i] >= 0) {
				vetorPositivo[contadorPositivo] = vetor[i];
				contadorPositivo++;
			} else {
				vetorNegativo[contadorNegativo] = vetor[i];
				contadorNegativo++;
			}
		}
		
		//Saída de dados.
		System.out.println("O vetor digitado foi: ");
		for (int v : vetor) {
			System.out.print(v + ", ");
		}
		System.out.println("\nDo vetor digitado tem-se " + contadorPositivo + " positivos.");
		for (int i = 0; i < contadorPositivo; i++) {
			System.out.print(vetorPositivo[i] + ", ");
		}
		System.out.println("\nDo vetor digitado tem-se " + contadorNegativo + " negativos.");
		for (int i = 0; i < contadorNegativo; i++) {
			System.out.print(vetorNegativo[i] + ", ");
		}

		sc.close();
	}
}
