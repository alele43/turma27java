package entidades;

public class Conta {
		//atributos
		private int numero;
		private String nomeCliente;
		private double saldo;
		
		//constructor
		public Conta(int numero, String nomeCliente) {
			super();
			this.numero = numero;
			this.nomeCliente = nomeCliente;
		}

		//encapsulamento - getters and setters
		public int getNumero() {
			return numero;
		}

		/*public void setNumero(int numero) {
			this.numero = numero;
		}
		*/

		public String getNomeCliente() {
			return nomeCliente;
		}

		public void setNomeCliente(String nomeCliente) {
			this.nomeCliente = nomeCliente;
		}

		public double getSaldo() {
			return saldo;
		}

		/*public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		*/
		
		//metodos
		
		public void credito(double valorCredito) {
			this.saldo =this.saldo + valorCredito;
		}
		
		public void debito(double valorDebito) {
			this.saldo = this.saldo - valorDebito;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
