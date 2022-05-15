package lista02;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * Elabore um programa para fazer cálculo de potenciação. Ou seja, x^y. Seu
		 * algoritmo deverá solicitar que o usuário entre com o valor da base (x) e do
		 * expoente (y) e apresentar o resultado do cálculo sem utilizar o operador
		 * (Math.pow( )). Para resolver o problema utilize estrutura de repetição for.
		 */

		int base, expoente, resultado = 1;

		// Entrada de dados
		System.out.println("Digite o valor da base:");
		base = sc.nextInt();
		System.out.println("Digite o valor do expoente:");
		expoente = sc.nextInt();

		// Processamento. Multiplicação da base pela quantidade de vezes(expoente).
		for (int i = 0; i < expoente; i++) {
			if (expoente == 0) {
				resultado = 1;
			} else {
				resultado = resultado * base;
			}
		}
		System.out.println("O resultado da ponciciação é: " + resultado);
		sc.close();
	}
}
