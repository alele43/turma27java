package listaExerciciosJava;

import java.util.Scanner;

public class exercicio3 {
		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			
			
			int idade;
			
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			
			
			if (idade >= 10 && idade <= 14) {
				System.out.printf("Infantil ");
			}
			else if (idade >= 15 && idade <= 17) {
				System.out.printf("Juvenil ");
			}
			else {
				System.out.printf("Adulto ");
			}
				
			
		}	
}
