package trabalhoPOO;

import java.util.Scanner;

public class Principal {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		Veiculo veiculo1 = new Veiculo();
		
		System.out.println("Digite o valor do peso do v1:");
		veiculo1.setPeso(sc.nextInt());
		// veiculo1.peso = sc.nextInt();

		System.out.println("Digite o valor da velocidade max do v1:");
		veiculo1.setVelocMax(sc.nextInt());
		
		System.out.println("Digite o valor do preço:");
		veiculo1.setPreco(sc.nextFloat());
		
		System.out.println("Pesov1: "+ veiculo1.getPeso()); // veiculo1.peso
		System.out.println("VelocMaxv1: "+ veiculo1.getVelocMax());
		System.out.println("VelocMaxv1: "+ veiculo1.getPreco());
		
		
		
		System.out.println("\nDigite o valor do peso do v2:");
		int pesoV2 = sc.nextInt();

		System.out.println("Digite o valor da velocidade max do v2:");
		int velocMaxV2 = sc.nextInt();
		
		System.out.println("Digite o valor do preço do v2:");
		float precoV2 = sc.nextFloat();
		
		Veiculo veiculo2 = new Veiculo(pesoV2, velocMaxV2, precoV2);
		
	
		System.out.println("Pesov2: "+ pesoV2);
		System.out.println("VelocMaxv2: "+ velocMaxV2);
		System.out.println("VelocMaxv2: "+ precoV2);
		
		
		//System.out.println(veiculo2.toString()); 
	}
}
