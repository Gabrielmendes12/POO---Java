package array_list;

import java.util.Scanner;
import java.util.ArrayList;

public class TestaCarro {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Carro> carros = new ArrayList<Carro>();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o modelo do carro "+(i+1)+ ":");
			String modelo = sc.nextLine();
			
			System.out.println("Digite a placa do carro "+(i+1)+ ":");
			String placa = sc.nextLine();
			
			System.out.println("Digite o ano do carro "+(i+1)+ ":");
			int ano = sc.nextInt();
			
			System.out.println("Digite a kilometragem do carro "+(i+1)+ ":");
			int kms = sc.nextInt();
			
			sc.nextLine();
			
			Carro carro = new Carro(modelo, placa, ano, kms);
			carros.add(carro);
		}
		// Exibindo dados dos carros inseridos
        System.out.println("\n-----Dados dos carros-----");
        for (int j = 0; j < carros.size(); j++) {
            carros.get(j).exibeKms(j + 1);
        }
        sc.close();
	}
}
