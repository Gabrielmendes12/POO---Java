package excecao;

import java.util.Scanner;

public class Excecao5 {
	
	public static void main(String args[]){  
		float nota1,nota2,trabalho,media;
		Scanner teclado = new Scanner(System.in);  
		
		try{
			System.out.print("Entre com a primeira nota: ");
			nota1 = teclado.nextFloat();  System.out.print("Entre com a segunda nota: ");
			nota2 = teclado.nextFloat();  System.out.print("Entre com a nota do trabalho: ");  
			trabalho = teclado.nextFloat();
			media = (nota1+nota2+trabalho)/3;  
			System.out.println("A media e : "+media);
		
		}//fim do try
		
		catch(Exception e){
			System.out.println("Houve um erro na entrada de dados ");
		}
		finally{
			System.out.println("fechando arquivos!");
		}
	}
}	
