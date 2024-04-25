package exercicio4;

public class RegistroFornecedor extends DadosPessoais {
	private int cnpj;
	private int limiteVenda;
	
	public RegistroFornecedor(String nome, String endereco, String bairro, String cidade, String estado, String cep, String telefone, int cnpj, int limiteVenda) {
		
		super(nome, endereco, bairro, cidade, estado, cep, telefone);
		setCnpj(cnpj);
		setLimiteVenda(limiteVenda);	
	}
	
	public int getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	
	public int getLimiteVenda() {
		return limiteVenda;
	}
	
	public void setLimiteVenda(int limiteVenda) {
		this.limiteVenda = limiteVenda;
	}
}
