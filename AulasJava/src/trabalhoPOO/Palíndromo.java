package trabalhoPOO;

import java.util.Scanner;

public class Palíndromo {
	
	public static void main(String args[]) {
		
		System.out.println("Digite a palavra: ");
		Scanner sc = new Scanner(System.in);
		String palavra = sc.nextLine().replaceAll("[^a-zA-Z]", "").toLowerCase(); // removendo espaços
		
		String reversa = "";
		for (int i = palavra.length()-1; i>=0; i--) {
			reversa += palavra.charAt(i);
		}
		if (reversa.equals(palavra)) {
			System.out.println("Palíndromo");
		}
		else {
			System.out.println("Não é Palíndromo");
		}
	}
}
