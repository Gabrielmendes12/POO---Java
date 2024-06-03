package classe_abstrata;

public class Main {
	public static void main(String args[]) {
		
		ProfessorDedicado profDedicado = new ProfessorDedicado();  
		
		profDedicado.setMatricula ("1015");
		
		profDedicado.setNome("Joao");  
		
		profDedicado.setIdade(20);  
		
		profDedicado.setDesconto(100);  
		
		profDedicado.setSalarioBruto(5000);

		System.out.println("Salario professor dedicado: R$ " + profDedicado.calculaSalario());
		
		
		ProfessorHorista profHorista = new ProfessorHorista();
		
		profHorista.setMatricula ("1020");
		
		profHorista.setNome("Marcos");  
		
		profHorista.setIdade(25);  
		
		profHorista.setDesconto(30);  
		
		profHorista.setHorasTrabalhadas(30);
		
		profHorista.setValorHora(150);

		System.out.println("Salario professor horista: R$ " + profHorista.calculaSalario());

		}

}
