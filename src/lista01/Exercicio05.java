package lista01;

import java.util.Scanner;

public class Exercicio05 {

	/*
	 * Fa�a um programa para ler dois n�meros. Se os n�meros forem iguais imprimir a
	 * mensagem: "N�MEROS  IGUAIS" e encerrar a execu��o; caso contr�rio, imprimir o
	 * de maior valor.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2;
		
		System.out.println("Digite 2 numeros: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if (num1 == num2) {
			System.out.println("N�MEROS IGUAIS");
		}
		
		else if (num1 > num2) {
			System.out.println("O numero " + num1 + " � o maior");
		} else {
			System.out.println("O numero " + num2 + " � o maior");
		}
	}
}
