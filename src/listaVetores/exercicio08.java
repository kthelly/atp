package listaVetores;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Faça um programa que preencha um vetor com 16 posições e troque os 8 primeiros
		 * valores pelos 8 últimos e vice-e-versa. Escreva ao final o vetor obtido.
		 */

		// Declaração de variaveis.
		int[] vetorA = new int[16];
		int[] vetorB = new int[16];
		int contadorAntes = 0; 
		int contador = vetorB.length / 2;
		/*
		 * Entrada e Processamento de dados. Temos uma repetição for para armazenar os
		 * números do vetor.
		 */
		System.out.println("Digite os números do vetor: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("->");
			vetorA[i] = sc.nextInt();
		}
		// // Processamento de dados. Temos uma repetição for separar os componentes do vetorB; 
		for (int i = 0; i < vetorB.length; i++) {
			if (i < (vetorB.length / 2)) {
				vetorB[i] = vetorA[contador];
				contador++;
			} else {
				vetorB[i] = vetorA[contadorAntes];
				contadorAntes++;
			}
		}
			// Saída de dados.
						System.out.println("O vetor é: ");
						for (int i = 0; i < vetorB.length; i++) {
							System.out.print(vetorB[i] + ", ");
						}
						sc.close();
		}
	}

