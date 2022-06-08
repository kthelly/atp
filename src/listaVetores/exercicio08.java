package listaVetores;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Fa�a um programa que preencha um vetor com 16 posi��es e troque os 8 primeiros
		 * valores pelos 8 �ltimos e vice-e-versa. Escreva ao final o vetor obtido.
		 */

		// Declara��o de variaveis.
		int[] vetorA = new int[16];
		int[] vetorB = new int[16];
		int contadorAntes = 0; 
		int contador = vetorB.length / 2;
		/*
		 * Entrada e Processamento de dados. Temos uma repeti��o for para armazenar os
		 * n�meros do vetor.
		 */
		System.out.println("Digite os n�meros do vetor: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("->");
			vetorA[i] = sc.nextInt();
		}
		// // Processamento de dados. Temos uma repeti��o for separar os componentes do vetorB; 
		for (int i = 0; i < vetorB.length; i++) {
			if (i < (vetorB.length / 2)) {
				vetorB[i] = vetorA[contador];
				contador++;
			} else {
				vetorB[i] = vetorA[contadorAntes];
				contadorAntes++;
			}
		}
			// Sa�da de dados.
						System.out.println("O vetor �: ");
						for (int i = 0; i < vetorB.length; i++) {
							System.out.print(vetorB[i] + ", ");
						}
						sc.close();
		}
	}

