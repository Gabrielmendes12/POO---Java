package listaexercicios2;

public class Retangulo1 {
	
	private static int base;
	private static int altura;
	
	public static void main(String argv[]) {
	    base = 5; // variáveis do escopo do método por isso não declaro com int novamente
	    altura = 3;
	    
	    System.out.println("A base do retângulo é: " + base);
	    System.out.println("A altura do retângulo é: " + altura);
	    System.out.println("A área do retângulo é: " + calculaArea());
	    System.out.println("O perímetro do retângulo é: " + calculaPerimetro());
	}
	
	public static int calculaArea(){
	    return base * altura;
	}
	
	public static int calculaPerimetro(){
	    return 2 * (base + altura);
	}

}
