package aplicacao;

import java.util.Scanner;

import entidades.Conta;
import entidades.ContaPoupanca;

public class TesteEdBank {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		Conta cliente1 = new Conta (34, "ARIEL");
		double valor; 
		
		ContaPoupanca cp1 = new ContaPoupanca(5, "MARCOS", 15);
		
		
		
		System.out.println("Cliente: "+cliente1.getNomeCliente());
		System.out.println("Saldo atual: "+cliente1.getSaldo());
		System.out.println("Digite o valor de CREDITO: ");
		valor = leia.nextDouble();
		cliente1.credito(valor);
		System.out.println("Saldo atual: "+cliente1.getSaldo());
		cliente1.debito(200.00);
		System.out.println("Saldo atual: "+cliente1.getSaldo());
	}

}
