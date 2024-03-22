package exemplosmetodos;

public class Principal1 {
	public static void main (String argv[]) {
		int script = 6, atuacao = 9, direcao = 8;
		System.out.print("A pontuação do filme é: ");
		
		System.out.print(Filme3.pontuarFilme(script, atuacao, direcao));
	}
	// Importo o método pontuarFilme da classe Filme3.java, podendo assim atribuir os valores nos parâmetros existentes
	// Operador "."
}
