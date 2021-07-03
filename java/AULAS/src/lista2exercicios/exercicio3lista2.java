package lista2exercicios;

import java.util.Scanner;

public class exercicio3lista2 {
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int num1; 
		int num2;
		int num3;
		int num4;
		
		
		System.out.println("Digite um numero inteiro: ");
		num1 =  leia.nextInt();

		System.out.println("Digite um numero inteiro: ");
		num2 =  leia.nextInt();

		System.out.println("Digite um numero inteiro: ");
		num3 =  leia.nextInt();

		System.out.println("Digite um numero inteiro: ");
		num4 =  leia.nextInt();
		
		num1 = Math.round(num1*num1);
		num2 = Math.round(num2*num2);
		num3 = Math.round(num3*num3);
		num4 = Math.round(num4*num4);
		
		
		if (num3 >= 1000) {
			
			System.out.printf("O terceiro número digitado é " +num3+ " portanto, maior que 1000.");
			System.out.println("\nFIM DO PROGRAMA!!!!!!!!\n");
		}
		else {
			System.out.printf("Os números digitados ao quadrado são: \n" +num1+"\n"  +num2+"\n" +num3+"\n" +num4);
		}
		
	}
}
