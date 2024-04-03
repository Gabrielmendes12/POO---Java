package carro;

public class Carro {
	String marca;
	String cor;
	boolean motorEstado;
	int rotacaoMotor = 0;
	
	public Carro() {
		marca = "palio";
		cor = "azul";
		motorEstado = false;
	}
	
	public Carro(String marca, String cor, boolean motorEstado) {
		this.marca = marca;
		this.cor = cor;
		this.motorEstado = motorEstado;
	}
	
	void ligaMotor() {
		motorEstado = true;
		rotacaoMotor = 1000;
		System.out.println("O motor foi ligado");
	}
	void desligaMotor() {
		motorEstado = false;
		rotacaoMotor = 0;
		System.out.println("O motor foi desligado.");
	}
	
	void acelerar() {
		rotacaoMotor += 100;
		System.out.println("O motor foi acelerado!!");
		System.out.println("A rotação do motor é: " + rotacaoMotor);
	}
	
	void desacelerar() {
		rotacaoMotor -= 100;
		System.out.println("O motor foi desacelerado!!");
		System.out.println("A rotação do motor é: " + rotacaoMotor);
	}
	
	
	void mostraAtributos() {
		System.out.println("O carro tem a cor " + cor + " e é da marca " + marca);
		if (motorEstado == true)
			System.out.println("O motor ja esta ligado.");
		else {
			System.out.println("O motor esta desligado");
		}
	}
}
