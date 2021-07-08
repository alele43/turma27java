package programas;

import java.util.Scanner;

import objetos.pessoa;

public class CadFriends {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);//instanciou um scanner/teclado
		pessoa amigo1 = new pessoa();
		pessoa amigo2 = new pessoa();
		
		
		System.out.println("Digite seu nome: ");
		amigo1.nome = leia.next();
		System.out.println("Qual seu sexo? F/M/O ");
		amigo1.sexo = leia.next().charAt(0);
		System.out.println("Qual seu ano de nascimento? ");
		amigo1.anoNascimento = leia.nextInt();
		
		System.out.println("Amigo 2");
		System.out.println("Digite seu nome: ");
		amigo2.nome = leia.next();
		amigo2.anoNascimento = 2000;
	
			System.out.printf("Meus amigos são %s e %s" ,amigo1.nome,amigo2.nome);
			
			  if((amigo1.calcularIdade(2021))>(amigo2.calcularIdade(2021))) {
		            System.out.printf("\n%s é mais velha que %s\n", amigo1.nome, amigo2.nome);
		            amigo1.mostrarIdade();//chamei um método
		        } else if ((amigo1.calcularIdade(2021))<(amigo2.calcularIdade(2021))) {
		            System.out.printf("\n%s é mais velho que %s\n", amigo2.nome, amigo1.nome);
		            amigo2.mostrarIdade();
		        } else {
		            System.out.printf("\n%s tem a mesma idade que %s", amigo1.nome, amigo2.nome);
		        }

	}

}
