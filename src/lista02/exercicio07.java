package lista02;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Faça um algoritmo que leia um número N, some todos os números inteiros de 1 a
		 * N, e mostre o resultado.
		 */

		// Declaracao de variáveis
		int numero, contador = 0, soma = 0;

		// Entrada de dados.
		System.out.println("Digite um número: ");
		numero = sc.nextInt();

		// Processamento. Soma os numeros inteiros de 1 ate número.
		for (int i = 0; i < numero; i++) {
			contador++;
			soma = soma + contador;
		}

		// Saída de dados.
		System.out.println("A soma é: " + soma);

		sc.close();
	}

}
