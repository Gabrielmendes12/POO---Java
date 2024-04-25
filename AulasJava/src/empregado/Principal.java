package empregado;

public class Principal {
	
	public static void main(String args[]) {

	// Instancia objeto da classe EmpComissionado
	EmpComissionado EmpCom = new EmpComissionado("Ana","Alves","987654321-01",30000,0.03);

	// Instancia objeto da classe EmpFixoComissionado
	EmpFixoComissionado EmpFixoCom = new EmpFixoComissionado("Roberto","Silveira", "123456789-10",20000,0.02,300);

	// obtém os dados do Empregado Comissionado  
	System.out.println("Dados do Empregado Comissionado:\n");
	
	System.out.printf("%s %s \n", "Nome: ", EmpCom.getNome());
	System.out.printf("%s %s \n", "Sobrenome: ", EmpCom.getSobrenome());
	System.out.printf("%s %s \n", "CPF: ", EmpCom.getCpf());
	System.out.printf("%s %.2f \n", "Vendas: ", EmpCom.getTotalVendas());  
	System.out.printf("%s %.2f \n", "Comissao: ", EmpCom.getTaxaComissao());  
	System.out.printf("%s %.2f \n", "Salario total: ", EmpCom.salario());
	
	// obtém os dados do Empregado Fixo Comissionado  
	System.out.println("\n\nDados do Empregado Fixo Comissionado:\n");
	
	System.out.printf("%s %s \n", "Nome: ", EmpFixoCom.getNome());
	System.out.printf("%s %s \n", "Sobrenome: ", EmpFixoCom.getSobrenome());
	System.out.printf("%s %s \n", "CPF: ", EmpFixoCom.getCpf());
	System.out.printf("%s %.2f \n", "Vendas: ", EmpFixoCom.getTotalVendas());  
	System.out.printf("%s %.2f \n", "Comissao: ", EmpFixoCom.getTaxaComissao());  
	System.out.printf("%s %.2f \n", "Salario total: ", EmpFixoCom.salario());
	
	}
}

