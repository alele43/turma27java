package lista2exercicios;

import java.util.Scanner;

public class exercicio2lista2 {
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int numHoras; 
		double horasExtras;
		double total;
		double extra;
		
		
		System.out.println("Digite quantas horas trabalhadas: ");
		numHoras =  leia.nextInt();
		
		horasExtras = Math.round(numHoras - 50);
		extra = Math.round(horasExtras*20);
		total = Math.round(numHoras * 10);
		
		System.out.printf("Seu sal�rio total � : %.2f " ,total);
		
		if (numHoras >50) {
			
			System.out.printf("Seu sal�rio extra ser� de:  %.2f reais",extra);
		}
		else {
			System.out.println("Voc� n�o realizou horas extras!");
		}
		
	}
}
