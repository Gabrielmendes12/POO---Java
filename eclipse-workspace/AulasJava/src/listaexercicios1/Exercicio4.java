package listaexercicios1;

public class Exercicio4 {
	
public static void main(String[] argv) {
	    
	    double precoFabrica = 35000;
	    double percentualDistribuidor = 25;
	    double percentualImposto = 15;
	    
	    double lucroDistribuidor = precoFabrica * percentualDistribuidor/100;
	    double valorImposto = precoFabrica * percentualImposto/100;
	    double precoFinal = precoFabrica + lucroDistribuidor + valorImposto;
	    
	   	System.out.println("O lucro do distribuidor é de: " + lucroDistribuidor); // + para concatenar 
        System.out.println("O valor do imposto é de: " + valorImposto);
        System.out.println("O preço final é de: " + precoFinal);
        
	}

}
