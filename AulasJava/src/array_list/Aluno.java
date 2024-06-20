package array_list;

public class Aluno {
	
	private String nome;
    private int matricula;
    private float nota1;
    private float nota2;
    
    public Aluno(String nome, int matricula, float nota1, float nota2) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public float getNota1() {
		return nota1;
	}
	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}
	public float getNota2() {
		return nota2;
	}
	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}
	
	public float media() {
		return (nota1 + nota2) / 2;
	}
	
	public void exibirDados(int numero) {
	    System.out.println("Aluno " + numero + ":");
	    System.out.println("Nome: " + this.getNome());
	    System.out.println("Matricula: " + this.getMatricula());
	    System.out.println("Nota 1: " + this.getNota1());
	    System.out.println("Nota 2: " + this.getNota2());
	    System.out.println("Media: " + this.media());
	    System.out.println();
	}
}
