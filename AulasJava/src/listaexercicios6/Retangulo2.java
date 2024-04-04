package listaexercicios6;

import java.util.Scanner;

public class Retangulo2 {
	
	public int base;
	public int altura;
	
	Retangulo2(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da base: ");
		base = sc.nextInt();
		
		System.out.println("Digite o valor da altura: ");
		altura = sc.nextInt();
	}
	
	public int exibeArea() {
		return base*altura;
	}
	
	public int exibePerimetro() {
		return 2*base + 2*altura;
	}
	
}
