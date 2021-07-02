package introducao;

import java.util.Scanner;

public class desafioparimpar {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in); //adc scanner pra ler valor digitado no console
		
		int num; // declaração variavel do tipo inteiro 
		
		System.out.println("Escolha um número inteiro "); //imprimir fase na tela 
		num = leia.nextInt(); //comando ler e guardar dado digitado pelo usuario 
		
		if(num < 0) {
			System.out.println("Não é possível calcular com numero negativo ");
		}
		else if (num ==0) {
			System.out.println("Numero 0 é neutro");
		}
		else if (num%2==0) {
			System.out.printf("O númeor %d é par ", num);
		}
		else {
			System.out.printf("O número %d é impar" ,num);
		}
	}

}
