package listaExerciciosJava;

import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in); 
		
		int num; 
		
		System.out.println("Digite um n�mero inteiro ");
		num = leia.nextInt(); 
		
		if(num <= 0) {
			System.out.println("N�o � poss�vel calcular com numero 0 e n�meros negativos! ");
		}
		else if (num%2==0) {
			System.out.printf("O n�mero � par e sua raiz quadrada � " +Math.sqrt(num));
		}
		else {
			System.out.printf("O n�mero � impar e seu numero elevado ao quadrado � " +Math.pow(num, 2));
		}
	}

}
