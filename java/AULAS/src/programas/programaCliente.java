package programas;

import java.util.Scanner;

import POO.Cliente;

public class programaCliente {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Cliente cliente1 = new Cliente();
		
		System.out.println("Bom dia, qual seu nome? ");
		cliente1.nome = leia.next();
		System.out.println("Você irá pagar com nosso cartão fidelidade? ");
		cliente1.pagamento = leia.next();
		cliente1.formaDePagamento();
		System.out.println("Deseja cpf na nota? ");
		cliente1.notaFiscal = leia.next();
		cliente1.cpfNotaFiscal();
		System.out.println("Obrigada por comprar conosco, " +cliente1.nome+ "! ");
		

	}

}
