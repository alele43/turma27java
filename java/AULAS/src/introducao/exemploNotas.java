package introducao;
import java.util.Scanner;


public class exemploNotas {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//String alunos[] = new String[4]; //vetores 0...3
		
		String alunos[] = {"JOAO", "MARCOS", "MARIA", "PEDRO"};
		
		
		System.out.println(alunos[3]);
		
		for(int x=0; x<alunos.length; x++) {
			System.out.println(alunos[x]);
		}
	}
}
