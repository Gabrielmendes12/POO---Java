package trabalho_AP2;

public class Empregado {
	
	private int matricula;
	private String nome;
	private float salario;

	
	// Construtor
	public Empregado(int matricula, String nome, float salario) {
		this.matricula = matricula;
		this.nome = nome;
		this.salario = calcularNovoSalario(salario);
	}

	public int getMatricula() {
		return matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public float getSalario(){
		return salario;
	}
	
	private float calcularNovoSalario(float salario) {
		if (salario <= 1000) {
			return salario * 1.20f;
		}
		else if (salario <= 2000) {
			return salario * 1.15f;
		}
		else if (salario <= 3000) {
			return salario * 1.10f;
		}
		else {
			return salario * 1.05f;
		}
	}
}
