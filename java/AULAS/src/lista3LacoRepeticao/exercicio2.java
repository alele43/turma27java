package lista3LacoRepeticao;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in); 
		
		int x;
		int numeroPar =0;
		int numeroImpar =0;
		
		
		for (x=1; x <=10; x++) {
			System.out.println(x);
			if ((x%2)==0) {
				numeroPar++;
				
			}
			else if ((x%2)==1) {
				numeroImpar++;
				
			}
		
		} System.out.println("Foram: "+numeroPar+ " Pares e " +numeroImpar+ " Impares.");
		
		
	}
}