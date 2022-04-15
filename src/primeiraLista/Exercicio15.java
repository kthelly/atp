package primeiraLista;

import java.util.Scanner;

public class Exercicio15 {

	/*
	 * Fa�a  um  programa  que  l�  3  valores  a,  b,  c  e  calcula  e  escreve  a  
	 * m�dia  ponderada  com pesos de 5 para o maior dos 3 valores e 2.5 para os outros dois valores.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, c, maior, menor, meio, mediaP;
		
		System.out.println("Digite 3 n�meros a, b e c: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		maior = a > b ? a : b;
		maior = maior > c ? maior : c;
		menor = a < b ? a : b;
		menor = menor < c ? menor : c;
		
		if ((a < b && b < c) || (c < b && b < a)) {
			meio = b;
		} else if ((b < a && a < c) || (c < a && a < b)) {
			meio = a;
		} else {
			meio = c;
		}

		mediaP = ((maior * 5) + (meio * 3) + (menor * 2.5)) / 10.5;
		System.out.println("O maior n�mero entre eles �: " + maior 
				+ "O n�mero intermedi�rio entre eles �: " + meio 
				+ "O nemor n�mero entre eles �: " + menor
				+ "A m�dia ponderada dos n�meros �: " + mediaP);
	}
}
