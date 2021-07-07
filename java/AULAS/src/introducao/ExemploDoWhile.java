package introducao;

import java.util.Scanner;

public class ExemploDoWhile {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in); 
		int numero;
		int x=1; //contador
		int aux=1; //variavel auxiliar
		
		System.out.println("Digite um numero positivo: ");
		numero = leia.nextInt();
		
		if (numero<=0) {
			System.out.println("Numero invalido!");
		}
		else if (numero == 1){
			System.out.println(" A soma de 1 é igual a 1! ");
		}
		else {
			do {
				// 1+2+3+4+5+6+7
				// aux=(aux+x)
				System.out.printf("%d + ",x);
				x++; //passo
				aux = aux +x;
			} while (x < numero);
			System.out.println(x);
			System.out.println(" = " + aux);
		}
	}
}
