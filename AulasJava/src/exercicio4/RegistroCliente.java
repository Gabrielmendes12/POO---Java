package exercicio4;

public class RegistroCliente extends DadosPessoais {
	
	private int cpf;
	private int limiteCredito;
	
	public RegistroCliente(String nome, String endereco, String bairro, String cidade, String estado, String cep, String telefone, int cpf, int limiteCredito) {
		
		super(nome, endereco, bairro, cidade, estado, cep, telefone);
		//this.cpf = cpf;
		//this.limiteCredito = limiteCredito;
		setCpf(cpf);
		setLimiteCredito(limiteCredito);
	}
	
	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(int limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
}
