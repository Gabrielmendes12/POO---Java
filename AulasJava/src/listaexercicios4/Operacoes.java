package listaexercicios4;

// Exercício 5

public class Operacoes {
	public static void main (String args[]) {
		double num1 = 5.5;
		double num2 = 3.2;
		int escolha = 2; // corresponde ao caso de operação que será aplicado
		
		switch(escolha){
		case 1:
			System.out.println("A soma dos números é: " + somaNumeros(num1, num2));
			break;
		case 2:
			System.out.println("A diferença entre os números é: " + subtrNumeros(num1, num2));
			break;
		case 3:
			System.out.println("O produto dos números é: " + multNumeros(num1, num2));
			break;
		case 4:
			System.out.println("A divisão entre os números é: " + divNumeros(num1, num2));
			break;
		default:
			System.out.println("Escolha inválida!");
			break;
		}
	}
	
	public static double somaNumeros(double a, double b) {
		return a + b;	
	}
	public static double subtrNumeros(double a, double b) {
		return a - b;
	}
	public static double multNumeros(double a, double b) {
		return a * b;
	}
	public static double divNumeros (double a, double b) {
		return a / b;
	}

}