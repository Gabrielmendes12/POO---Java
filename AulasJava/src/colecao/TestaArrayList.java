package colecao;

import java.util.ArrayList;

public class TestaArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<String> nome = new ArrayList<String>();
		nome.add("Ana");
		nome.add("João");
		nome.add("Maria");
		nome.add("Pedro");
		nome.add("Jose");
		nome.add("Fernando");
		
		ArrayList<Integer> idade = new ArrayList<Integer>();
		idade.add(18);
		idade.add(20);
		idade.add(30);
		idade.add(22);
		idade.add(48);
		idade.add(50);
		
		int tam = nome.size();
		for (int i=0; i<tam; i++) {
			System.out.printf("Nome: %s \t Idade %d\n", nome.get(i), idade.get(i));	
		}
	}
}
