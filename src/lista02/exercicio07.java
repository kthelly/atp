package lista02;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Fa�a um algoritmo que leia um n�mero N, some todos os n�meros inteiros de 1 a
		 * N, e mostre o resultado.
		 */

		// Declaracao de vari�veis
		int numero, contador = 0, soma = 0;

		// Entrada de dados.
		System.out.println("Digite um n�mero: ");
		numero = sc.nextInt();

		// Processamento. Soma os numeros inteiros de 1 ate n�mero.
		for (int i = 0; i < numero; i++) {
			contador++;
			soma = soma + contador;
		}

		// Sa�da de dados.
		System.out.println("A soma �: " + soma);

		sc.close();
	}

}
