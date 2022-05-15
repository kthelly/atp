package lista02;

import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Elabore um programa que solicite que o usuário entre com 40 números
		 * quaisquer. Ao final apresente separadamente: a. A soma dos 20 primeiros
		 * números digitados; b. A soma do 21º número até o 30º; c. A soma do 31º número
		 * até o 40º.
		 */
		// declaração de variáveis
		int numero, soma20 = 0, soma30 = 0, soma40 = 0;

		/*
		 * Processamento. Seleciona a faixa de interesse para efetuar as somas.
		 */
		for (int i = 1; i <= 40; i++) {
			System.out.print("Digite um número:");
			numero = sc.nextInt();
			if (i > 0 && i < 21) {
				soma20 = soma20 + numero;
			} else if (i > 20 && i < 31) {
				soma30 = soma30 + numero;
			} else {
				soma40 = soma40 + numero;
			}
		}
		// Saída de dados.
		System.out.println("A soma dos 20 primeiros números digitados é: " + soma20);
		System.out.println("A soma do 21º número até o 30º é: " + soma30);
		System.out.println("A soma do 31º número até o 40º é: " + soma40);

		sc.close();
	}
}
