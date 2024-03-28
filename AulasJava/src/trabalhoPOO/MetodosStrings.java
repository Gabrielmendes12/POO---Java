package trabalhoPOO;

public class MetodosStrings {
	
	public static void main (String args[]) {
		String frase = "Exemplo de uso de métodos para Strings";
		String novaFrase = "";
		
		for (int i = 0; i < frase.length(); i++) {
			char letra = frase.charAt(i);
			
			if (i % 2 == 0) {
				novaFrase += Character.toUpperCase(letra);
			}
			else {
				novaFrase += Character.toLowerCase(letra);
			}
		}
		System.out.println(novaFrase);
	}
}
