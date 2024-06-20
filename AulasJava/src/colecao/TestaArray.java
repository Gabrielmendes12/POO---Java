package colecao;

import java.util.Arrays;

public class TestaArray {
	
	public static void main(String[] args) {
		
		int[] vetor = {60,30,50,70,20,40,10}; // criação de um vetor de objetos com tamanho e elementos definidos
		int chaveProcura, indice;
		
		System.out.println("Numero de Elementos do vetor: "+ vetor.length);
		System.out.println("Vetor Original:"+ Arrays.toString(vetor)); // Retorna uma String com conteúdo do vetor de int
		Arrays.sort(vetor);
		System.out.println("Vetor Ordenado: "+ Arrays.toString(vetor));
		chaveProcura = 50;
		indice = Arrays.binarySearch(vetor, chaveProcura); // vetor deve estar ordenado
		
		System.out.println("Chave: " + chaveProcura);
		System.out.println("Índice do elemento Chave: "+ indice);
	}
}
