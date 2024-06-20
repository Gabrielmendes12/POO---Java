package array_objetos;

public class TestaPonto {
	public static void main(String args[ ]) {
		/* O vetor é um objeto em java.
		O fato de você criá-lo não quer dizer que você esteja criando
		instâncias dos tipos de objetos que ele referencia.*/
		Ponto[] pontos = new Ponto[10]; // cria um vetor pontos de 10 posições
		
		// carregando as instâncias no vetor de objetos pontos 
		for(int i=0;i<pontos.length;i++) {
			Ponto p = new Ponto();	// cria um objeto Ponto p 
			p.setX(i);
			p.setY(2*i);
			pontos[i] = p;
		}
		// exibindo as instâncias a partir do vetor de objetos pontos 
		for(int i=0;i<pontos.length;i++) {
			Ponto p = pontos[i];
			System.out.println("Ponto - X: " + p.getX() + " Y: " + p.getY());
		}
	}
}
