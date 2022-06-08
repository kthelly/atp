package listaVetores;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Fa�a um programa que preencha dois vetores, X e Y, com dez n�meros inteiros
		 * cada. Calcule e mostre os seguintes vetores resultantes: a) Soma de X e Y;
		 * O produto de X e Y;a
		 */

		// Declara��o de variaveis.
		int[] vetorX = new int[10];
		int[] vetorY = new int[10];
		int[] vetorSoma = new int[10];
		int[] vetorProduto = new int[10];

		// Entrada de dados vetorX.
		System.out.println("Digite os n�meros do primeiro vetor: ");

		// Processamento. Temos uma repeti��o for para armazenar os n�meros do vetor X.
		for (int i = 0; i < vetorX.length; i++) {
			System.out.print("->");
			vetorX[i] = sc.nextInt();
		}
		// Entrada de dados vetorY.
		System.out.println("Digite os n�meros do segundo vetor: ");

		// Processamento. Temos uma repeti��o for para armazenar os n�meros do vetor Y.
		for (int j = 0; j < vetorY.length; j++) {
			System.out.print("->");
			vetorY[j] = sc.nextInt();
		}
		
		// Processamento. Temos uma repeti��o for para a soma e multiplicar os vetores X e Y.
		for (int i = 0; i < vetorSoma.length; i++) {
			vetorSoma[i] = vetorX[i] + vetorY[i];
			vetorProduto[i] = vetorX[i] * vetorY[i];
		}

		// Sa�da de dados.
		System.out.println("A soma do vetor X e vetor Y: ");
		for (int i = 0; i < vetorSoma.length; i++) {
			System.out.print(vetorSoma[i] + ", ");
		}
		System.out.println("\nO produto do vetor X e vetor Y: ");
		for (int i = 0; i < vetorProduto.length; i++) {
			System.out.print(vetorProduto[i] + ", ");
		}

		sc.close();
	}

}
