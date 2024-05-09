package excecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecao2 {
	
	public static void main(String args[]) {
		
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
		
		catch(ArithmeticException arithmeticException) {
			System.out.printf("\nExceção: %s\n", arithmeticException);
			System.out.printf("Divisão por zero! Tente Novamente");
		
		} // fim de catch
		
		catch(InputMismatchException e2) {
			System.out.println("Erro: dado de entrada errado ");
			System.out.println("O erro foi: "+e2);
		}
	}
}
