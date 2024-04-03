package videoaula;

public class Aluno {
	
	private String nome;
	private int idade;
	
	public void setNome(String nome) { // método de atribuição para atributos privados
		this.nome = nome;
	}
	
	public String getNome() { // método para obter um valor privado -> será retornado apenas o nome
		return nome;
	}
	
	public void setIdade(int idade) {
		if (idade > 0 && idade < 100) { // condição de restrição
			this.idade = idade;
			System.out.println("Idade cadastrada");
		}
		else {
			System.out.println("Erro! Idade Inválida.");
		}	
	}
	
	public int getIdade() {
		return idade;
	}
}
