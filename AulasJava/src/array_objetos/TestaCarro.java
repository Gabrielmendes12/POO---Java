package array_objetos;

import java.util.Scanner;

public class TestaCarro {
	
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	
	Carro[] carros = new Carro[5];
	
	for (int i=0; i<5; i++) {
		System.out.println("Digite o modelo do carro "+(i+1)+ ":");
		String modelo = sc.nextLine();
		
		System.out.println("Digite a placa do carro "+(i+1)+ ":");
		String placa = sc.nextLine();
		
		System.out.println("Digite o ano do carro "+(i+1)+ ":");
		int ano = sc.nextInt();
		
		System.out.println("Digite a kilometragem do carro "+(i+1)+ ":");
		int kms = sc.nextInt();
		
		sc.nextLine();
		
		carros[i] = new Carro(modelo, placa, ano, kms);
	}
	
	for (Carro carro: carros) {// Para cada objeto Carro no array carros
		carro.exibeKms();      // Chame o método exibeKms() do objeto Carro
	}
	
	sc.close();
	}
}
