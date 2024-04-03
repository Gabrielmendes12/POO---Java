package exercicio3;

public class Livro {
	
	private String nome;
	private String autor;
	private String edicao;
	private String editora;
	private int ano_publicacao;
	
	// Construtor padrão
	public Livro() {
		this.nome = "desconhecido";
		this.autor = "desconhecido";
		this.edicao = "desconhecido";
		this.editora = "desconhecido";
		this.ano_publicacao = 0;
		System.out.println("Livro criado com os seguintes atributos:"); // msg de saudação
	}
	
	// Construtor alternativo
	public Livro(String nome, String autor, String edicao, String editora, int ano_publicacao) {
		this.nome = nome;
		this.autor = autor;
		this.edicao = edicao;
		this.editora = editora;
		this.ano_publicacao = ano_publicacao;
	}
	
	// Métodos getters e setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	
	public String getEdicao() {
		return edicao;
	}
	
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	public String getEditora() {
		return editora;
	}
	
	public void setAno_Publicacao(int ano_publicacao) {
		this.ano_publicacao = ano_publicacao;
	}
	
	public int getAno_Publicacao() {
		return ano_publicacao;
	}
	
	// Método para imprimir os atributos
	void mostrarAtributos() {
		System.out.println("O nome do livro é: " + nome);
		System.out.println("O autor do livro é: " + autor);
		System.out.println("O livro é da " + edicao);
		System.out.println("O nome da editora é: " + editora);
		System.out.println("O ano da publicação foi : " + ano_publicacao);
	}
}
