package array_list;

import java.util.Scanner;
import java.util.ArrayList;

public class TestaAluno {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		//Lista "alunos" para armazenar os dados do objeto Aluno
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		
		// Loop para ler e armazenar os dados de 5 alunos
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite os dados do aluno "+(i+1)+ ":");
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Matrícula: ");
			int matricula = sc.nextInt();
			
			System.out.print("Nota 1: ");
			float nota1 = sc.nextFloat();
			
			System.out.print("Nota 2: ");
			float nota2 = sc.nextFloat();
			
			sc.nextLine(); // consumir a nova linha do buffer
			
			// Criando objeto aluno e adicionando à lista de alunos:
			Aluno aluno = new Aluno(nome, matricula, nota1, nota2);
			alunos.add(aluno);
		}
		
		// Exibindo dados dos alunos inseridos
        System.out.println("\n-----Dados dos alunos-----");
        for (int j = 0; j < alunos.size(); j++) {
            alunos.get(j).exibirDados(j + 1);
        }

        sc.close();
	}
}
