package programas;

import POO.Conta;

public class Bancool {

	public static void main(String[] args) {
		
		//instanciar 
		Conta cliente1 = new Conta(1); //(1) é o numero da conta 
		Conta clientevip = new Conta(2, 55.55); //numero conta, saldo
		Conta clienteEspecial = new Conta (3, 1000.00, 10500.00);//numero conta, saldo, limite
		
		System.out.println("Numero da conta é: " +cliente1.getNumero()); //a saida numero conta será a do instanciamento
		cliente1.setNumero(2222); //altera o numero da conta no console
		System.out.println("Numero da conta é: " +cliente1.getNumero());//saída de dados com numero alterado no programa
		
		
		
		clienteEspecial.saca(900.33);
		clienteEspecial.imprimeExtrato();
		
		cliente1.deposita(100.00);
		cliente1.imprimeExtrato();
		cliente1.saca(101.00);
		cliente1.imprimeExtrato();

	}

}
