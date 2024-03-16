package listaexercicios1;

public class Exercicio2 {

	public static void main(String argv[]) {
	    int salarioBase = 1500;
	    int gratificacao = salarioBase * 5/100;
	    int imposto = salarioBase * 7/100;
	    
	    int salarioReceber = salarioBase + gratificacao - imposto;
	    
	    System.out.println("O salário a receber é de: R$ " + salarioReceber);
		
	}
}
