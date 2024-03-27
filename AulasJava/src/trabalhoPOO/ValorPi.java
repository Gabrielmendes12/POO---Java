package trabalhoPOO;

public class ValorPi {
	
	public static void main(String[] args) {
		int n = 100000; // Número de termos da série
	    double pi = calcularPi(n);
	    System.out.println("Valor aproximado de pi: " + pi);
	 }
	
    public static double calcularPi(int n) {
        double pi = 0;
        
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {  // se o número for par 
                pi += 1.0 / (2 * i + 1); // adiciono a pi o valor de 1/2i+1
            } else { // senão ele é ímpar
                pi -= 1.0 / (2 * i + 1); //subtraio de pi o valor de 1/2i+1
            }
        }
        return 4 * pi;
    }
}
