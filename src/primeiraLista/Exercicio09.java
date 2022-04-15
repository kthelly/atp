package primeiraLista;

import java.util.Scanner;

public class Exercicio09 {

	/*
	 * Faça um programa para determinar se uma pessoa é maior ou menor de idade. a
	 * maioridade civil é atingida quando a pessoa completa 16 anos. A maioridade
	 * penal é atingida quando a pessoa completa 18 anos. A pessoa irá fornecer o
	 * dia de hoje e a sua data de nascimento. O programa deverá imprimir se a
	 * pessoa já tem maioridade civil ou penal
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double dian, mesn, anon, diad, mesd, anod, idade;

		System.out.println("Digite o dia que você nasceu o mês e o ano: ");
		dian = sc.nextDouble();
		mesn = sc.nextDouble();
		anon = sc.nextDouble();
		
		System.out.println("Digite a data de hoje (dia, mês e ano): ");
		diad = sc.nextDouble();
		mesd = sc.nextDouble();
		anod = sc.nextDouble();
		
		idade = dian + (30 * mesn) + (365 * (anod - anon));
		
		if ((idade > 5840) || (idade == 5840) && (idade < 6570)) {
			System.out.println("Você já atingil a maior idade civil!");
		} else if (idade > 6570 || idade == 6570) {
			System.out.println("Você já atingil a maior idade civil!");
		}
	}
}
