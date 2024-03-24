package listaexercicios4;

// Exercício 1

public class Zodiaco1 {
	
	public static void main (String args[]) {
		int signo = 1;
		System.out.print("Você é do seguinte signo do zodíaco: ");
		imprimeSigno(signo);
	}
	
	public static void imprimeSigno(int num_signo) {
		String signo;
		if (num_signo == 1) {
			signo = "Aquário";	
		}
		else if (num_signo == 2) {
			signo = "Peixes";
		}
		else if (num_signo == 3) {
			signo = "Áries";
		}
		else if (num_signo == 4) {
			signo = "Touro";
		}
		else if (num_signo == 5) {
			signo = "Gêmeos";
		}
		else if (num_signo == 6) {
			signo = "Câncer";
		}
		else if (num_signo == 7) {
			signo = "Leão";
		}
		else if (num_signo == 8) {
			signo = "Virgem";
		}
		else if (num_signo == 9) {
			signo = "Libra";
		}
		else if (num_signo == 10) {
			signo = "Escorpião";
		}
		else if (num_signo == 11) {
			signo = "Sagitário";
		}
		else if (num_signo == 12) {
			signo = "Capricórnio";
		}
		else {
			signo = "Signo não reconhecido";
		}
		System.out.println(signo);
	}
}
