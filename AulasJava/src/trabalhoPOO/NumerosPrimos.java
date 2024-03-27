package trabalhoPOO;

public class NumerosPrimos {
	
	public static void main (String args[]) {
		System.out.println("Os números primos entre 1 e 100 são: ");
		
		// Construtor
		int n;
		for (n = 2; n <= 100; n++) {
			if (numeroEhPrimo(n)) {
				System.out.printf("%d ",n);
			}
		} 
	}
	
	public static boolean numeroEhPrimo(int num) {
		
		if (num <= 1) // 1 não é numero primo
			return false;
		
		int i;
		
		for(i=2; i<num; i++) {
			if (num % i == 0) { // operador módulo -> se o resto da divisão do num pelo valor que está na iteração = 0, o número não é primo
				return false;
			}
		}
		return true; // retorno será somente os números primos
	}
}
