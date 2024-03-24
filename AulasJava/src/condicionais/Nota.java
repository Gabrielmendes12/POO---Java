package condicionais;

public class Nota {
	public static void main (String args[]) {
		String nome = "João", disciplina = "Java";
		float p1 = 4, p2 = 6, p3 = 9, media;
		
		System.out.println("Nome: "+nome);
		System.out.println("Disciplina: "+disciplina);
		System.out.println("P1: "+p1);
		System.out.println("P2: "+p2);
		System.out.println("P3: "+p3);
		
		if (p1<p2 && p1<p3) 
			media = (p2 + p3)/2;
		else
			if(p2<p1 && p2<p3)
				media = (p1 + p3)/2;
			else
				media = (p1 + p2)/2;
		System.out.println("Media: "+media);
		
		if (media >=6)
			System.out.println("Situação: Aprovado");
		else
			System.out.println("Situação: Reprovado");
	}
}
