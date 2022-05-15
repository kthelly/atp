package lista02;

import java.util.Scanner;

public class exercicio03 {

	// programa que imprima os 100 primeiros múltiplos de 3.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Declaração de variáveis
		int repetição = 0, num = 1;

		while (repetição < 100) {
			//// Condições para determinar se o número é multiplo de 3
			if (num % 3 == 0) {
				System.out.print(" " + num + " ");
				repetição++;
			}
			num++;
		}
		sc.close();
	}
}
