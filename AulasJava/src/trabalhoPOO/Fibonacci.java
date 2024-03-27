package trabalhoPOO;

public class Fibonacci {
	
	public static void main (String args[]) {
		// Imprimir os 15 primeiros termos desta sequência
		
		int t; // estrutura de repetição para exibir os termos
		System.out.println("Os 15 primeiros números da sequência são: ");
		
		for(t = 1; t <= 15; t++) {
			System.out.printf("%d ", fibonacci(t)); // formatação espaçada
		}
		
		
	}
	// método que calcula o n-ésimo termo desta sequência
	public static int fibonacci(int n) {
		if (n == 1)
			return 0;
		
		else if (n == 2)
			return 1;
		
		int i, F=0, F1=0, F2=1;  
		
		for(i = 3; i<=n; i++) {
			F = F1 + F2;
			F1 = F2;
			F2 = F;
		}
		
		return F;
	}
}
