package colecao;

import java.util.ArrayList;
import java.util.Vector;

public class TestaArrayList3 {
	
	public static void main(String args[]) {
	
		ArrayList<Integer> lista = new ArrayList<Integer>();
		Vector<Character> vetor = new Vector<Character>();
		
		lista.add(10);
		lista.add(30);
		lista.add(40);
		lista.add(1,20);
		System.out.println("ArrayList: "+ lista);
		
		System.out.print("\nfor each:");
		for(Integer i: lista)
			System.out.print(" "+ i);
		
		
		Object[] objeto = lista.toArray(); // retorna um array com os objetos da lista
		System.out.print("\nObjetos:");
		for(int i=0; i<lista.size(); i++)
			System.out.print(" "+ objeto[i]);
		
		System.out.println();
		vetor.add('A');
		vetor.add('C');
		vetor.add('D');
		vetor.add(1, 'B');
		System.out.println("Vector: "+vetor);
		
		Object[] objet = vetor.toArray();
		System.out.print("Objetos: ");
		for(int i=0; i<vetor.size(); i++)
			System.out.print(objet[i]+ " ");
		System.out.println();
	
	
	}
	
	
}