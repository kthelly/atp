package aed;

import java.util.Scanner;

public class Exercicio04 {

	// TODO Implemente a sequencia de fibonacci lembrando que Fn = Fn - 1 + Fn - 2
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero para ser calculado a sequencia de fibonacci: ");
		
		int quebraLinha = 0, num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			quebraLinha++;
			System.out.print(fibonacci(i) + " ");
			if (quebraLinha == 10) {
				quebraLinha = 0;
				System.out.println("\n");
			}
		}
	}

	private static int fibonacci(int num) {
		return num == 0 ? 0 : (num == 1 || num == 2) ? 1 : fibonacci(num - 2) + fibonacci(num - 1);
	}

}
