package listaexercicios3;

public class Idade2 {
	
	public static void main(String args[]) {
		int idade = 22;
		System.out.print("Você já é ");
		analisaIdade(idade);
		System.out.print(" de idade.");
	}
	
	public static void analisaIdade(int i) {
		System.out.print(i >= 21 ? "maior" : "menor");		
	}
}
