package trabalhoPOO;

public class Veiculo {
	
	//atributos
	
	private int peso;
	private int velocMax;
	private float preco;
	
	/*
	public int peso;
	public int velocMax;
	public float preco;
	*/
	
	// Construtor para inicializar atributos com 0 (construtor padrão)
	public Veiculo() {
		this.peso = 0;
		this.velocMax = 0;
		this.preco = 0.0f;
	
	}
	
	// Construtor que recebe os atributos como argumentos.
	public Veiculo(int peso, int velocMax, float preco) {
		this.peso = peso;
		this.velocMax = velocMax;
		this.preco = preco;	
	}
	
	// métodos getters e setters
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public void setVelocMax(int velocMax) {
		this.velocMax = velocMax;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public int getVelocMax() {
		return velocMax;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public String toString() {
		return ("peso: " + peso + " velocMax: " + velocMax + " preco: " + preco);
	}
}