package videoaula;

public class AlunoTestar {
	
	public static void main(String [] args) {
		
		Aluno aluno1 = new Aluno();
		
		//aluno1.nome = "Gabriel";
		//aluno1.idade = 20;
		
		aluno1.setNome("Gabriel");
		
		System.out.println("O nome do usuário é: " + aluno1.getNome());
		
		aluno1.setIdade(20);
		System.out.println("A idade do usuário é: " + aluno1.getIdade());
	}
}
