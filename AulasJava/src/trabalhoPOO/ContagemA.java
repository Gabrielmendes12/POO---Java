package trabalhoPOO;

public class ContagemA {
	
	public static void main(String args[]) {
		String frase = "Os nomes das classes em Java precisam começar com uma letra e depois destas quaisquer combinações de letras e dígitos."
				+ " Como padrão, os nomes são substantivos que iniciam com uma letra maiúscula. "
				+ "Para as constantes é costume utilizar sempre letras maiúsculas nos nomes.";

        int contador = contarLetraA(frase);
        
        System.out.println("O número de ocorrências da letra 'a' na frase é: " + contador);
	}
	
	public static int contarLetraA(String frase){
		int contador = 0;
		int i;
		
		for (i=0; i<frase.length(); i++) {
			// método para descobrir o caractere_atual
			if (frase.charAt(i) == 'a') {
				contador++;
			}
		}
		return contador;
	}
}

// igual joão


