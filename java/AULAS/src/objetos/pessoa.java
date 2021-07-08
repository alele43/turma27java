package objetos;

public class pessoa {
	
	public String nome; //atributo
	public char sexo; //atributo
	public int anoNascimento; //atributo
	
	//metodo  sem retorno 
	public void mostrarIdade() {
		System.out.println(2021-anoNascimento);
		
		if((2021-anoNascimento) >=18) {
			System.out.println("Vc é adulto! ");
		} else {
			System.out.println("Vc é criança!");
		}
	}

		public int calcularIdade(int anoAtual) {
			//metodo com retorno de INTEIRO
			return anoAtual-anoNascimento;
			
		}
		

}

