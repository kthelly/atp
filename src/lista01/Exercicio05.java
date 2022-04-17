package lista01;

import java.util.Scanner;

public class Exercicio05 {

	/*
	 * Faça um programa para ler dois números. Se os números forem iguais imprimir a
	 * mensagem: "NÚMEROS  IGUAIS" e encerrar a execução; caso contrário, imprimir o
	 * de maior valor.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2;
		
		System.out.println("Digite 2 numeros: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if (num1 == num2) {
			System.out.println("NÚMEROS IGUAIS");
		}
		
		else if (num1 > num2) {
			System.out.println("O numero " + num1 + " é o maior");
		} else {
			System.out.println("O numero " + num2 + " é o maior");
		}
	}
}
