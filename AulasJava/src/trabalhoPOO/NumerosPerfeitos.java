package trabalhoPOO;

public class NumerosPerfeitos {

	 public static void main(String args[]) {
	        int count = 0;
	        int num = 1;
	        
	        System.out.println("Os números perfeitos são: ");

	        while (count < 6) {
	            int soma = 0;
	            for (int i = 1; i < num; i++) {
	                if (num % i == 0) {
	                    soma += i;
	                }
	            }
	            if (soma == num) {
	                System.out.println(num);
	                count++;
	            }
	            num++;
	        }
	    }
	}

