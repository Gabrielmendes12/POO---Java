package videoaula;

public class Produto {
	
	// atributos
	String nome;
	String marca;
	float valor;
	
	// construtores
	
	Produto(){ // construtor padrão sempre necessário
		
	}
	
	Produto(String nome){
		this.nome = nome;
	}
	
	Produto(String nome, String marca){
		this.nome = nome;
		this.marca = marca;
	}
	
	Produto(String nome, String marca, float valor){
		this.nome = nome;
		this.marca = marca;
		this.valor = valor;
	}
	
	void mostrarAtributos() {
		System.out.println("O nome do produto é: " + nome);
		System.out.println("A marca do produto é: " + marca);
		System.out.println("O valor do produto é: " + valor);
	}
	
}
