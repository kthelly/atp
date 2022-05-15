package lista02;

import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Elabore um programa que solicite que o usu�rio entre com 40 n�meros
		 * quaisquer. Ao final apresente separadamente: a. A soma dos 20 primeiros
		 * n�meros digitados; b. A soma do 21� n�mero at� o 30�; c. A soma do 31� n�mero
		 * at� o 40�.
		 */
		// declara��o de vari�veis
		int numero, soma20 = 0, soma30 = 0, soma40 = 0;

		/*
		 * Processamento. Seleciona a faixa de interesse para efetuar as somas.
		 */
		for (int i = 1; i <= 40; i++) {
			System.out.print("Digite um n�mero:");
			numero = sc.nextInt();
			if (i > 0 && i < 21) {
				soma20 = soma20 + numero;
			} else if (i > 20 && i < 31) {
				soma30 = soma30 + numero;
			} else {
				soma40 = soma40 + numero;
			}
		}
		// Sa�da de dados.
		System.out.println("A soma dos 20 primeiros n�meros digitados �: " + soma20);
		System.out.println("A soma do 21� n�mero at� o 30� �: " + soma30);
		System.out.println("A soma do 31� n�mero at� o 40� �: " + soma40);

		sc.close();
	}
}
