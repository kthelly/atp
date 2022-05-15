package lista02;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Um determinado material radioativo perde metade de sua massa a cada 50
		 * segundos. Este tempo � chamado na f�sico-qu�mica de MEIA-VIDA. Dada a massa
		 * inicial, em gramas, fa�a um algoritmo que determine o tempo necess�rio para
		 * que essa massa se torne menor que 0.5 gramas. Ao final do algoritmo escreva a
		 * massa inicial e o tempo calculado em horas, minutos e segundos.
		 */
		// Declara��o de vari�veis e entrada de dados.
		float massa;
		int tempoH, tempoMin, tempoS, tempoMeia, contador = 0;
		System.out.println("Digite a massa do material radioativo em gramas: ");
		massa = sc.nextFloat();

		// Processamento. Quanto tempo a massa reduzir� para menos de 0.5g
		while (massa > 0.5) {
			massa = massa / 2;
			contador++;
		}

		// Processamento do tempo de meia vida.
		tempoMeia = contador * 50;
		tempoH = tempoMeia / 3600;
		tempoMin = (tempoMeia % 3600) / 60;
		tempoS = (tempoMeia % 3600) % 60;

		// Sa�da de dados.
		System.out.println("O tempo para a massa do material ser menor que 0.5g � de: " + tempoH + "h " + tempoMin
				+ "min " + tempoS + "s");

		sc.close();
	}
}
