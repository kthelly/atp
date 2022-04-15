package atp;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, numB, max, min;
		
		System.out.println("Exercicio 1: Digite 2 numeros e imprima o maior");
		
		System.out.println("Digite um numero: ");
		num = sc.nextInt();
		max = num;
		
		System.out.println("Digite outro numero: ");
		num = sc.nextInt();
		if(num > max)
			max = num;
		System.out.println("Maior numero é: " + max);
		

		System.out.println("\nExercicio 2: Digite 3 numeros e imprima o menor");
		System.out.println("Digite um numero: ");
		num = sc.nextInt();
		min = num;
		
		System.out.println("Digite outro numero: ");
		num = sc.nextInt();
		if(num < min)
			min = num;
		System.out.println("Digite outro numero: ");
		num = sc.nextInt();
		if(num < min)
			min = num;
		System.out.println("Menor numero é: " + min);
		
		System.out.println("\nExercicio 3: Digite 2 e calcule a diferenca do maior para o menor");
		
		System.out.println("Digite um numero: ");
		num = sc.nextInt();
		min = num;
		
		System.out.println("Digite outro numero: ");
		num = sc.nextInt();
		
		
		
	}
	
	
}
