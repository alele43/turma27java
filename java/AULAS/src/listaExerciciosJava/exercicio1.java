package listaExerciciosJava;

import java.util.Scanner;

public class exercicio1 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Digite um n�mero inteiro: ");
		num1 = leia.nextInt();
		
		
		System.out.println("Digite outro n�mero inteiro: ");
		num2 = leia.nextInt();
	
		
		System.out.println("Digite outro n�mero inteiro: ");
		num3 = leia.nextInt();
		
		
		if (num1 > num2 && num1 > num3) {
			System.out.printf("Esse � o maior n�mero: %d!", num1);
		}
		else if (num2 > num1 && num2 > num3) {
			System.out.printf("Esse � o maior n�mero: %d!", num2);
		}
		else {
			System.out.printf("Esse � o maior n�mero: %d!",num3);
		}
		
	}
	
}
