package lista4exerciciosArrays;
import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
	 Scanner leia = new Scanner(System.in);
	 
	 int n = 4;
	 int v[] =  new int[n];
	 int i;
	 
	 for (i=0; i<n; i++) {
		 System.out.printf( "Digite um numero: ", n);
		 v[i] = leia.nextInt();
		 
	 }
	
	 int maior = v[0];
	 
	 for (i=0; i<n; i++) {
		 if(v[i] > maior) 
			 maior = v[i];
		 
	 }
	 System.out.println("\n");
	 for (i=0; i<n; i++) {
		 if(v[i] == maior) {
			 System.out.printf("O maior valor é %d", maior);
		 }
	 }
 }
}
