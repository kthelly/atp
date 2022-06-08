package listaVetores;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Faça um programa que preencha um vetor com 12 posições e em seguida leia
		 * também dois valores X e Y quaisquer correspondentes a duas posições (índices)
		 * no vetor. Ao final seu programa deverá escrever a soma dos valores
		 * encontrados entre as respectivas posições X e Y. Você deve verificar se os
		 * valores lidos fazem parte dos índices do vetor.
		 */

		// Declaração de variaveis.
		int[] vetor = new int[12];
		int x, y, soma = 0;

		// Entrada e Processamento de dados. Temos uma repetição for para armazenar os números do vetor.
		System.out.println("Digite os números do primeiro vetor: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("->");
			vetor[i] = sc.nextInt();
		}
		// Entrada de X e Y e verificando se os valores lidos fazem parte dos índices do vetor.
		System.out.println("Digite os valores de X (entre 0 e 11): ");
		x = sc.nextInt();
		while (x < 1 || x > vetor.length) {
			System.out.println("O valor digitado está fora dos índices do vetor, digite x de 0 a 11  ");
			x = sc.nextInt();
		}
		System.out.println("Digite os valores de Y (entre 0 e 11): ");
		y = sc.nextInt();
		while (y < 1 || y > vetor.length) {
			System.out.println("O valor digitado está fora dos índices do vetor, digite y de 0 a 11  ");
			y = sc.nextInt();
		}
		// Soma ENTRE os índices digitados.
		if (x < y) {
			for (int i = (x + 1); i < y; i++) {
				soma = soma + vetor[i];
			}
		} else {
			for (int i = (y + 1); i < x; i++) {
				soma = soma + vetor[i];
			}
		}

		// Saída de dados. 
		System.out.println(
				"A soma dos valores encontrados entre as respectivas posições X: " + x + " e Y: " + y + " é: " + soma);

		sc.close();
	}

}
