package listaexercicios2;

public class Retangulo3 {
	
	public static void main(String argv[]) {
		
		int iBase = 5;
		int iAltura = 3;
		float fBase = 6.0f;
		float fAltura = 4.0f;
		
		System.out.println("A base do retângulo é: " + iBase);
	    System.out.println("A altura do retângulo é: " + iAltura);
	    System.out.println("A base do retângulo é: " + fBase);
	    System.out.println("A altura do retângulo é: " + fAltura);
	    
	    exibeArea(iBase, iAltura);
	    exibePerimetro(iBase, iAltura);
	    exibeArea(fBase, fAltura);
	    exibePerimetro(fBase, fAltura);
	}
	
	public static void exibeArea(int iBase, int iAltura){
		System.out.println("A área do retângulo é: " + (iBase*iAltura));
	}
	
	public static void exibePerimetro(int iBase, int iAltura){
		System.out.println("O perímetro do retângulo é: " + (2*(iBase+iAltura)));
	}
	
	public static void exibeArea(float fBase, float fAltura){
		System.out.println("A área do retângulo é: " + (fBase*fAltura));
	}
	
	public static void exibePerimetro(float fBase, float fAltura){
		System.out.println("O perímetro do retângulo é: " + (2*(fBase+fAltura)));
	}

	
}
