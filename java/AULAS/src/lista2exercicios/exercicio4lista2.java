package lista2exercicios;

import java.util.Scanner;

public class exercicio4lista2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in); 
		
		int num;
		
		System.out.println("Digite um número inteiro: ");  
		num = leia.nextInt(); 
		
		if(num < 0) {
			System.out.println("Não é possível calcular com número negativo! ");
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
