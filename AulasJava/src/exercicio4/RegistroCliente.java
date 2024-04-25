package exercicio4;

public class RegistroCliente extends DadosPessoais {
	
	private int cpf;
	private int limiteCredito;
	private String localTrabalho;
	private String telefoneContato;
	
	public RegistroCliente(String nome, String endereco, String bairro, String cidade, String estado, String cep, String telefone, 
			int cpf, int limiteCredito, String localTrabalho, String telefoneContato) {
		
		super(nome, endereco, bairro, cidade, estado, cep, telefone); // herda os atributos da superclasse DadosPessoais
		//this.cpf = cpf; -> aceita o operador this dentro do construtor mas o método set é + apropriado
		//this.limiteCredito = limiteCredito;
		setCpf(cpf);
		setLimiteCredito(limiteCredito);
		setLocalTrabalho(localTrabalho);
		setTelefoneContato(telefoneContato);
		
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
	
	public String getLocalTrabalho() {
		return localTrabalho;
	}

	public void setLocalTrabalho(String localTrabalho) {
		this.localTrabalho = localTrabalho;
	}

	public String getTelefoneContato() {
		return telefoneContato;
	}

	public void setTelefoneContato(String telefoneContato) {
		this.telefoneContato = telefoneContato;
	}	
}
