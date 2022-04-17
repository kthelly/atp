package lista01;

import java.util.Scanner;

public class Exercicio11 {

	/*
	 * Faça um programa que lê dois valores e escreve cada um juntamente com a
	 * mensagem: “É múltiplo de 2” ou “Não é múltiplo de dois”, dependendo se o
	 * número é par ou ímpar.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2;
		
		System.out.println("Digite dois valores:");
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		
		if (n1 % 2 == 0) {
			System.out.println("O numero " + n1 + " é múltiplo de 2");
		} else {
			System.out.println("O numero " + n1 + " não é múltiplo de dois");
		}
		
		if (n2 % 2 == 0) {
			System.out.println("O numero " + n2 + " é múltiplo de 2");
		} else {
			System.out.println("O numero " + n2 + " não é múltiplo de dois");
		}
	}

}
