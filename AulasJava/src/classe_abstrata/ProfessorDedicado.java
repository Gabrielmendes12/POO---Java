package classe_abstrata;

public class ProfessorDedicado extends Professor {
	
	private float salarioBruto;
	
	public void setSalarioBruto(float salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	
	public double getSalarioBruto() {
		return salarioBruto;
	}
	
	public double calculaSalario() {
		return(getSalarioBruto() - super.getDesconto());
	}
}
