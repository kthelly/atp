package listaVetores;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * Crie um programa que leia um vetor A de 10 valores e contrua um vetor B, da
		 * seguinte forma: Ex: Vetor A 3 8 7 12 ... 5 Vetor B 9 4 21 6 ... 15
		 */

		// Declaração de variaveis.
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		
		// Entrada de dados vetorA.
		System.out.println("Digite os números do primeiro vetor: ");

		/*
		 * Processamento. Temos uma repetição for para armazenar os números do vetor A e
		 * fazer as operacoes para o vetor B. Caso a posição do vetor A seja par o
		 * numero do vetor B nesta posiçao sera mutiplicado por 3, caso contrario
		 * dividido por 2;
		 */
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("->");
			vetorA[i] = sc.nextInt();
			if (i % 2 == 0) {
				vetorB[i] = vetorA[i] * 3;
			} else {
				vetorB[i] = vetorA[i] / 2;
			}
		}
		// Saída de dados.
		System.out.println("O vetor resultante é: ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + ", ");
		}
		sc.close();
	}

}
