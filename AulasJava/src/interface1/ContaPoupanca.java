package interface1;

public class ContaPoupanca implements Conta {
	
		private double saldo;

		public void depositar(double valor) {
			this.saldo += valor;
		}
		public void sacar(double valor) {
			this.saldo -= valor;
		}
		public double getSaldo() {
			return this.saldo;
		}
} // fim da classe ContaPoupanca

