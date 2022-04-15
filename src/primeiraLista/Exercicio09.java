package primeiraLista;

import java.util.Scanner;

public class Exercicio09 {

	/*
	 * Fa�a um programa para determinar se uma pessoa � maior ou menor de idade. a
	 * maioridade civil � atingida quando a pessoa completa 16 anos. A maioridade
	 * penal � atingida quando a pessoa completa 18 anos. A pessoa ir� fornecer o
	 * dia de hoje e a sua data de nascimento. O programa dever� imprimir se a
	 * pessoa j� tem maioridade civil ou penal
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double dian, mesn, anon, diad, mesd, anod, idade;

		System.out.println("Digite o dia que voc� nasceu o m�s e o ano: ");
		dian = sc.nextDouble();
		mesn = sc.nextDouble();
		anon = sc.nextDouble();
		
		System.out.println("Digite a data de hoje (dia, m�s e ano): ");
		diad = sc.nextDouble();
		mesd = sc.nextDouble();
		anod = sc.nextDouble();
		
		idade = dian + (30 * mesn) + (365 * (anod - anon));
		
		if ((idade > 5840) || (idade == 5840) && (idade < 6570)) {
			System.out.println("Voc� j� atingil a maior idade civil!");
		} else if (idade > 6570 || idade == 6570) {
			System.out.println("Voc� j� atingil a maior idade civil!");
		}
	}
}
