package exercicio4;

public class PrincipalDados {
	
	public static void main(String args[]) {
		
		//Criando um cliente
		RegistroCliente cliente1 = new RegistroCliente("Edgar", "Rua A, 123", "Bairro A", "Cidade A", "Estado A", "12345-678", "123456789", 123456789, 10000);
		// Criando um fornecedor
        RegistroFornecedor fornecedor1 = new RegistroFornecedor("Rodrigo", "Rua B, 456", "Bairro B", "Cidade B", "Estado B", "98765-432", "987654321", 987654321, 50000);

        // Exibindo informações do cliente
        System.out.println("***Informações do Cliente***");
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Endereço: " + cliente1.getEndereco());
        System.out.println("Bairro: " + cliente1.getBairro());
        System.out.println("Cidade: " + cliente1.getCidade());
        System.out.println("Estado: " + cliente1.getEstado());
        System.out.println("CEP: " + cliente1.getCep());
        System.out.println("Telefone: " + cliente1.getTelefone());
        System.out.println("CPF: " + cliente1.getCpf());
        System.out.println("Limite de Crédito: " + cliente1.getLimiteCredito());

        // Exibindo informações do fornecedor
        System.out.println("\n***Informações do Fornecedor***");
        System.out.println("Nome: " + fornecedor1.getNome());
        System.out.println("Endereço: " + fornecedor1.getEndereco());
        System.out.println("Bairro: " + fornecedor1.getBairro());
        System.out.println("Cidade: " + fornecedor1.getCidade());
        System.out.println("Estado: " + fornecedor1.getEstado());
        System.out.println("CEP: " + fornecedor1.getCep());
        System.out.println("Telefone: " + fornecedor1.getTelefone());
        System.out.println("CNPJ: " + fornecedor1.getCnpj());
        System.out.println("Limite de Venda: " + fornecedor1.getLimiteVenda());
    }	
}

