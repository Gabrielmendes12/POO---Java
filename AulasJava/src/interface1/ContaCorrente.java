package interface1;

public class ContaCorrente implements Conta {
	
		private double saldo;
		private double taxaOperacao = 0.20;

		public void depositar(double valor) {
			this.saldo += valor - taxaOperacao;
		}
		public void sacar(double valor) {
			this.saldo -= valor + taxaOperacao;
		}
		public double getSaldo() {
			return this.saldo;
		}
} // fim da classe conta corrente