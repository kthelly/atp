package atp;

import java.util.Scanner;

public class Exer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soma=0, num, n, media, maior, menor, posicao=0; 
		System.out.println("Digite o tamanho do vetor: ");
		n = sc.nextInt(); 
		int vetor[] = new int[n]; 
		
		for(int i = 0; i < n; i++) {
			System.out.println("Digite um numero do vetor:");
			num = sc.nextInt();
			vetor[i] = num;
		}
		maior = vetor[0];
		menor = vetor[0];
			for(int i = 0; i < n; i++) {
			soma = soma + vetor[i];
			
			if (vetor[i] > maior) {
				maior = vetor[i];
			} 
			if (vetor[i] < menor) {
				menor = vetor[i];
				posicao = i;
			} 
		}
		 media = soma/n;
		System.out.println("O maior numero do vetor é: " + maior);
		System.out.println("A soma do vetor é: " + soma);
		System.out.println("A méida do vetor é: " + media);
		System.out.println("O maior numero do vetor é: " + maior);
		System.out.println("O menor numero do vetor é: " + menor + " e a sua posição é: " + posicao);
		sc.close();
		
	}

}
