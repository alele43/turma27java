package introducao;

public class TesteTemperatura {
		public static void main(String[] args) {
			//nome + F to C ((f-32) * (5/9) = C + 273,5) - impar
			
			String nome;
			double F, C, K;
			
			nome = "Ed";
			F = 300;
			
			C = Math.round(((F-32)/1.8)*100)/100.0; 
			K = Math.round(((C-273.15)/1.8)*100)/100.0;
			
			System.out.println("Olá, " + nome +"! A temperatura de hoje é: " +C+ "ºC e "+K+ "ºK");
				
		}
}
