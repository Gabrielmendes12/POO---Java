package exercicio3;

public class CarroTeste {
	
	public static void main(String args[]) {
		
		Carro c1 = new Carro();
		Carro c2 = new Carro();
		
		c1.setMarca("Tucson");
		System.out.println("A marca do 1° carro é: " + c1.getMarca());
		
		c1.setCor("branco");
		System.out.println("A cor do 1° carro é: " + c1.getCor());
		
		c1.setAno(2015);
		System.out.println("O ano do 1° carro é: " + c1.getAno());
		
		c1.setVel(10);
		System.out.println("A velocidade inicial do 1° carro é de " + c1.getVel() + " km/h");
		c1.acelerar(30);
		System.out.println("A velocidade atual do 1° carro é de " + c1.getVel() + " km/h");
		
		System.out.println("\nRedução para a 2ª marcha:");
		c1.freiar(20);
		System.out.println("A velocidade atual do 1° carro é de " + c1.getVel() + " km/h");
	}
}
