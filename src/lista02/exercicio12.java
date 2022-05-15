package lista02;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Estenda o problema anterior, considerando agora que o tempo da MEIA VIDA e a
		 * massa do material radioativo são entrados pelo usuário.
		 */
		
		// Declaração de variáveis e entrada de dados.
		float massa;
		int tempoH, tempoMin, tempoS, tempoMeia, contador = 0, meiaVida;
		System.out.println("Digite a massa do material radioativo em gramas: ");
		massa = sc.nextFloat();
		System.out.println("Digite a meia vida do material radioativo em segundos: ");
		meiaVida = sc.nextInt();
		// Processamento. Quanto tempo a massa reduzirá para menos de 0.5g
		while (massa > 0.5) {
			massa = massa / 2;
			contador++;
		}

		// Processamento do tempo de meia vida.
		tempoMeia = contador * meiaVida;
		tempoH = tempoMeia / 3600;
		tempoMin = (tempoMeia % 3600) / 60;
		tempoS = (tempoMeia % 3600) % 60;

		// Saída de dados.
		System.out.println("O tempo para a massa do material ser menor que 0.5g é de: " + tempoH + "h " + tempoMin
				+ "min " + tempoS + "s");

		sc.close();
	}
}
