package listaVetores;

import java.util.Scanner;

/*
 * Dado um vetor A com n n�meros reais, obter um outro vetor B, tamb�m com n
 * n�meros reais, da seguinte forma: 
 * B[0] = 1*A[0] 
 * B[1] = 2*A[1] 
 * B[2] = 3*A[1] + 2*A[2] 
 * B[3] = 4*A[1] + 3*A[2] + 2*A[3] ( ...e assim por diante,)
 */
public class exercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// Declara��o de variaveis.
		int n;
		int contador = 1, contador2, contador3;
		double soma;

		// Entrada de dados vetorX.
		System.out.println("Digite o tamanho do vetor: ");
		n = sc.nextInt();
		
		double[] A = new double[n];
		double[] B = new double[n];

		/*
		 * Entrada e Processamento de dados. Temos uma repeti��o for para armazenar os
		 * n�meros do vetor.
		 */
		
		System.out.println("Digite os n�meros do vetor: ");
		for (int i = 0; i < A.length; i++) {
			System.out.print("->");
			A[i] = sc.nextDouble();
		}
		// Processamento. Manipula��o dos n�meros do vetor.  
		for (int i = 0; i < B.length; i++) {
			soma = 0;
			contador2 = 1;
			if(i < 2) {
				B[i] = contador* A[i];
			} else {
				contador3 = contador;
				while (contador3>1) {
					soma = (contador3*A[contador2]) + soma;
					contador3--;
					contador2++;
				}
				B[i] = soma; 
			}contador ++;
		}
		
		// Sa�da de dados.
		System.out.println("O vetor resultante �: ");
		for (int i = 0; i < B.length; i++) {
			System.out.print(B[i] + ", ");
		}
		sc.close();
	}
}
