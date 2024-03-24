package listaexercicios3;

// exercício 1

public class Idade {
	
	public static void main(String args[]) {
		int idade = 20;
		analisaIdade(idade);
	}

	public static void analisaIdade(int i) {
		if (i >= 21) {
			System.out.println("Você já é maior de idade.");
		} 
		else {
			System.out.println("Você ainda é menor de idade.");	
		}					
	}
}
