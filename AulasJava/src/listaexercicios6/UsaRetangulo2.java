package listaexercicios6;

import java.util.Scanner;

public class UsaRetangulo2 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); // objeto da classe scanner que recebe o input
		
		NovoRetangulo R1 = new NovoRetangulo();
		NovoRetangulo R2 = new NovoRetangulo();
		
		System.out.println("Digite o valor da base de R1: ");
		R1.base = sc.nextInt();
		
		System.out.println("Digite o valor da altura de R1: ");
		R1.altura = sc.nextInt();
		
		System.out.println("\n---Dados Retangulo R1--");
		System.out.println("A área de R1 é: " + R1.exibeArea());
		System.out.println("O perímetro de R1 é: " + R1.exibePerimetro());
		
		// Retangulo R2
		System.out.println("\nDigite o valor da base de R2: ");
		R2.base = sc.nextInt();
		
		System.out.println("Digite o valor da altura de R2: ");
		R2.altura = sc.nextInt();
		
		System.out.println("\n---Dados Retangulo R2--");
		System.out.println("A área de R2 é: " + R2.exibeArea());
		System.out.println("O perímetro de R2 é: " + R2.exibePerimetro());
		
	}
}
