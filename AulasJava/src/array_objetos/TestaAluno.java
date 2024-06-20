package array_objetos;

import java.util.Scanner;

public class TestaAluno {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		Aluno [] alunos = new Aluno[5];
		
		for (int i=0; i<alunos.length; i++) {
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
			
			alunos[i] = new Aluno(nome, matricula, nota1, nota2); 
		}
			
		// criando objeto para os alunos inseridos
		System.out.println("\nDados dos alunos:");
	    for (int j = 0; j < 5; j++) {
	        Aluno aluno = alunos[j];
	        System.out.println("Aluno " + (j + 1) + ":");
	        System.out.println("Nome: " + aluno.getNome());
	        System.out.println("Matricula: " + aluno.getMatricula());
	        System.out.println("Nota 1: " + aluno.getNota1());
	        System.out.println("Nota 2: " + aluno.getNota2());
	        System.out.println("Media: " + aluno.media());
	        System.out.println();
        }
	    sc.close();
	}
}

