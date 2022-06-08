package listaVetores;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Fa�a um programa que preencha um vetor com 12 posi��es e em seguida leia
		 * tamb�m dois valores X e Y quaisquer correspondentes a duas posi��es (�ndices)
		 * no vetor. Ao final seu programa dever� escrever a soma dos valores
		 * encontrados entre as respectivas posi��es X e Y. Voc� deve verificar se os
		 * valores lidos fazem parte dos �ndices do vetor.
		 */

		// Declara��o de variaveis.
		int[] vetor = new int[12];
		int x, y, soma = 0;

		// Entrada e Processamento de dados. Temos uma repeti��o for para armazenar os n�meros do vetor.
		System.out.println("Digite os n�meros do primeiro vetor: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("->");
			vetor[i] = sc.nextInt();
		}
		// Entrada de X e Y e verificando se os valores lidos fazem parte dos �ndices do vetor.
		System.out.println("Digite os valores de X (entre 0 e 11): ");
		x = sc.nextInt();
		while (x < 1 || x > vetor.length) {
			System.out.println("O valor digitado est� fora dos �ndices do vetor, digite x de 0 a 11  ");
			x = sc.nextInt();
		}
		System.out.println("Digite os valores de Y (entre 0 e 11): ");
		y = sc.nextInt();
		while (y < 1 || y > vetor.length) {
			System.out.println("O valor digitado est� fora dos �ndices do vetor, digite y de 0 a 11  ");
			y = sc.nextInt();
		}
		// Soma ENTRE os �ndices digitados.
		if (x < y) {
			for (int i = (x + 1); i < y; i++) {
				soma = soma + vetor[i];
			}
		} else {
			for (int i = (y + 1); i < x; i++) {
				soma = soma + vetor[i];
			}
		}

		// Sa�da de dados. 
		System.out.println(
				"A soma dos valores encontrados entre as respectivas posi��es X: " + x + " e Y: " + y + " �: " + soma);

		sc.close();
	}

}
