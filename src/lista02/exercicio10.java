package lista02;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * Elabore um programa para fazer c�lculo de potencia��o. Ou seja, x^y. Seu
		 * algoritmo dever� solicitar que o usu�rio entre com o valor da base (x) e do
		 * expoente (y) e apresentar o resultado do c�lculo sem utilizar o operador
		 * (Math.pow( )). Para resolver o problema utilize estrutura de repeti��o for.
		 */

		int base, expoente, resultado = 1;

		// Entrada de dados
		System.out.println("Digite o valor da base:");
		base = sc.nextInt();
		System.out.println("Digite o valor do expoente:");
		expoente = sc.nextInt();

		// Processamento. Multiplica��o da base pela quantidade de vezes(expoente).
		for (int i = 0; i < expoente; i++) {
			if (expoente == 0) {
				resultado = 1;
			} else {
				resultado = resultado * base;
			}
		}
		System.out.println("O resultado da poncicia��o �: " + resultado);
		sc.close();
	}
}
