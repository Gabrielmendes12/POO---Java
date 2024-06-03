package colecao;

import java.util.ArrayList;

public class TestaArrayList2 {

	public static void main(String[] args) {
		
		ArrayList<String> nome = new ArrayList<String>();
		nome.add("Ana");
		nome.add("João");
		nome.add("Maria");
		nome.add("Pedro");
		nome.add("Jose");
		
		for (String i: nome)
			System.out.println(i);
	}
}
