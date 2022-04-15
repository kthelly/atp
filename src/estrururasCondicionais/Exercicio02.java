package estrururasCondicionais;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		String casado = "CASADA", solteiro = "SOLTEIRA";
		Scanner sc = new Scanner(System.in);
		String estadoCivil;

		char sexo;
		double tempo;
		
		System.out.println("Digite o seu sexo (F para femenino e M para masculino):");
		sexo = sc.next().charAt(0);
		System.out.println("Digite o seu estado civil (CASADA(O) ou SOLTEIRA(O)");
		estadoCivil = sc.next();
		
		if (estadoCivil.equalsIgnoreCase("CASADA")) {
			System.out.println("Há quanto tempo você está casada? ");
			tempo = sc.nextDouble();
			System.out.println(
					"Você é do sexo: " + sexo + "\nEstado civil: " + estadoCivil + "\nTempo de casada:" + tempo);
		} else{
			System.out.println("Você é do sexo: " + sexo + "\nEstado civil: " + estadoCivil);
		}
	}
}
