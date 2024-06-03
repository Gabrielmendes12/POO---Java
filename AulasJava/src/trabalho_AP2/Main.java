package trabalho_AP2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Lista para armazenar os dados do objeto Empregado
		ArrayList<Empregado> empregados = new ArrayList<Empregado>();
		
		// Loop para ler e armazenar os dados de 5 empregados
		for (int i=0; i<5; i++) {
			System.out.println("Digite a matrícula do empregado " + (i+1) + ":");
			int matricula = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Digite o nome do empregado " + (i + 1) + ":");
            String nome = sc.nextLine();
            
            System.out.println("Digite o salário do empregado " + (i + 1) + ":");
            float salario = sc.nextFloat();
            
            // Criando objeto Empregado e adicionando à lista:
            Empregado emp = new Empregado(matricula, nome, salario);
            empregados.add(emp);
			
		}
		
		// Imprimindo matrículas e nomes dos empregados com salário acima de 3000,00
        System.out.println("Empregados com novo salário acima de 3000,00:");
        for (Empregado emp : empregados) {
            if (emp.getSalario() > 3000.00) {
                System.out.println("Matrícula: " + emp.getMatricula() + ", Nome: " + emp.getNome().toUpperCase());
            }
        }
        sc.close();
    }
}

