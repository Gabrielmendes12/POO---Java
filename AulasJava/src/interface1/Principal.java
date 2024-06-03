package interface1;

public class Principal {
	
	public static void main(String args[]) {
		
		ContaCorrente contaCorrente = new ContaCorrente();  
		
		contaCorrente.depositar(2500.78);  
		
		contaCorrente.sacar(250);

		ContaPoupanca contaPoupanca = new ContaPoupanca();  
		
		contaPoupanca.depositar(5000.50);  
		
		contaPoupanca.sacar(445);

		System.out.println("\nSaldo da Conta corrente: "+contaCorrente.getSaldo());  
		System.out.println("\nSaldo da Conta Poupança: "+contaPoupanca.getSaldo());
	}
}
