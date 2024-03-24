package listaexercicios4;

// Exercício 4

public class Estacoes2 {
	
	public static void main(String args[]) {
		int mês = 5;
		System.out.print("A estação do ano correspondente ao mês " + mês + " é ");
		imprimeEstacao(mês);
	}
	
	public static void imprimeEstacao(int mes){
		String estação;
		
		switch(mes) {
		case 1:
        case 2:
        case 3:
            estação = "Verão";
            break;
        case 4:
        case 5:
        case 6:
            estação = "Outono";
            break;
        case 7:
        case 8:
        case 9:
            estação = "Inverno";
            break;
        case 10:
        case 11:
        case 12:
            estação = "Primavera";
            break;
        default:
            estação = "Mês inválido";
            break;
		}
		System.out.println(estação);
	}		
}
