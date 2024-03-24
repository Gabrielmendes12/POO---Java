package listaexercicios4;

//Exercício 3

public class Estacoes1 {
	
	public static void main (String args[]) {
		int mês = 2;
		System.out.print("A estação do ano correspondente ao mês " + mês + " é ");
		imprimeEstacao(mês);
	}
	
	public static void imprimeEstacao(int mes){
		String estação;
		if (mes <= 3) {
			estação = "Verão";
		}
		else if (mes > 3 && mes <= 6) {
			estação = "Outono";
		}
		else if (mes > 6 && mes <= 9) {
			estação = "Inverno";
		}
		else if (mes > 9 && mes <= 12) {
			estação = "Primavera";
		}
		else {
			estação = "Mês inválido";
		}
		
		System.out.print(estação);
	}
}
