package videoaula;

public class ProdutoTestar {

	public static void main(String args[]) {
		
		// Construtor padrão:
		Produto p1 = new Produto();
		p1.nome = "Caneta preta";
		p1.marca = "Bic";
		p1.valor = 1.50f;
		
		// Construtor de 2 parâmetros
		Produto p2 = new Produto("Caneta vermelha", "Faber");
		p2.valor = 1.69f;
		
		// Construtor de 3 parâmetros
		Produto p3 = new Produto("Borracha", "Mercure", 1.89f); // valor expresso na notação float
		
		// objeto p1
		p1.mostrarAtributos();
		System.out.println("\n");
		
		// objeto p2
		p2.mostrarAtributos();
		System.out.println("\n");
		
		// objeto p3
		p3.mostrarAtributos();
	}
	
}
