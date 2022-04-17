package lista01;

import java.util.Scanner;

public class Exercicio02 {

	/*
	 * Faça um programa que receba três números e retorne o menor de todos.
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double num1, num2, num3;
		
		System.out.println("Digite 3 numeros: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		if (num1 < num2 && num1 < num3 || num1 == num2 || num1 == num2) {
			System.out.println("O numero " + num1 + " é o menor entre eles");
		} else if (num2 < num1 && num2 < num3 && num2==num3) {
			System.out.println("O numero " + num2 + " é o menor entre eles");

		} else {
			System.out.println("O numero " + num3 + " é o menor entre eles");
		}

	}

}
