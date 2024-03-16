package exemplosmetodos;

public class Filme1 {
	public static void main(String argv[]) {
		int script = 6, atuacao = 9, direcao = 8;
		System.out.print("A pontuação do filme é ");
		System.out.println(pontuarFilme(script, atuacao, direcao));		
	} 
	
public static int pontuarFilme(int s, int a, int d) {
	return s + a + d;
	}
}
