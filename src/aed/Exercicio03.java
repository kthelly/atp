package aed;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double numeroReal, numeroFracionado, numeroArredondado;
		int numeroInteiro;

		System.out.print("Digite um numero Real: ");
		
		numeroReal = sc.nextDouble();
		numeroInteiro = (int) numeroReal;
		numeroFracionado = numeroReal - numeroInteiro;
		numeroArredondado = numeroInteiro + 1;

		System.out.println("A parte inteira do número é: " + numeroInteiro + 
					"\nA parte fracionada do numero é: " + numeroFracionado + 
					"\nO numero arredondado é: " + numeroArredondado);
	}

}
