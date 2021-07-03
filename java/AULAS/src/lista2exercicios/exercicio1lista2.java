package lista2exercicios;

import java.util.Scanner;

public class exercicio1lista2 {
	
	public static void main(String[] args) {
	
		Scanner leia = new Scanner (System.in);
			
			int pesoTomates;
			double E;
			double M;
			
			System.out.println("Qual o peso dos tomates em kg? ");
			pesoTomates =  leia.nextInt();
			
			E = Math.round(pesoTomates - 50);
			M = Math.round(E*4);
			
			if (pesoTomates >50) {
				System.out.printf("Pagar multa de %.2f reais" ,M);
			}
			else {
				System.out.println("ZERO! ");
			}
			
			
			
			
		}
		
}
