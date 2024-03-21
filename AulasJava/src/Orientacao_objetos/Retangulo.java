package Orientacao_objetos;

// retiramos o static para tornar os objetos dinâmicos

public class Retangulo {
	public int base = 5;
	public int altura = 7;
	
	public void exibeArea() {
		System.out.println("A área do retângulo é: "+(base*altura));
	}
	
	public void exibePerimetro() {
		System.out.println("O perímetro do retângulo é: "+(2*base + 2*altura));
	}

}
