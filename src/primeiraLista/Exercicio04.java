package primeiraLista;

import java.util.Scanner;

public class Exercicio04 {

	/*
	 * Fa�a um programa que leia um n�mero e mostre uma mensagem indicando se este
	 * n�mero � par ou �mpar e se � positivo ou negativo.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		
		System.out.println("Digite um numeros: ");
		num1 = sc.nextInt();
		
		if (num1 == 0) {
			System.out.println("N�mero inv�lido");
			return;
		}
		
		if (num1 % 2 == 0 && num1 > 0) {
			System.out.println("O numero " + num1 + " � par e positivo");
		} else if (num1 % 2 == 0 && num1 < 0) {
			System.out.println("O numero " + num1 + " � par e negativo");
		} else if (num1 % 2 == 1 && num1 > 0) {
			System.out.println("O numero " + num1 + " � impar e negativo");
		} else {
			System.out.println("O numero " + num1 + " � impar e negativo");
		}
	}

}
