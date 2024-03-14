package listaexercicios2;

public class Retangulo2 {
	
	public static void main(String argv[]) {
	    int base = 5; // variáveis do escopo do método por isso não declaro com int novamente
	    int altura = 3;
	    
	
	    System.out.println("A base do retângulo é: " + base);
	    System.out.println("A altura do retângulo é: " + altura);
	    exibeArea(base, altura);
	    exibePerimetro(base, altura);
	    
	}

	public static void exibeArea(int base, int altura){
		System.out.println("A área do retângulo é: " + (base*altura));
	}
	
	public static void exibePerimetro(int base, int altura){
		System.out.println("O perímetro do retângulo é: " + (2*(base+altura)));
	}

	
}