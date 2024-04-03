package Geometrico;

import java.util.Scanner;

public class Teste {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		Circulo c = new Circulo();
		Circulo c1 = new Circulo();
		
		System.out.println("Digite o valor do raio do circulo c:");
		c.raio = sc.nextDouble();
		
		System.out.println("Digite o valor de pi:");
		c.pi = sc.nextDouble();
		
		System.out.println("Digite o valor do raio do circulo c1:");
		c1.raio = sc.nextDouble();
		
		System.out.println("Digite o valor de pi:");
		c1.pi = sc.nextDouble();
		
		
		System.out.println("\n** Circulo c **");
		c.exibeArea();
		c.exibePerimetro();
		
		System.out.println("\n** Circulo c1 **");
		c1.exibeArea();
		c1.exibePerimetro();
		
		sc.close(); // Fechar o Scanner após usar
	}

}
