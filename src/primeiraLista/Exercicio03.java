package primeiraLista;

import java.util.Scanner;

public class Exercicio03 {
	/*
	 * Faça um programa para ler dois valores numéricos e apresentar a diferença do
	 * maior pelo menor.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double num1, num2, dif;
		
		System.out.println("Digite 2 numeros: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if (num1 > num2) {
			dif = num1 - num2;
			System.out.println("A diferença entre o maior número e o menor é " + dif);
		} else {
			dif = num2 - num1;
			System.out.println("A diferença entre o maior número e o menor é " + dif);
		}
	}

}
