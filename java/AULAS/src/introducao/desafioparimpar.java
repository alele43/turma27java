package introducao;

import java.util.Scanner;

public class desafioparimpar {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in); //adc scanner pra ler valor digitado no console
		
		int num; // declara��o variavel do tipo inteiro 
		
		System.out.println("Escolha um n�mero inteiro "); //imprimir fase na tela 
		num = leia.nextInt(); //comando ler e guardar dado digitado pelo usuario 
		
		if(num < 0) {
			System.out.println("N�o � poss�vel calcular com numero negativo ");
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
