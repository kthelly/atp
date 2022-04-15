package primeiraLista;

import java.util.Scanner;

public class Exercicio10 {

	/*
	 * Faça um programa para ler dois valores: 
	 * N1 e N2, 
	 * e se N1 for maior que N2
	 * executa a soma de N1 e N2; 
	 * caso contrário, executa uma subtração.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2, resultado;
		
		System.out.println("Digite N1 e N2:");
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		
		resultado = n1 > n2 ? (n1 + n2) : (n1 - n2);
		System.out.println("O resultado é: " + resultado);
	}

}
