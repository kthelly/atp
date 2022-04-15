package estrururasCondicionais;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a, b, c;
		System.out.println("Digite 3 numeros A,B e C: ");
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();
		if ((a + b) < c)
			System.out.println("A soma de A+B é menor que C e tem resultado igual a:  " + (a+b));
	}

}
