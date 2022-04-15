package primeiraLista;

import java.util.Scanner;

public class Exercicio04 {

	/*
	 * Faça um programa que leia um número e mostre uma mensagem indicando se este
	 * número é par ou ímpar e se é positivo ou negativo.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		
		System.out.println("Digite um numeros: ");
		num1 = sc.nextInt();
		
		if (num1 == 0) {
			System.out.println("Número inválido");
			return;
		}
		
		if (num1 % 2 == 0 && num1 > 0) {
			System.out.println("O numero " + num1 + " é par e positivo");
		} else if (num1 % 2 == 0 && num1 < 0) {
			System.out.println("O numero " + num1 + " é par e negativo");
		} else if (num1 % 2 == 1 && num1 > 0) {
			System.out.println("O numero " + num1 + " é impar e negativo");
		} else {
			System.out.println("O numero " + num1 + " é impar e negativo");
		}
	}

}
