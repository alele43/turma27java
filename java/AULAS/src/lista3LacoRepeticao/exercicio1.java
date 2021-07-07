package lista3LacoRepeticao;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in); 
		
		//Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5.
		
		
	int x = 1 ; 
	int contador=1;
	 
	
		for (x = 1000; x <= 1999; x++) {
			if (x%11==5) {
				 contador++;
		        System.out.println(x);
		    }
		}
	
	
	
	}
}
