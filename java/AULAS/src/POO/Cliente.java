package POO;

public class Cliente {
	//atributos
	public String nome;
	public String pagamento;
	public boolean cartaoFidelidade;
	public String notaFiscal;
	public boolean cpf;

	
	//metodo
	public void formaDePagamento() {		
		if(cartaoFidelidade = true) {
			System.out.println("Voc� ganhou brindes! ");
		} else {
		System.out.println("Ah que pena! Voc� ganharia brindes se possuisse. ");
		}
	}
	
	public void cpfNotaFiscal() {
		if (cpf = true) {
		System.out.println("Seu cpf estar� na sua nota fsical ap�s o atendimento! ");
		} 
		else {
			System.out.println(" Ok! ");
			}
		}
}



