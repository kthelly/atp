package lista02;

import java.util.Scanner;

public class exercicio03 {

	// programa que imprima os 100 primeiros m�ltiplos de 3.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Declara��o de vari�veis
		int repeti��o = 0, num = 1;

		while (repeti��o < 100) {
			//// Condi��es para determinar se o n�mero � multiplo de 3
			if (num % 3 == 0) {
				System.out.print(" " + num + " ");
				repeti��o++;
			}
			num++;
		}
		sc.close();
	}
}
