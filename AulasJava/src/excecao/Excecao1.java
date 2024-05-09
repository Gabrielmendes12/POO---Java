package excecao;

import java.util.Scanner;

public class Excecao1 {
	
	public static void main (String args[]) {
		
		int val1, val2, result;
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Entre com o primeiro valor: ");
			val1 = sc.nextInt();
			
			System.out.print("Entre com o segundo valor: ");
			val2 = sc.nextInt();
			
			result = val1 / val2;
			
			System.out.println(val1 + " / " + val2 + " = " + result);	
		} // fim do try
		
		catch(Exception e) {
			System.out.println("Erro: voce informou um dado de entrada errado" + e.getMessage());
			e.printStackTrace();
		} // fim do catch
	}
}
