package Orientacao_objetos;

public class UsaRetangulo {
	public static void main (String args[]) {
		// instanciando um objeto
		Retangulo r1 = new Retangulo(); // objeto r1 do tipo Retangulo que adquire os valores base e altura da classe Retangulo
		Retangulo r2 = new Retangulo();
		
		r1.base = 4;
		r1.altura = 8;
		r2.base = 5;
		r2.altura = 10;
		
		System.out.print("\n**Retangulo r1**");
		System.out.println("\nBase: " + "" + r1.base); // operador "." para acessar os valores
		System.out.println("Altura: " + "" + r1.altura);
		r1.exibeArea();
		r1.exibePerimetro(); 
		
		
		System.out.print("\n**Retangulo r2**");
		System.out.println("\nBase: " + "" + r2.base); // operador "."(pertence) para acessar os valores
		System.out.println("Altura: " + "" + r2.altura);
		r2.exibeArea();
		r2.exibePerimetro(); 
	}
}
