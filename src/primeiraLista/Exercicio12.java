package primeiraLista;

import java.util.Scanner;

public class Exercicio12 {
	/*
	 * Tendo como dados de entrada a altura e o sexo (M ou F) de uma pessoa. Faça um
	 * programa para calcular seu peso ideal, utilizando as seguintes fórmulas: 
	 	• Para Homens: (72.7 * altura) - 58; 
	 	• Para Mulheres: (62.1 * altura) - 44.7
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double altura, pesoId;
		char sexo;
		
		System.out.println("Digite por favor sua altura em centímetros: ");
		altura = sc.nextDouble();
		
		System.out.println("Digite F para femenino e M para masculino: ");
		sexo = sc.next().charAt(0);
		
		if (sexo == 'F' || sexo == 'f') {
			pesoId = (62.1 * altura) - 44.7;
			System.out.println("De acordo com seu sexo e altura o seu peso ideal é:  " + pesoId + "Kg");
		} else if (sexo == 'M' || sexo == 'm') {
			pesoId = (72.7 * altura) - 58;
			System.out.println("De acordo com seu sexo e altura o seu peso ideal é:  " + pesoId + "Kg");
		}
	}
}
