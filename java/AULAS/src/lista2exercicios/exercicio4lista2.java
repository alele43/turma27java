package lista2exercicios;

import java.util.Scanner;

public class exercicio4lista2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in); 
		
		int num;
		
		System.out.println("Digite um n�mero inteiro: ");  
		num = leia.nextInt(); 
		
		if(num < 0) {
			System.out.println("N�o � poss�vel calcular com n�mero negativo! ");
		}
		else if (num ==0) {
			System.out.println("Numero 0 � neutro");
		}
		else if (num%2==0) {
			System.out.printf("O n�meor %d � par ", num);
		}
		else {
			System.out.printf("O n�mero %d � impar" ,num);
		}
	}

}
