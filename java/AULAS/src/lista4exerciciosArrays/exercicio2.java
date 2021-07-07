package lista4exerciciosArrays;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int dado[] = new int [10];
		int media = 0;
		int soma = 0;
		int maiorPontuacao = 0;
		int contador = 0;
		
		for (int x=0; x<10; x++) {
			System.out.printf("Digite um numero de 1 a 6: ", dado);
			dado[x] = leia.nextInt();
			
			
		}
		
		for ( int x=0; x<10; x++) {
			System.out.printf("\n Sua jogada foi %d: ",dado[x]);
			System.out.printf("\n A soma dos numeros foram %d: ", soma+= dado[10]);
			System.out.printf("\n A média foi %d: ",media = soma / 10);
				
		}
	
		
		
	
		
		
		
		
	}
}
