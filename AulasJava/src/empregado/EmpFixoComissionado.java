package empregado;

public class EmpFixoComissionado extends EmpComissionado {
	
	private double salarioBase; // atributo exclusivo
	// construtor da classe
	public EmpFixoComissionado(String nome, String sobreNome, String cpf, double totalVendas, double taxaComissao, double salarioBase){
	// chama construtor da superclasse  
		super(nome,sobreNome,cpf,totalVendas,taxaComissao); 
	// chamada a método da própria classe
		setSalarioBase(salarioBase);
	} // termino do construtor da classe
	
	public void setSalarioBase(double salarioBase){
		this.salarioBase = (salarioBase < 0.0) ? 0.0 : salarioBase;
		}

		public double getSalarioBase() {  
			return salarioBase;
		}
		// calcula o salário  
		public double salario(){
			return getSalarioBase() + super.salario();
		}
} // fim da classe Empregado Fixo Comissionado

