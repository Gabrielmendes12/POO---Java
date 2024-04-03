package exercicio3;

public class LivroTeste {
	
	public static void main(String args[]) {
		
		 // Instanciando diferentes livros usando os construtores diferentes
		
		System.out.println("****Livro1 com atributos padrão****\n");
		
		Livro livro1 = new Livro(); // objeto criado com o construtor padrão
		livro1.mostrarAtributos();
		
		Livro livro2 = new Livro("A Revolução dos Bichos", "George Orwell", "1ª edição", "Companhia das Letras", 1945);
		System.out.println("\nLivro 2 criado com os seguintes atributos:"); 
		livro2.mostrarAtributos();
		
		// Livro 1 será atualizado com os métodos get e set
		System.out.println("\n****Livro 1 atualizado****");
		
		livro1.setNome("Dom Casmurro");
		livro1.setAutor("Machado de Assis");
		livro1.setEdicao("2ª edição");
		livro1.setEditora("Editora ABC");
		livro1.setAno_Publicacao(1899);
		
		//System.out.println("oi" + livro1.getAno_Publicacao());
		livro1.mostrarAtributos();
		
		
	}
}
