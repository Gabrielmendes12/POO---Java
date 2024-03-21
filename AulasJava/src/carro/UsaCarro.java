package carro;

public class UsaCarro {
	public static void main (String args[]) {
		
		Carro meuCarro = new Carro(); // instancia o objeto 
		Carro outroCarro = new Carro();
		
		meuCarro.marca = "Palio"; // inicia o atributo marca 
		meuCarro.cor = "azul";	// inicia o atributo cor 
		
		
		System.out.println("Mostrando os atributos:"); 
		meuCarro.mostraAtributos(); //mensagem para o objeto

		System.out.println("-------");
		System.out.println("Ligando o motor...");
		meuCarro.ligaMotor(); //mensagem para ligar o carro
		
		System.out.println("Mostrando os atributos:"); 
		meuCarro.mostraAtributos();

		System.out.println("-------");
		System.out.println("Desligando o motor...");
		meuCarro.desligaMotor();
		
		System.out.println("Mostrando os atributos:"); 
		meuCarro.mostraAtributos();
				
		System.out.println("***********************");
		outroCarro.marca = "Gol";
		outroCarro.cor = "Prata";
		System.out.println("Mostrando os atributos:");
		
		outroCarro.acelerar();
		outroCarro.mostraAtributos();
		System.out.println("***********************");
		outroCarro.desacelerar();
		
		
	}
}
