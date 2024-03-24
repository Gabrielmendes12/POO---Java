package listaexercicios4;

// Exercício 2

public class Zodiaco2 {
	
	public static void main (String args[]) {
		int signo = 10;
		System.out.print("Você é do seguinte signo do zodíaco: ");
		imprimeSigno(signo);
	}
	public static void imprimeSigno(int num_signo) {
		String signo;
		
		switch(num_signo){
			case 1: 
				signo = "Aquário"; 
				break;
			case 2: 
				signo = "Peixes";
				break;
			case 3:
				signo = "Áries";
				break;
			case 4:
				signo = "Touro";
				break;
			case 5:
				signo = "Gêmeos";
				break;
			case 6:
				signo = "Câncer";
				break;
			case 7:
				signo = "Leão";
				break;
			case 8:
				signo = "Virgem";
				break;
			case 9:
				signo = "Libra";
				break;
			case 10:
				signo = "Escorpião";
				break;
			case 11:
				signo = "Sagitário";
				break;
			case 12:
				signo = "Capricórnio";
				break;
			default:
				signo = "Signo não reconhecido.";
				break;
		}
		System.out.println(signo);
	}

}
