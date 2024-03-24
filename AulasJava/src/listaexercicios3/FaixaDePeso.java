package listaexercicios3;

public class FaixaDePeso {
	
	public static void main (String args[]) {
		double minha_altura = 1.85;
		double meu_peso = 75;
		
		//Chamando o método obtemIMC e armazenando o resultado em uma variável
		double meu_IMC = obtemIMC(minha_altura, meu_peso);
		
		//Passando o IMC calculado para o método comparaIMC
		comparaIMC(meu_IMC);
		
	}
	
	public static double obtemIMC(double altura, double peso) {
		return peso / (altura * altura);	
	}
	
	public static void comparaIMC(double IMC) {
		if (IMC <= 18.5) {
			System.out.println("Você está abaixo do peso normal.");
		}
		else if (IMC > 18.5 && IMC <= 25) {
			System.out.println("O seu peso está na faixa de normalidade.");
		}
		else if (IMC > 25 && IMC <= 30) {
			System.out.println("Você está acima do peso normal.");
		}
		else
			System.out.println("Você precisa perder uns quilinhos.");
	}
}
