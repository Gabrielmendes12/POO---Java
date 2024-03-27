package trabalhoPOO;

public class NumerosPerfeitos {

	public static void main(String[] args) {
        int count = 0;
        int number = 2; // Começamos a busca a partir do número 2
        
        System.out.println("Os primeiros 4 números perfeitos são:");
        
        while (count < 4) {
            if (isPerfectNumber(number)) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
    
    public static boolean isPerfectNumber(int num) {
        int sum = 1; // Inicializamos com 1, pois 1 é divisor de todos os números
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}

