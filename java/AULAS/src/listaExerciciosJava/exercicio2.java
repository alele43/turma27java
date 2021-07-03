package listaExerciciosJava;

import java.util.Scanner;

public class exercicio2 {
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num1, num2, num3;
	
		System.out.println("Digite um número inteiro: ");
		num1 = leia.nextInt();
		
		System.out.println("Digite outro número inteiro: ");
		num2 = leia.nextInt();
	
		System.out.println("Digite outro número inteiro: ");
		num3 = leia.nextInt();
		
		if( num1 < num2 ) {
			if(num2 < num3) {
				System.out.printf(num1+"-"+num2+"-"+num3);
			}
			else if (num1 < num3) {
				System.out.printf(num1+"-"+num3+"-"+num2);
			} 
			else {
				System.out.printf(num3+"-"+num1+"-"+num2);
			}
			
		}
		else if (num2 < num3) {
			if (num1 < num3) {
				System.out.printf(num2+"-"+num1+"-"+num3);
				
			}
			else {
				System.out.printf(num2+"-"+num3+"-"+num1);
			}
			
		} 
		else {
				System.out.printf( num3+"-"+num2+"-"+num1);
		}
		
	}	
}
	
