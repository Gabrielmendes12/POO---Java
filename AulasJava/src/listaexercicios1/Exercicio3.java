package listaexercicios1;

public class Exercicio3 {
	public static void main(String argv[]) {
		
		double deposito = 500;
		double taxaJuros = 3;
		double rendimento = deposito * taxaJuros/100;
		double valorTotal = deposito + rendimento;
		
		System.out.println("O valor do rendimento é de: " + rendimento); // + para concatenar 
        System.out.println("O novo valorTotal é de: " + valorTotal);
	}

}
