package listaexercicios1;

public class Exercicio1 {

	public static void main(String argv[]) {
		double salario = 2500.00;
		double percentual = 10.00;
		
		double aumento = salario * percentual/100;
		double novoSalario = salario + aumento;
		
        System.out.println("O percentual de aumento é de: " + aumento); // + para concatenar 
        System.out.println("O novo salario é de: " + novoSalario);
	}
}
