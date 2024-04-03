package Geometrico;

public class Circulo {
	
	public double raio;
	public double pi;
	
	public void exibeArea() {
		System.out.println("A área do círculo é: "+(pi * (raio * raio)));
	}
	
	public void exibePerimetro() {
		System.out.println("O perímetro ou cumprimento da circunferência é: "+(2* pi * raio));
	}
	
}
