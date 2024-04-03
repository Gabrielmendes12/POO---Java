package exercicio3;

public class Carro {
	
	private String marca;
	private String cor;
	private int ano;
	private int velocidade;
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getCor(){
		return cor;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setVel(int velocidade) {
		this.velocidade = velocidade;
	}
	
	public int getVel() {
		return velocidade;
	}
	
	
	void acelerar(int aceleracao) {
		velocidade += aceleracao;
	}
	
	void freiar(int reducao) {
		velocidade -= reducao;
	}
}
