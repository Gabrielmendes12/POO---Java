package listaexercicios6;

public class UsaRetangulo3 {

	public static void main(String args[]) {
		
		Retangulo2 R1 = new Retangulo2();
		
		System.out.println("A base de R1 é: " + R1.base);
        System.out.println("A altura de R1 é: " + R1.altura);
		System.out.println("A área de R1 é: " + R1.exibeArea());
		System.out.println("O perímetro de R1 é: " + R1.exibePerimetro());
		
	}
}
