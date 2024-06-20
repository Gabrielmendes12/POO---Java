package array_list;

public class Carro {
	
	String modelo;
	String placa;
	int ano;
	int kms;
	
	public Carro(String modelo, String placa, int ano, int kms) {
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
		this.kms = kms;
	}
	
	public void exibeKms(int carroNumero) {
		if (this.kms > 100) {
			System.out.println("Dados do carro " + carroNumero + ":");
			System.out.println("Modelo: "+ this.modelo);
			System.out.println("Placa: "+ this.placa);
			System.out.println("Ano: "+ this.ano);
			System.out.println("Kms: "+ this.kms);
		}
	}
}

