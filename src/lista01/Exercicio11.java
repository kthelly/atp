package lista01;

import java.util.Scanner;

public class Exercicio11 {

	/*
	 * Fa�a um programa que l� dois valores e escreve cada um juntamente com a
	 * mensagem: �� m�ltiplo de 2� ou �N�o � m�ltiplo de dois�, dependendo se o
	 * n�mero � par ou �mpar.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2;
		
		System.out.println("Digite dois valores:");
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		
		if (n1 % 2 == 0) {
			System.out.println("O numero " + n1 + " � m�ltiplo de 2");
		} else {
			System.out.println("O numero " + n1 + " n�o � m�ltiplo de dois");
		}
		
		if (n2 % 2 == 0) {
			System.out.println("O numero " + n2 + " � m�ltiplo de 2");
		} else {
			System.out.println("O numero " + n2 + " n�o � m�ltiplo de dois");
		}
	}

}
