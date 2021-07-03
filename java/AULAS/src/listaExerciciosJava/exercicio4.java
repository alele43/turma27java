package listaExerciciosJava;

import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in); 
		
		int num; 
		
		System.out.println("Digite um número inteiro ");
		num = leia.nextInt(); 
		
		if(num <= 0) {
			System.out.println("Não é possível calcular com numero 0 e números negativos! ");
		}
		else if (num%2==0) {
			System.out.printf("O número é par e sua raiz quadrada é " +Math.sqrt(num));
		}
		else {
			System.out.printf("O número é impar e seu numero elevado ao quadrado é " +Math.pow(num, 2));
		}
	}

}
