package classe_abstrata;

public class ProfessorHorista extends Professor {
	
	private float horasTrabalhadas;  
	private float valorHora;
	
	public void setHorasTrabalhadas(float horasTrabalhadas) {  
		this.horasTrabalhadas = horasTrabalhadas; 
	}
	
	public void setValorHora(int valorHora) {
		this.valorHora = valorHora; 
	}  
	public float getHorasTrabalhadas() {
		return horasTrabalhadas; 
	}  
	public float getValorHora() {
		return valorHora; 
	}

	public double calculaSalario() {
		return(getHorasTrabalhadas() * getValorHora() - super.getDesconto()); 
	}


	
}
