package exemplosmetodos;

import java.util.Scanner; // biblioteca para entrada de dados(input do usuário)

public class EntradaDado {
	public static void main(String argv[]) {
		float nota1, nota2, trabalho, media;
		Scanner sc = new Scanner(System.in); 
		/* Declara um objeto chamado sc do tipo Scanner que possibilita a entrada via teclado*/
		
		System.out.println("Entre com a nota 1:");
		nota1 = sc.nextFloat(); // A variável nota1 recebe o conteúdo do teclado
	
		System.out.println("Entre com a nota 2:");
		nota2 = sc.nextFloat();
		
		System.out.println("Entre com a nota do Trabalho:");
		trabalho = sc.nextFloat();
		
		media = (nota1 + nota2 + trabalho)/3;
		System.out.println("Media: "+media);
		sc.close();
		
	}
}