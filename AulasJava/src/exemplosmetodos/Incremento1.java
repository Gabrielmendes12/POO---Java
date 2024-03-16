package exemplosmetodos;

public class Incremento1 {

	public static void main(String args[]) {
		int contador = 10, numero = 2, x,y,var;
		System.out.println("contador=" + contador);
		System.out.println("numero=" + numero);
		System.out.println();
			
			
		numero++; // pós incremento
		contador--;  // pós decremento
		System.out.println("contador=" + contador);
		System.out.println("numero=" + numero);
		System.out.println();
		
		x = 2;
		var = 0;
		var = ++x; // pré incremento 
		System.out.println("x=" +x);
		System.out.println("var=" +var);
		System.out.println();
	
		y = 2;
		var = 0;
		var = y++; // pós incremento 
		System.out.println("x=" + y);
		System.out.println("var=" +var); 
		System.out.println();
	}
}