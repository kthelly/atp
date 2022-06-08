package listaVetores;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * Crie um programa que, dados dois vetores de 10 posições cada, efetue as
		 * operações aritméticas básicas (+, -, *, /), indicadas por um terceiro vetor
		 * cujos dados também são fornecidos pelo usuário, gerando e imprimindo um
		 * quarto vetor
		 */

		// Declaração de variaveis.
		int[] vetorX = new int[10];
		int[] vetorY = new int[10];
		char[] vetorOperacao = new char[10];
		int[] vetor4 = new int[10];
		char operacao;

		// Entrada e Processamento de dados.
		for (int i = 0; i < vetorX.length; i++) {
			System.out.println("Digite dois números e uma operação matemática: ");
			vetorX[i] = sc.nextInt();
			vetorY[i] = sc.nextInt();
			vetorOperacao[i] = sc.next().charAt(0);
			operacao = vetorOperacao[i];

			switch (operacao) {

			case '+':
				vetor4[i] = vetorX[i] + vetorY[i];
				break;

			case '-':
				vetor4[i] = vetorX[i] - vetorY[i];
				break;

			case '*':
				vetor4[i] = vetorX[i] * vetorY[i];
				break;

			case '/':
				if (vetorY[i] == 0) {
					System.out.println("Divisão por zero (indeterminado)");
				} else {
					vetor4[i] = vetorX[i] / vetorY[i];
				}
				break;
			}
		}

		// Saída de dados.
		System.out.print("O primeiro vetor é (VetorX):  ");
		for (int i = 0; i < vetorX.length; i++) {
			System.out.print(vetorX[i] + ", ");
		}
		System.out.print("\nO Segundo vetor é (VetorY):   ");
		for (int i = 0; i < vetorY.length; i++) {
			System.out.print(vetorY[i] + ", ");
		}
		System.out.print("\nAs operações desejadas são:   ");
		for (int i = 0; i < vetorOperacao.length; i++) {
			System.out.print(vetorOperacao[i] + ", ");
		}
		System.out.print("\nO vetor resultante é:        ");
		for (int i = 0; i < vetor4.length; i++) {
			System.out.print(vetor4[i] + ", ");
		}
		sc.close();

	}

}
